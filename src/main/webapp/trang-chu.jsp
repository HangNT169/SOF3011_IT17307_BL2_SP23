<%--
  Created by IntelliJ IDEA.
  User: hangnt
  Date: 15/03/2023
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Đây là trang chủ</p>
<%--C1: Goi session truc tiep vao JSP: sessionScope --%>
<p>Goi truc tiep vao JSP : ${sessionScope.name1}</p>
<p>Goi thong qua Servlet : ${kq}</p>
<a href="/dang-xuat">Đăng xuất</a>
</body>
</html>
