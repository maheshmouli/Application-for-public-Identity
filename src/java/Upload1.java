/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


public class Upload1 extends HttpServlet {
String gkey,mkey,pkey;    
    int hhh;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession();
        List<String> ms = new ArrayList<String>();
        String finalimage = "";
        boolean isMultipart = ServletFileUpload.isMultipartContent(
                request);
        List<String> m = new ArrayList<String>();
        File savedFile;
        // System.out.println("requestss//: "+request);
        if (!isMultipart) {
            //System.out.println("File Not Uploaded");
        } else {
            FileItemFactory factory = new DiskFileItemFactory();
            ServletFileUpload upload = new ServletFileUpload(factory);
            List items = null;

            try {
                items = upload.parseRequest(request);
                //System.out.println("items: "+items);
            } catch (FileUploadException e) {
                e.printStackTrace();
            }
            Iterator itr = items.iterator();
            while (itr.hasNext()) {
                List<String> al = new ArrayList<String>();

                String sss = "";
                FileItem item = (FileItem) itr.next();
                String value = "";
                String a[];
                if (item.isFormField()) {
                    String name = item.getFieldName();
                    //System.out.println("name: "+name+'\n');
                    value = item.getString();
                    // System.out.println("value: "+value);
                    al.add(value);
                    for (int i = 0; i < al.size(); i++) {
                        sss += al.get(i);
                        System.out.println("is thios image" + sss);

     //System.out.println("the value sixcwe"+m.size());
                    }

                    a = sss.split("-");
                    for (int i = 0; i < a.length; i++) 
                    {

                        String am = a[i];
                        System.out.println("aaaaaaaaaaaaaaaa" + a[i]);
                        m.add(a[i]);
                    }
                } else {
                    String itemName = item.getName();
                    String reg = "[.*]";
                    String replacingtext = "";
                    // System.out.println("Text before replacing is:-" + itemName);
                    Pattern pattern = Pattern.compile(reg);
                    Matcher matcher = pattern.matcher(itemName);
                    StringBuffer buffer = new StringBuffer();

                    while (matcher.find()) {
                        matcher.appendReplacement(buffer, replacingtext);
                    }
                    int IndexOf = itemName.indexOf(".");
                    int Indexf = itemName.indexOf(".");
                    String domainName = itemName.substring(IndexOf);
                    Random generator = new Random();
  int r = Math.abs(generator.nextInt());
                    finalimage = buffer.toString() + domainName;
                    System.out.println("Final Image===" + finalimage);
                    ms.add(finalimage);
                    Random rr=new Random(100);
                    rr.nextInt();
                    ServletContext sc=request.getSession().getServletContext();
                    savedFile = new File(sc.getRealPath("apply")+"/" + finalimage);
                    try {
						item.write(savedFile);
                                        } catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
                                                 hhh = (int) savedFile.length();
					}

                }
            }
        }
        String strQuery = "";
        PrintWriter out=response.getWriter();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd"); 
	try {
            String uid=(String)session.getAttribute("iid");
            String name,dob,age,sex,place,state,pincode,country,fname,mname,hname,address,email,photo;
           name=m.get(0);
           dob=m.get(1);
           age=m.get(2);
           sex=m.get(3); 
           place=m.get(4);
           state=m.get(5);
           pincode=m.get(6);
           country=m.get(7);
           fname=m.get(8);
           mname=m.get(9);
           hname=m.get(10);
           address=m.get(11);
           email=m.get(12);
           System.out.println("emailllllll"+email);
           photo=ms.get(0);
          Class.forName("com.mysql.jdbc.Driver");
            Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/application","root","root");          
            String x="insert into vote(iid,uname,dob,age,sex,place,state,pincode,country,fname,mname,hname,address,photo,email)values('"+uid+"','"+name+"','"+dob+"','"+age+"','"+sex+"','"+place+"','"+state+"','"+pincode+"','"+country+"','"+fname+"','"+mname+"','"+hname+"','"+address+"','"+photo+"','"+email+"')";
            PreparedStatement ps1 = con.prepareStatement(x);
            ps1.executeUpdate();
        out.println("<script>"
				+"alert('Successfully Applied and check your mail for confirmation details')"
				+"</script>");
         RequestDispatcher rd=request.getRequestDispatcher("voter.jsp");
		rd.include(request, response);
        
        }
	catch(Exception e)
        {
            out.println("<script>"
				+"alert('Check your details-not uploaded successfully')"
				+"</script>");
            System.out.println(e);
            RequestDispatcher rd=request.getRequestDispatcher("voter.jsp");
		rd.include(request, response);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
