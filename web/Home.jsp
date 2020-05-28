<%-- 
    Document   : Home
    Created on : May 28, 2020, 3:52:12 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="Home.jsp">PCA20</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav">
      <a class="nav-item nav-link active" href="Home.jsp">Home <span class="sr-only">(current)</span></a>
      <a class="nav-item nav-link" href="Aspa.jsp">Kamar Aspa</a>
      <a class="nav-item nav-link" href="Aspi.jsp">Kamar Aspi</a>
    </div>
  </div>
</nav>
            <%@page import="java.sql.*;"%>
    <%
    try
    {
        String className ="com.mysql.jdbc.Driver";
        Class.forName(className);
        System.out.println("Driver loaded successfully");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pca2019", "root", "");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from Mahasiswa;");

    %>
    <table class="table table-striped">

  <thead>
    <tr>
      <th scope="col">No Pendaftaran</th>
      <th scope="col">Nama</th>
      <th scope="col">Prodi</th>
      <th scope="col">JK</th>
      <th scope="col">Status Kedatangan</th>
    </tr>
  </thead>
  <tbody>
      <%while(rs.next()){
          %>
          <tr>
              <th scope="row"><%=rs.getString("nim") %></th>
              <td><%=rs.getString("nama") %></td>
              <td><%=rs.getString("prodi") %></td>
              <td><%=rs.getString("jeniskelamin") %></td>
              <td>
                  <%if(rs.getBoolean("status_kedatangan")== false){
                    %>
  <center><a href="/mahasiswa/datang/nim=<%= rs.getString("nim") %>&jk=<%= rs.getString("jeniskelamin") %>" class="btn btn-success">Datang</a></center>
                  <%
                  }%> 
              </td>
          </tr>
      <%}%>

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
