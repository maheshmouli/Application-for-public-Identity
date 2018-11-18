<%-- 
    Document   : accept3
    Created on : Feb 5, 2018, 7:14:25 PM
    Author     : DLK
--%>

<%@page import="send.mail"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
       String fid, to;
       fid=request.getParameter("uid");
       System.out.println("user id"+fid);
       to=request.getParameter("email");
       System.out.println("mail email"+to);
       
       Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/application","root","root");
String sql="update license set status='Active' where id='"+fid+"' and status='De-Active' ";
PreparedStatement pss=con.prepareStatement(sql);
pss.executeUpdate();
mail mm = new mail();
            String from,pass,subject,message;
             from="otpmessenger";
             pass="qawsedrftg";
             subject="ConfirmationMail";
             message="Your application has been accepted and soon you will get your License";
             mm.sendFromGMail(from, pass, to, subject, message);
out.println("<script>"
                        +"alert('Accepted')"
                        +"</script>");
RequestDispatcher rd=request.getRequestDispatcher("svoter.jsp");
                rd.include(request, response);
        %>
    </body>
</html>
