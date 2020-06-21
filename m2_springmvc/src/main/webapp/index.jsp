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
    <title>搜索页面</title>
</head>
<body>
    <form action="/m2_springmvc/person/search" method="post">
        <input type="text" name="keyword">
        <input type="submit" value="搜索">
    </form>
</body>
</html>
