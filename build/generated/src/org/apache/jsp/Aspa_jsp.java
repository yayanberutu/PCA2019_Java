package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class Aspa_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("        \n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">PCA20</a>\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNavAltMarkup\" aria-controls=\"navbarNavAltMarkup\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarNavAltMarkup\">\n");
      out.write("        <div class=\"navbar-nav\">\n");
      out.write("          <a class=\"nav-item nav-link\" href=\"Home.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("          <a class=\"nav-item nav-link active\" href=\"Aspa.jsp\">Kamar Aspa</a>\n");
      out.write("          <a class=\"nav-item nav-link\" href=\"Aspi.jsp\">Kamar Aspi</a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("        \n");
      out.write("    ");

        
    try
    {
        String className ="com.mysql.jdbc.Driver";
        Class.forName(className);
        System.out.println("Driver loaded successfully");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pca2019", "root", "");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("SELECT nama AS 'kamar', lantai, anggota, (SELECT asrama.nama FROM asrama WHERE asrama.id = kamar.asrama_id) AS 'asrama' FROM kamar WHERE asrama_id=1 ORDER BY id");
    
      out.write("\n");
      out.write("    \n");
      out.write("    <table class=\"table\">\n");
      out.write("  <thead>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"col\">Kamar</th>\n");
      out.write("      <th scope=\"col\">lantai</th>\n");
      out.write("      <th scope=\"col\">Anggota</th>\n");
      out.write("      <th scope=\"col\">Asrama</th>\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("    <tr>\n");
      out.write("        <th scope=\"row\">");
      out.print(rs.getString("kamar"));
      out.write("</th>\n");
      out.write("      <td>");
      out.print(rs.getString("lantai"));
      out.write("</td>\n");
      out.write("      <td>");
      out.print(rs.getString("anggota"));
      out.write("</td>\n");
      out.write("      <td>");
      out.print(rs.getString("asrama"));
      out.write("</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">2</th>\n");
      out.write("      <td>Jacob</td>\n");
      out.write("      <td>Thornton</td>\n");
      out.write("      <td>@fat</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">3</th>\n");
      out.write("      <td>Larry</td>\n");
      out.write("      <td>the Bird</td>\n");
      out.write("      <td>@twitter</td>\n");
      out.write("    </tr>\n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <table border=1 align=center style=\"text-align:center\">\n");
      out.write("      <thead>\n");
      out.write("          <tr>\n");
      out.write("             <th>Kode Mata Kuliah</th>\n");
      out.write("             <th>Nama Mata Kuliah</th>\n");
      out.write("             <th>SKS</th>\n");
      out.write("             <th>Semester</th>\n");
      out.write("          </tr>\n");
      out.write("      </thead>\n");
      out.write("      <tbody>\n");
      out.write("        ");
while(rs.next())
        {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(rs.getString("ID_MATKUL") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("NAMA_MATKUL") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("SKS") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("Semester") );
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("           </tbody>\n");
      out.write("        </table><br>\n");
      out.write("    ");
}
    catch(Exception e){
        out.print(e.getMessage());
      out.write("<br>");

    }
    finally{
          System.out.println("error connection");  }
    
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
