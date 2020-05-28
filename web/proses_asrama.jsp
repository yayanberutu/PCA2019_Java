<%-- 
    Document   : proses_asrama
    Created on : May 28, 2020, 5:52:10 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <%@page import="java.sql.*;"%>
    <% 
            
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

      String site = new String("Home.jsp");
         response.setStatus(response.SC_MOVED_TEMPORARILY);
         response.setHeader("Location", site); 

    %>

