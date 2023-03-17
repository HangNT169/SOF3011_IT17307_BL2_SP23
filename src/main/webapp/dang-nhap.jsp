<%--
  Created by IntelliJ IDEA.
  User: hangnt
  Date: 09/03/2023
  Time: 08:33
  To change this template use File | Settings | File Templates.
--%>
<%--Hien thi giao dien co dau--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/login" method="post">
    <div class="container">
        <label><b>Nhập tên</b></label>
        <input type="text" placeholder="Nhập tên" name="uname"/>
        <span style="color: red;">${mess}</span>
        <br/>
        <label><b>Nhập mât </b></label>
        <input type="password" placeholder="Nhập mật khẩu" name="psw"/>
        <span style="color: red;">${mess}</span>
        <br/>
        <button type="submit">Login</button>
    </div>
</form>
</body>
</html>
