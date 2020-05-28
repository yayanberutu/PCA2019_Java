<%-- 
    Document   : Aspi
    Created on : May 28, 2020, 4:37:11 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <%@page import="java.sql.*;"%>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
          <a class="navbar-brand" href="Home.jsp">PCA20</a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
            <div class="navbar-nav">
              <a class="nav-item nav-link" href="Home.jsp">Home <span class="sr-only">(current)</span></a>
              <a class="nav-item nav-link" href="Aspa.jsp">Kamar Aspa</a>
              <a class="nav-item nav-link active" href="Aspi.jsp">Kamar Aspi</a>
            </div>
          </div>
        </nav>
           <%
        
    try
    {
        String className ="com.mysql.jdbc.Driver";
        Class.forName(className);
        System.out.println("Driver loaded successfully");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pca2019", "root", "");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("SELECT kamar.id as 'id', nama AS 'kamar', lantai, anggota, (SELECT asrama.nama FROM asrama WHERE asrama.id = kamar.asrama_id) AS 'asrama' FROM kamar WHERE asrama_id!=1 ORDER BY id");
    %>
    
    <table class="table">
  <thead>
    <tr>
      <th scope="col">Kamar</th>
      <th scope="col">lantai</th>
      <th scope="col">Anggota</th>
      <th scope="col">Asrama</th>
    </tr>
  </thead>
  <tbody>
      <%while(rs.next()){
          %>
          <tr>
        <th scope="row"><%=rs.getString("kamar")%></th>
      <td><%=rs.getString("lantai")%></td>
      <td><a href="DaftarNama.jsp?id=<%=rs.getString("id")%>" ><%=rs.getString("anggota")%></a></td>
      <td><%=rs.getString("asrama")%></td>
    </tr>
          <%     
      }
%>
    
  </tbody>
</table>

    <%}
    catch(Exception e){
        out.print(e.getMessage());%><br><%
    }
    finally{
          System.out.println("error connection");  }
    %>
        
        
        
    </body>
</html>
