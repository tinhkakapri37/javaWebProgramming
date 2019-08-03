<%-- 
    Document   : index
    Created on : Jul 28, 2019, 4:05:24 PM
    Author     : DELL 5440
--%>

<%@page import="data.Student"%>
<%@page import="java.util.List"%>
<%@page import="data.StudentModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
        <h1>Danh sách sinh viên</h1>
        <table class="table table-dark table-striped">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Major</th>
                <th>DOB</th>
            </tr>
        <%
            StudentModel model = new StudentModel();
            List<Student> students = model.getStudents();
            
            for (Student stud : students) { %>
            <tr>
                <td> <%= stud.getId() %> </td>
                <td> <%= stud.getName() %> </td>
                <td> <%= stud.getMajor() %> </td>
                <td> <%= stud.getDob() %> </td>
            </tr>        
        <% } %>
        </table>    
        </div>
        
    </body>
    
</html>
