/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DLK
 */
public class Ulogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            HttpSession session = request.getSession();
            String name, pass;
            name=request.getParameter("u");
            pass=request.getParameter("p");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/application","root","root");
            String sql="select * from user where name='"+name+"' and pass='"+pass+"'";
            PreparedStatement pss=con.prepareStatement(sql);
            ResultSet rss = pss.executeQuery();
            String id,uname, email;
            if(rss.next())
            {
                id=rss.getString("id");
                uname=rss.getString("name");
                email=rss.getString("email");
                session.setAttribute("iid",id); 
                session.setAttribute("name",uname);
                session.setAttribute("em",email);
                 
                
                out.println("<script>"
                        +"alert('Valid User')"
                        +"</script>");
                RequestDispatcher rd=request.getRequestDispatcher("userhome.jsp");
                rd.include(request, response);
            }
            else
            {
                out.println("<script>"
                        +"alert('Invalid Username or password')"
                        +"</script>");
                RequestDispatcher rd=request.getRequestDispatcher("user.jsp");
                rd.include(request, response);    
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Ulogin.class.getName()).log(Level.SEVERE, null, ex);
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
