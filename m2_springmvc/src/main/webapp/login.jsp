<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/6/21
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
    <form action="/m2_springmvc/person/login" method="post">
        <input type="text" name="username">
        <input type="password" name="password">
        <input type="submit" value="登录">
    </form>
</body>
</html>
