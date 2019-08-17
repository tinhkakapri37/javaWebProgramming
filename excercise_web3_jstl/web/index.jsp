<%-- 
    Document   : index
    Created on : Aug 17, 2019, 8:13:40 AM
    Author     : DELL 5440
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">tinh nhanh</a>
        </nav>
        <div class="container">
            <form>
                <form>
                    <div class="form-group">
                        <label for="exampleInputEmail1">Seach</label>
                        <input type="text" class="form-control" id="txtseach" placeholder="seach key...">
                    </div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>
                <br/>
                
                <c:forEach var="item" items="${news}">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">${item.title}</h5>
                        <p class="card-text">${item.summary}</p>

                        <p>Người đăng: ${item.author}</p>
                    </div>
                    
                </c:forEach>    
                </div>
                <nav aria-label="Page navigation<div class="card-body">
                    <ul class="pagination">
                        <li class="page-item">
                            <a class="page-link" href="#" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                        <c:forEach var="i" begin="1" end="${total}" step="1">
                            <li class="page-item"><a class="page-link" href="#">i</a></li>
                        </c:forEach>
                        <li class="page-item">
                            <a class="page-link" href="#" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                    </ul>
                </nav>
        </div>

        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous">
        </script>
    </body>
</html>
