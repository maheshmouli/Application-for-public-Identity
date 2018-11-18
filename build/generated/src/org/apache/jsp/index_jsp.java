package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Application Form</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/styles.css\" type=\"text/css\" />\n");
      out.write("<link href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("<script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("<![endif]-->\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/slider.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/superfish.js\"></script>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"js/custom.js\"></script>\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, minimum-scale=1.0, maximum-scale=1.0\" />\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("minibiz, a free CSS web template by ZyPOP (zypopwebtemplates.com/)\n");
      out.write("\n");
      out.write("Download: http://zypopwebtemplates.com/\n");
      out.write("\n");
      out.write("License: Creative Commons Attribution\n");
      out.write("//-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"container\" class=\"width\">\n");
      out.write("\n");
      out.write("    <header> \n");
      out.write("\t<div class=\"width\">\n");
      out.write("\n");
      out.write("    \t\t<h1><a href=\"/\">Online<strong>Application</strong></a></h1>\n");
      out.write("\n");
      out.write("\t\t<nav>\n");
      out.write("\t\n");
      out.write("    \t\t\t<ul class=\"sf-menu dropdown\">\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("        \t\t\t<li class=\"selected\"><a href=\"index.jsp\"><i class=\"fa fa-home\"></i> Home</a></li>\n");
      out.write("                                <li><a href=\"admin.jsp\"><i class=\"fa fa-briefcase\"></i> Admin</a></li>\n");
      out.write("                                <li><a href=\"user.jsp\"><i class=\"fa fa-database\"></i> User</a></li>\n");
      out.write("            \t\t\t\n");
      out.write("       \t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"clear\"></div>\n");
      out.write("    \t\t</nav>\n");
      out.write("       \t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("       \n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div id=\"intro\">\n");
      out.write("\n");
      out.write("\t<div class=\"width\">\n");
      out.write("      \n");
      out.write("\t\t<div class=\"intro-content\">\n");
      out.write("                   \n");
      out.write("                    <h3>Apply for New Pan</h3><h3>Application for Driving License</h3><h3>Apply for Voter ID</h3>\n");
      out.write("                    \n");
      out.write("                                  \t\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("            \t</div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("    <div id=\"body\" class=\"width\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<section id=\"content\" class=\"two-column with-right-sidebar\">\n");
      out.write("\n");
      out.write("\t    <article>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<h3>Online Application</h3>\n");
      out.write("\t\t\t\n");
      out.write("                        <p align=\"justify\">If you are an Individual, have never applied for PAN CARD and do not hold any PAN CARD number can apply here by using this application</p>\n");
      out.write("                        <p align=\"justify\">Individuals those who have age above 18 can apply for Voter Id here by using this service portal</p>\n");
      out.write("                        <p>You can apply for Driving License here by registering on to this portal.</p>\n");
      out.write("            </article>\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    \t<div class=\"clear\"></div>\n");
      out.write("    </div>\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"footer-content width\">\n");
      out.write("            <ul>\n");
      out.write("            \t<li><h4>Proin accumsan</h4></li>\n");
      out.write("                <li><a href=\"#\">Rutrum nulla a ultrices</a></li>\n");
      out.write("                <li><a href=\"#\">Blandit elementum</a></li>\n");
      out.write("                <li><a href=\"#\">Proin placerat accumsan</a></li>\n");
      out.write("                <li><a href=\"#\">Morbi hendrerit libero </a></li>\n");
      out.write("                <li><a href=\"#\">Curabitur sit amet tellus</a></li>\n");
      out.write("            </ul>\n");
      out.write("            \n");
      out.write("            <ul>\n");
      out.write("            \t<li><h4>Condimentum</h4></li>\n");
      out.write("                <li><a href=\"#\">Curabitur sit amet tellus</a></li>\n");
      out.write("                <li><a href=\"#\">Morbi hendrerit libero </a></li>\n");
      out.write("                <li><a href=\"#\">Proin placerat accumsan</a></li>\n");
      out.write("                <li><a href=\"#\">Rutrum nulla a ultrices</a></li>\n");
      out.write("                <li><a href=\"#\">Cras dictum</a></li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write(" \t    <ul>\n");
      out.write("                <li><h4>Suspendisse</h4></li>\n");
      out.write("                <li><a href=\"#\">Morbi hendrerit libero </a></li>\n");
      out.write("                <li><a href=\"#\">Proin placerat accumsan</a></li>\n");
      out.write("                <li><a href=\"#\">Rutrum nulla a ultrices</a></li>\n");
      out.write("                <li><a href=\"#\">Curabitur sit amet tellus</a></li>\n");
      out.write("                <li><a href=\"#\">Donec in ligula nisl.</a></li>\n");
      out.write("            </ul>\n");
      out.write("            \n");
      out.write("            <ul class=\"endfooter\">\n");
      out.write("            \t<li><h4>Suspendisse</h4></li>\n");
      out.write("                <li>Integer mattis blandit turpis, quis rutrum est. Maecenas quis arcu vel felis lobortis iaculis fringilla at ligula. Nunc dignissim porttitor dolor eget porta. <br /><br />\n");
      out.write("\n");
      out.write("<div class=\"social-icons\">\n");
      out.write("\n");
      out.write("<a href=\"#\"><i class=\"fa fa-facebook fa-2x\"></i></a>\n");
      out.write("\n");
      out.write("<a href=\"#\"><i class=\"fa fa-twitter fa-2x\"></i></a>\n");
      out.write("\n");
      out.write("<a href=\"#\"><i class=\"fa fa-youtube fa-2x\"></i></a>\n");
      out.write("\n");
      out.write("<a href=\"#\"><i class=\"fa fa-instagram fa-2x\"></i></a>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</li>\n");
      out.write("            </ul>\n");
      out.write("            \n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer-bottom\">\n");
      out.write("             </div>\n");
      out.write("    </footer>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
