package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("  <a class=\"navbar-brand\" href=\"Home.jsp\">PCA20</a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNavAltMarkup\" aria-controls=\"navbarNavAltMarkup\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarNavAltMarkup\">\r\n");
      out.write("    <div class=\"navbar-nav\">\r\n");
      out.write("      <a class=\"nav-item nav-link active\" href=\"Home.jsp\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("      <a class=\"nav-item nav-link\" href=\"Aspa.jsp\">Kamar Aspa</a>\r\n");
      out.write("      <a class=\"nav-item nav-link\" href=\"Aspi.jsp\">Kamar Aspi</a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("            \r\n");
      out.write("    ");

    try
    {
        String className ="com.mysql.jdbc.Driver";
        Class.forName(className);
        System.out.println("Driver loaded successfully");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pca2019", "root", "");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM mahasiswa ORDER BY status_kedatangan DESC");

    
      out.write("\r\n");
      out.write("    <table class=\"table table-striped\">\r\n");
      out.write("\r\n");
      out.write("  <thead>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"col\">No Pendaftaran</th>\r\n");
      out.write("      <th scope=\"col\">Nama</th>\r\n");
      out.write("      <th scope=\"col\">Prodi</th>\r\n");
      out.write("      <th scope=\"col\">JK</th>\r\n");
      out.write("      <th scope=\"col\">Status Kedatangan</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </thead>\r\n");
      out.write("  <tbody>\r\n");
      out.write("      ");
while(rs.next()){
          
      out.write("\r\n");
      out.write("          <tr>\r\n");
      out.write("              <th scope=\"row\">");
      out.print(rs.getString("nim") );
      out.write("</th>\r\n");
      out.write("              <td>");
      out.print(rs.getString("nama") );
      out.write("</td>\r\n");
      out.write("              <td>");
      out.print(rs.getString("prodi") );
      out.write("</td>\r\n");
      out.write("              <td>");
      out.print(rs.getString("jeniskelamin") );
      out.write("</td>\r\n");
      out.write("              <td>\r\n");
      out.write("                  ");
if(rs.getBoolean("status_kedatangan")== false){
                    
      out.write("\r\n");
      out.write("  <center><a href=\"proses_asrama.jsp?nim=");
      out.print( rs.getString("nim") );
      out.write("&jk=");
      out.print( rs.getString("jeniskelamin") );
      out.write("\" class=\"btn btn-success\">Datang</a></center>\r\n");
      out.write("                  ");

                  } 
                    else {
                    
      out.write("\r\n");
      out.write("                     Sudah Datang\r\n");
      out.write("                    ");


                   }
                  
                  
      out.write(" \r\n");
      out.write("              </td>\r\n");
      out.write("          </tr>\r\n");
      out.write("      ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("    ");
}
    catch(Exception e){
        out.print(e.getMessage());
      out.write("<br>");

    }
    finally{
          System.out.println("error connection");  }
    
      out.write("\r\n");
      out.write("    </body>\r\n");
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
