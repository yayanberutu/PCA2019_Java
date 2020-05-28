package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class proses_005fasrama_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("    ");
 
            
      String nim = request.getParameter("nim"); 
      String jk = request.getParameter("jk");
      if(jk.equals("Laki-laki")){
          try{
               String className ="com.mysql.jdbc.Driver";
               Class.forName(className);
               System.out.println("Driver loaded successfully");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pca2019", "root", "");
               Statement st=con.createStatement();
               String sql = "SELECT id FROM kamar WHERE anggota !=maks AND asrama_id = 1 LIMIT 1";
               ResultSet rs = st.executeQuery(sql);
               String kamar = "";
               while(rs.next()){
                   kamar = rs.getString("id");
               } 
                   
               sql = "UPDATE mahasiswa SET status_kedatangan=1, kamar_id="+kamar+", updated_at = NOW() WHERE nim='"+nim+"'";
               st.executeUpdate(sql);
               sql = "UPDATE kamar SET anggota = anggota + 1 WHERE id="+kamar;
               st.execute(sql);
          }
          catch(Exception e){
            out.print(e.getMessage());}
          finally{
            System.out.println("error connection");  }
         }
      else {
          try{
              String className ="com.mysql.jdbc.Driver";
              Class.forName(className);
              System.out.println("Driver loaded successfully");
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pca2019", "root", "");
              Statement st=con.createStatement();
              String sql = "SELECT id FROM kamar WHERE anggota !=maks AND asrama_id != 1 LIMIT 1";
              ResultSet rs = st.executeQuery(sql);
              String kamar = "";
              while(rs.next()){
                  kamar = rs.getString("id");
              }
              sql = "UPDATE mahasiswa SET status_kedatangan=1, kamar_id="+kamar+", updated_at = NOW() WHERE nim='"+nim+"'";
              st.executeUpdate(sql);
              sql = "UPDATE kamar SET anggota = anggota + 1 WHERE id="+kamar;
              st.execute(sql);
          }
          catch(Exception e){
            out.print(e.getMessage());}
          finally{
            System.out.println("error connection");  }
         }
          
      }

      String site = new String("Home.jsp");
         response.setStatus(response.SC_MOVED_TEMPORARILY);
         response.setHeader("Location", site); 

    
      out.write('\n');
      out.write('\n');
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
