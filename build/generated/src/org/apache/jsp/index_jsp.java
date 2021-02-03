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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <title>Register</title>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\" />\r\n");
      out.write("        <link\r\n");
      out.write("          rel=\"stylesheet\"\r\n");
      out.write("          href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\"\r\n");
      out.write("        />\r\n");
      out.write("        <link\r\n");
      out.write("          href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\"\r\n");
      out.write("          rel=\"stylesheet\"\r\n");
      out.write("          id=\"bootstrap-css\"\r\n");
      out.write("        />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./styles.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"wrapper\">\r\n");
      out.write("          <header>\r\n");
      out.write("            <nav>\r\n");
      out.write("              <div class=\"menu-icon\">\r\n");
      out.write("                <i class=\"fa fa-bars fa-2x\"></i>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"logo\">Student Checkeer</div>\r\n");
      out.write("              <div class=\"menu\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                  <li><a href=\"#\">Home</a></li>\r\n");
      out.write("                  <li><a href=\"#\">About</a></li>\r\n");
      out.write("                  <li><a href=\"#\">Blog</a></li>\r\n");
      out.write("                  <li><a href=\"#\">Contact</a></li>\r\n");
      out.write("                  <li><a href=\"#\">Contact</a></li>\r\n");
      out.write("                  <li><a href=\"#\">Contact</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("          </header>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"w3-container\">\r\n");
      out.write("          <form\r\n");
      out.write("            class=\"form-horizontal\"\r\n");
      out.write("            id=\"registration\"\r\n");
      out.write("            method=\"POST\"\r\n");
      out.write("            action=\"upload\"\r\n");
      out.write("            enctype=\"multipart/form-data\"\r\n");
      out.write("          >\r\n");
      out.write("            <fieldset>\r\n");
      out.write("              <legend>Registration Form</legend>\r\n");
      out.write("              <div class=\"control-group\">\r\n");
      out.write("                <label class=\"control-label\">Name:</label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                  <input type=\"text\" id=\"username\" name=\"name\" />\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"control-group\">\r\n");
      out.write("                <label class=\"control-label\">SCHOOL:</label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                  <input type=\"text\" id=\"school\" name=\"school\" />\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"control-group\">\r\n");
      out.write("                <label class=\"control-label\">FACULITY:</label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                  <input type=\"text\" id=\"faculity\" name=\"faculity\" />\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"control-group\">\r\n");
      out.write("                <label class=\"control-label\">Level:</label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                  <select name=\"level\" id=\"levels\">\r\n");
      out.write("                    <option value=\"volvo\" disabled selected>Year of study</option>\r\n");
      out.write("                    <option value=\"1\">Year 1</option>\r\n");
      out.write("                    <option value=\"2\">year 2</option>\r\n");
      out.write("                    <option value=\"3\">year 3</option>\r\n");
      out.write("                    <option value=\"4\">year 4</option>\r\n");
      out.write("                    <option value=\"5\">year 5</option>\r\n");
      out.write("                  </select>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"control-group\">\r\n");
      out.write("                <label class=\"control-label\">Registration number</label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                  <input\r\n");
      out.write("                    type=\"number\"\r\n");
      out.write("                    min=\"216000000\"\r\n");
      out.write("                    id=\"reg_number\"\r\n");
      out.write("                    name=\"reg_number\"\r\n");
      out.write("                  />\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"control-group\">\r\n");
      out.write("                <label class=\"control-label\">Upload your Photo</label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                  <input type=\"file\" value=\"upload photo\" id=\"photo\" name=\"photo\" />\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"control-group\">\r\n");
      out.write("                <label class=\"control-label\"></label>\r\n");
      out.write("                <div class=\"controls\">\r\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-success\" onsubmit=\"doGet()\">Submit</button>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </fieldset>\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("  </body>\r\n");
      out.write("    <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.js\"></script>\r\n");
      out.write("    <script src=\"javascript.js\"></script>\r\n");
      out.write("</html>\r\n");
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
