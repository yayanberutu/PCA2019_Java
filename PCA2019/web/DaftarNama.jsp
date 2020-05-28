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
    String id_kamar = request.getParameter("id");
    try{
               String className ="com.mysql.jdbc.Driver";
               Class.forName(className);
               System.out.println("Driver loaded successfully");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pca2019", "root", "");
               Statement st=con.createStatement();
               String sql = "SELECT m.nama as 'nama', m.prodi as 'prodi', m.asalsekolah as 'asal', k.nama as 'kamar', a.nama as 'asrama' from mahasiswa m inner join kamar k on m.kamar_id = k.id inner join asrama a on k.asrama_id = a.id where k.id="+id_kamar;
               ResultSet rs = st.executeQuery(sql);
%>
    <table class="table">
  <thead>
    <tr>
      <th scope="col">Asrama</th>
      <th scope="col">Nama</th>
      <th scope="col">Prodi</th>
      <th scope="col">Asal</th>
      <th scope="col">Kamar</th>

    </tr>
  </thead>
  <tbody>
      <%while(rs.next()){
          %>
          <tr>
        <th scope="row"><%=rs.getString("asrama")%></th>
      <td><%=rs.getString("nama")%></td>
      <td><%=rs.getString("prodi")%></td>
      <td><%=rs.getString("asal")%></td>
      <td><%=rs.getString("kamar")%></td>
    </tr>
          <%     
      }
%>
    
  </tbody>
</table>
    

<%
               
          }
          catch(Exception e){
            out.print(e.getMessage());}
          finally{
            System.out.println("error connection");  }
 %>
  

</body>

</html>

