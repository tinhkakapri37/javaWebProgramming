<%-- 
    Document   : form.jsp
    Created on : Aug 18, 2019, 4:12:51 PM
    Author     : DELL 5440
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!--header-->
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">Navbar</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                    </li>
                </ul>
            </div>
        </nav>
        <!--tạo form-->
        <form>
            <div class="form-group">
                <label for="exampleInputEmail1">Tên sách</label><br/>
                <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Math">
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">Tác Gỉa</label><br/>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="Tini">
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">Gía</label><br/>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="12.0">
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">Số lượng</label><br/>
                <input type="text" class="form-control" id="exampleInputPassword1" placeholder="22">
            </div>
            <button type="submit" class="btn btn-primary">Thêm</button>
        </form>

    </body>
</html>
