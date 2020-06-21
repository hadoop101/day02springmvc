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
    <script type="text/javascript" src="jquery.min.js"></script>
    <title>登录页面</title>
</head>
<body>
<input type="button" value="使用js发送json" id="btn">
<script  type="text/javascript">
    $(function () {
        $("#btn").click(function () {
            $.post("/m2_springmvc/person/testjson",{"name":"jack","password":"1234"}, function (data) {
                alert(data);
            }, "json");
        });
});
</script>

</body>
</html>
