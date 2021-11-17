package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>JSP Page</title>\n");
      out.write("<h1><center>REGISTRATION FORM</center></h1>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<form action=\"NewServlet\" method=\"post\">\n");
      out.write("<table style=\"with: 50%\" align='center'>\n");
      out.write("<tr>\n");
      out.write("<td>Enrollment No.</td>\n");
      out.write("<td><input type=\"text\" name=\"Student_ID\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Name</td>\n");
      out.write("<td><input type=\"text\" name=\"Student_Name\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Age</td>\n");
      out.write("<td><input type=\"text\" name=\"Age\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Address</td>\n");
      out.write("<td><input type=\"text\" name=\"Address\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Branch</td>\n");
      out.write("<td><input type=\"text\" name=\"Branch\" /></td>\n");
      out.write("</tr></table>\n");
      out.write("<center>\n");
      out.write("<input type=\"submit\" value=\"Insert\" name=\"submit\">\n");
      out.write("<input type=\"submit\" value=\"Delete\" name=\"submit\">\n");
      out.write("<input type=\"submit\" value=\"Update\" name=\"submit\">\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<tr>\n");
      out.write("<td>Table name</td>\n");
      out.write("<td><input type=\"text\" name=\"tabl\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td>Database name</td>\n");
      out.write("<td><input type=\"text\" name=\"dbname\" /></td>\n");
      out.write("</tr>\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<input type=\"submit\" value=\"Create table\" name=\"submit\">\n");
      out.write("<input type=\"submit\" value=\"Delete table\" name=\"submit\">\n");
      out.write("<input type=\"submit\" value=\"Create database\" name=\"submit\">\n");
      out.write("<input type=\"submit\" value=\"Delete database\" name=\"submit\">\n");
      out.write("</form>\n");
      out.write("</center>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
