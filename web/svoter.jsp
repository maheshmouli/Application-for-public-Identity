<%@page import="java.sql.*"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Application Form</title>


<link rel="stylesheet" href="css/reset.css" type="text/css" />
<link rel="stylesheet" href="css/styles.css" type="text/css" />
<link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">


<!--[if lt IE 9]>
<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->

<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/slider.js"></script>
<script type="text/javascript" src="js/superfish.js"></script>

<script type="text/javascript" src="js/custom.js"></script>

<meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0" />

<!--
minibiz, a free CSS web template by ZyPOP (zypopwebtemplates.com/)

Download: http://zypopwebtemplates.com/

License: Creative Commons Attribution
//-->
</head>
<body>
<div id="container" class="width">

    <header> 
	<div class="width">

    		<h1><a href="/">Online<strong>Application</strong></a></h1>

		<nav>
	
    			<ul class="sf-menu dropdown">

			
        			<li ><a href="adminhome.jsp"><i class="fa fa-home"></i> Home</a></li>
                                <li ><a href="span.jsp"><i class="fa fa-briefcase"></i>Applicants for Pan card</a></li>
                                <li class="selected" ><a href="svoter.jsp"><i class="fa fa-briefcase"></i>Applicants for Voter Id</a></li>
            			<li><a href="sdrive.jsp"><i class="fa fa-briefcase"></i>Applicants for Driving License</a></li>
                                <li><a href="index.jsp"><i class="fa fa-briefcase"></i>logout</a></li>
       			</ul>

			
			<div class="clear"></div>
    		</nav>
       	</div>

	<div class="clear"></div>

       
    </header>


    <div id="intro">

	<div class="width">
      
		<div class="intro-content">
                   
                    <h3>Apply for New Pan</h3><h3>Application for Driving License</h3><h3>Apply for Voter ID</h3>
                    
                                  	
			

            	</div>
                
            </div>
            

	</div>

    <div id="body" class="width">



		<section id="content" class="two-column with-right-sidebar">

	    <article style="margin-left: 345px;  color: rgb(0, 0, 0);">
                        <center>
                         <%
      try{
      %>
     <table id="pro_display_table" border="0" cellspacing="1px"  style="border: 4px solid #d01e70;width: 603px;margin-left: -212px;height: auto;">
                                 <tr>
    <th scope="row">&nbsp;</th>
    <td>&nbsp;</td>
  </tr>
         <tr>  
                                    <td align="center" style="color:#0D72BD;font-weight: bold;font-size: 17px;"><b><strong>&nbsp;&nbsp;Name</strong></b></td>
                                    <td align="center" style="color:#0D72BD;font-weight: bold;font-size: 17px;"><b><strong>&nbsp;&nbsp;DOB</strong></b></td>
                                    <td align="center" style="color:#0D72BD;font-weight: bold;font-size: 17px;"><b><strong>&nbsp;&nbsp;Age</strong></b></td>

                                    <td align="center" style="color:#0D72BD;font-weight: bold;font-size: 17px;"><b><strong>&nbsp;&nbsp;Place</strong></b></td>
                                    <td align="center" style="color:#0D72BD;font-weight: bold;font-size: 17px;"><b><strong>&nbsp;&nbsp;State</strong></b></td>
                                    <td align="center" style="color:#0D72BD;font-weight: bold;font-size: 17px;"><b><strong>&nbsp;&nbsp;FatherName</strong></b></td>
                                    <td align="center" style="color:#0D72BD;font-weight: bold;font-size: 17px;"><b><strong>&nbsp;&nbsp;Address</strong></b></td>
                                    <td align="center" style="color:#0D72BD;font-weight: bold;font-size: 17px;"><b><strong>&nbsp;&nbsp;Proof</strong></b></td>
                                    <td align="center" style="color:#0D72BD;font-weight: bold;font-size: 17px;"><b><strong>&nbsp;&nbsp;Status</strong></b></td>
                                    
                                    
                                    
                                    
                                </tr>
         <tr>
    <th scope="row">&nbsp;</th>
    <td>&nbsp;</td>
  </tr>
<%                        
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/application", "root", "root");
                        String q="select * from vote where status='De-Active'";
                        PreparedStatement pst=con.prepareStatement(q);
                        ResultSet rst=pst.executeQuery();
                        String id,email;
                        while(rst.next())
                                      {
                                         id=rst.getString("iid");
                                         email=rst.getString("email");
                                         System.out.println(email);
                                         System.out.println(id);
                                          
                                         
                                          %>
                                <tr>                                  
                                    <td align="center" style="color:#080606;font-weight: bold;">&nbsp;&nbsp;<%=rst.getString("uname")%></td>
                                    <td align="center" style="color:#080606;font-weight: bold;">&nbsp;&nbsp;<%=rst.getString("dob")%></td>
                                    <td align="center" style="color:#080606;font-weight: bold;">&nbsp;&nbsp;<%=rst.getString("age")%></td>
                                   
                                    <td align="center" style="color:#080606;font-weight: bold;">&nbsp;&nbsp;<%=rst.getString("place")%></td>
                                    <td align="center" style="color:#080606;font-weight: bold;">&nbsp;&nbsp;<%=rst.getString("state")%></td>
                                    <td align="center" style="color:#080606;font-weight: bold;">&nbsp;&nbsp;<%=rst.getString("fname")%></td>
                                    <td align="center" style="color:#080606;font-weight: bold;">&nbsp;&nbsp;<%=rst.getString("address")%></td>
                                    <td align="center" style="color:#080606;font-weight: bold;">&nbsp;&nbsp;<%=rst.getString("photo")%></td>
                                    
                                    <td align="center" style="color:#080606;font-weight: bold;">&nbsp;&nbsp;<a href="accept2.jsp?uid=<%=rst.getString("id")%>&&email=<%=email%>">Accept</a></td>
 <tr>
    <th scope="row">&nbsp;</th>
    <td>&nbsp;</td>
  </tr>
                                    <%}%>
              </table>
     <%//}
                                     
   }catch(Exception e){
   System.out.println(e);
   }
   %>    
                                  </center>
                        
                        

                    </article>
		
        </section>
        
        
    	<div class="clear"></div>
    </div>
    <footer>
        <div class="footer-content width">
            <ul>
            	<li><h4>Proin accumsan</h4></li>
                <li><a href="#">Rutrum nulla a ultrices</a></li>
                <li><a href="#">Blandit elementum</a></li>
                <li><a href="#">Proin placerat accumsan</a></li>
                <li><a href="#">Morbi hendrerit libero </a></li>
                <li><a href="#">Curabitur sit amet tellus</a></li>
            </ul>
            
            <ul>
            	<li><h4>Condimentum</h4></li>
                <li><a href="#">Curabitur sit amet tellus</a></li>
                <li><a href="#">Morbi hendrerit libero </a></li>
                <li><a href="#">Proin placerat accumsan</a></li>
                <li><a href="#">Rutrum nulla a ultrices</a></li>
                <li><a href="#">Cras dictum</a></li>
            </ul>

 	    <ul>
                <li><h4>Suspendisse</h4></li>
                <li><a href="#">Morbi hendrerit libero </a></li>
                <li><a href="#">Proin placerat accumsan</a></li>
                <li><a href="#">Rutrum nulla a ultrices</a></li>
                <li><a href="#">Curabitur sit amet tellus</a></li>
                <li><a href="#">Donec in ligula nisl.</a></li>
            </ul>
            
            <ul class="endfooter">
            	<li><h4>Suspendisse</h4></li>
                <li>Integer mattis blandit turpis, quis rutrum est. Maecenas quis arcu vel felis lobortis iaculis fringilla at ligula. Nunc dignissim porttitor dolor eget porta. <br /><br />

<div class="social-icons">

<a href="#"><i class="fa fa-facebook fa-2x"></i></a>

<a href="#"><i class="fa fa-twitter fa-2x"></i></a>

<a href="#"><i class="fa fa-youtube fa-2x"></i></a>

<a href="#"><i class="fa fa-instagram fa-2x"></i></a>

</div>

</li>
            </ul>
            
            <div class="clear"></div>
        </div>
        <div class="footer-bottom">
             </div>
    </footer>
</div>
</body>
</html>