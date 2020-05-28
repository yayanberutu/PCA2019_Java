<%-- 
    Document   : DaftarNama
    Created on : May 28, 2020, 7:04:58 PM
    Author     : Ratu Aryella Johana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
        <%@page import="java.sql.*;"%>

<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
      <a class="navbar-brand" href="Home.jsp">PCA20</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-labl="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
        <div class="navbar-nav">
          <a class="nav-item nav-link" href="Home.jsp">Home <span class="sr-only">(current)</span></a>
          <a class="nav-item nav-link active" href="Aspa.jsp">Kamar Aspa</a>
          <a class="nav-item nav-link" href="Aspi.jsp">Kamar Aspi</a>
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
        ResultSet rs=st.executeQuery("SELECT * FROM kamar");
    %>
    
    <table class="table">
  <thead>
      <tr>
          <th scope="col">ID</th>
      <th scope="col">Nama</th>
      <th scope="col">Prodi</th>
      <th scope="col">Kamar</th>
      <th scope="col">Asrama</th>
    </tr>
  </thead>
  <tbody>
      <%if(rs.next()){
           ResultSet rs2=st.executeQuery("SELECT kamar.id as id,mahasiswa.nama as nama, mahasiswa.prodi as prodi FROM mahasiswa INNER JOIN kamar WHERE mahasiswa.kamar_id="+rs.getInt("id"));
           while(rs2.next()){
          %>
        <tr>
        <th scope="row"><%=rs2.getString("id")%></th>
        <td><%=rs2.getString("nama")%></td>
        <td><%=rs2.getString("prodi")%></td>
    </tr>
          <%     
      }
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

