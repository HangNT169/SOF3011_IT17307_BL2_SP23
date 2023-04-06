<%--
  Created by IntelliJ IDEA.
  User: hangnt
  Date: 09/03/2023
  Time: 08:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="" method="post">
    <div class="container">
        <label><b>Nhập tên</b></label>
        <input type="text" placeholder="Nhập tên" name="uname"/>
        <br/>
        <label><b>Nhập mât khẩu</b></label>
        <input type="password" placeholder="Nhập mật khẩu" name="psw"/>
        <br/>
        <button type="submit">Login</button>
    </div>
    ${mess}
</form>
</body>
</html>
