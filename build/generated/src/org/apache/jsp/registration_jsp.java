package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("   <head>\n");
      out.write("      <meta charset=\"UTF-8\">\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("      <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("      <title>Registration</title>\n");
      out.write("      <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("     <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\" />\n");
      out.write(" <script src=\"https://code.jquery.com/jquery-3.3.1.js\"></script>\n");
      out.write("   </head>\n");
      out.write("   <body>\n");
      out.write("      <div class=\"wrapper\">\n");
      out.write("         <header>\n");
      out.write("            <nav>\n");
      out.write("               <div class=\"menu-icon\">\n");
      out.write("                  <i class=\"fa fa-bars fa-2x\"></i>\n");
      out.write("               </div>\n");
      out.write("               <div class=\"logo\">\n");
      out.write("                  <img src=\"https://res.cloudinary.com/http-voicetoworld-netlify-app/image/upload/v1611742348/University_of_Rwanda_-_LOGO_ihplup.ico\" />\n");
      out.write("               </div>\n");
      out.write("               <div class=\"menu\">\n");
      out.write("                  <ul>\n");
      out.write("                     <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                     <li><a href=\"register.jsp\">Register</a></li>\n");
      out.write("\n");
      out.write("                    <li>\n");
      out.write("        <form class=\"search\" action=\"\">\n");
      out.write("         \n");
      out.write("  <input type=\"text\" name=\"search\" placeholder=\"Search..\">\n");
      out.write("</form>\n");
      out.write("                    </li>\n");
      out.write("                  </ul>\n");
      out.write("               </div>\n");
      out.write("            </nav>\n");
      out.write("         </header>\n");
      out.write("      </div>\n");
      out.write("       <section>\n");
      out.write("       <div class=\"w3-container\">\n");
      out.write("          <form\n");
      out.write("            class=\"form-horizontal\"\n");
      out.write("            id=\"registration\"\n");
      out.write("            method=\"POST\"\n");
      out.write("            action=\"userController\"\n");
      out.write("          >\n");
      out.write("            <fieldset>\n");
      out.write("              <legend>Registration Form</legend>\n");
      out.write("              <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\">Name:</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                  <input type=\"text\" id=\"username\" name=\"name\" />\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\">SCHOOL:</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                  <input type=\"text\" id=\"school\" name=\"school\" />\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\">FACULITY:</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                  <input type=\"text\" id=\"faculity\" name=\"faculity\" />\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\">Level:</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                  <select name=\"level\" id=\"levels\">\n");
      out.write("                    <option value=\"volvo\" disabled selected>Year of study</option>\n");
      out.write("                    <option value=\"1\">Year 1</option>\n");
      out.write("                    <option value=\"2\">year 2</option>\n");
      out.write("                    <option value=\"3\">year 3</option>\n");
      out.write("                    <option value=\"4\">year 4</option>\n");
      out.write("                    <option value=\"5\">year 5</option>\n");
      out.write("                  </select>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\">Registration number</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                  <input\n");
      out.write("                    type=\"number\"\n");
      out.write("                    min=\"216000000\"\n");
      out.write("                    id=\"reg_number\"\n");
      out.write("                    name=\"reg_number\"\n");
      out.write("                  />\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"control-group\">\n");
      out.write("                \n");
      out.write("                <label class=\"control-label\">Upload your Photo</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                  <input type=\"file\"  name=\"photo\" >\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"control-group\">\n");
      out.write("                <label class=\"control-label\"></label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-success\" onsubmit=\"doGet()\">Submit</button>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </fieldset>\n");
      out.write("          </form>\n");
      out.write("        </div>   \n");
      out.write("       </section>\n");
      out.write("       <script src=\"javascript.js\"></script>\n");
      out.write("   </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
