package send;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DLK
 */
public class mail 
{

        public void sendFromGMail(String from, String pass, String to, String subject, String message1) 
        {   final String username,password;  
        username=from;
        password=pass;
            Properties prop=new Properties();
            prop.put("mail.smtp.auth", "true");
            prop.put("mail.smtp.host", "smtp.gmail.com");
            prop.put("mail.smtp.port", "587");
            prop.put("mail.smtp.starttls.enable", "true");

          //  Session session;
            Session session = Session.getInstance(prop,new javax.mail.Authenticator() { 
                        protected PasswordAuthentication getPasswordAuthentication()
                        {
                            return new PasswordAuthentication(username, password);
                        }
                    });
          try {
                 String textBody = message1;
         Message message = new MimeMessage(session);
         message.setFrom(new InternetAddress("otpmessenger@gmail.com"));
                 message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(to));
        message.setSubject(subject);
                        message.setContent(textBody, "text/html");
            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    
}