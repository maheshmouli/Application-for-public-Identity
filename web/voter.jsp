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

			
        			<li ><a href="userhome.jsp"><i class="fa fa-home"></i> Home</a></li>
                                <li><a href="pan.jsp"><i class="fa fa-briefcase"></i> Pan card</a></li>
                                <li class="selected"><a href="voter.jsp"><i class="fa fa-briefcase"></i>Voter Id</a></li>
            			<li><a href="drive.jsp"><i class="fa fa-briefcase"></i>Driving License</a></li>
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



		<!--<section id="content" class="two-column with-right-sidebar">-->

	    <article>
		<%
                    String name=(String)session.getAttribute("name");
                    String email=(String)session.getAttribute("em");
                
                %>
                <img src="images/voter2.jpg" alt="" style="width: 341px;"/>
                <h3 style=" margin-left: 364px; margin-top: -164px;">Application for Voter Id Card</h3>
                <center style="margin-left: 358px">
                <form action="Upload1" method="post" enctype="multipart/form-data">
                    <table>
                        
                        
                   <tr><td>FullName</td><td><input type="text" name="uname" required="required"/></td></tr>
                   <tr><td>D.O.B</td> <td><input type="text" name="date" style="margin: 0px; width: 197px; " required="required"/></td></tr>
                   <tr><td>Age</td><td><input type="text" name="age" required="required"/></td></tr>
                   <tr><td>Sex</td><td><input type="radio" name="sex" value="male" required="required"/>Male<input type="radio" name="sex" value="female" required="required"/>FeMale</td></tr>
                   <tr><td style="width: 120px;">Place of Birth</td> <td><input type="text" name="place" required="required"/></td></tr>
                   <tr><td>State</td> <td><input type="text" name="state" required="required"/></td></tr>
                   <tr><td>Pincode</td> <td><input type="text" name="pin" required="required"/></td></tr>
                   <tr><td>country</td> <td><input type="text" name="country" required="required"/></td></tr>
                   <tr><td>Father Name</td> <td><input type="text" name="fname" required="required"/></td></tr>
                   <tr><td>Mother Name</td> <td><input type="text" name="mname" required="required"/></td></tr>
                   <tr><td>Husband Name</td> <td><input type="text" name="hname" required="required"/></td></tr>
                   <tr><td>Full Address</td> <td><textarea name="address" style="margin: 0px; width: 197px; height: 76px;"></textarea></td></tr>
                   <tr><td>Email</td> <td> <input type="email" name="em"/></td></tr>
                   <tr><td>Photo</td> <td><input type="file" name="photo" required="required"/></td></tr>
                   
                   <tr><td>Declaration</td><br>
                       <td><p>I, the Applicant, in the capacity of Himself/Herself do hereby declare that what is stated above is true to the best of my knowledge of my information and belief. </p></td></tr>
                
                    <tr><td align="center" colspan="2"><input type="submit" value="Apply"/></td></tr>
                    </table>
                    
                </form>
                    </center>
                    
                
                <br><br><br><br>
                        
            </article>
	
		
        <!--</section>-->
        
        
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