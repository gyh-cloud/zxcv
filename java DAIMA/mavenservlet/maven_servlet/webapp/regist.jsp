<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/11/9
  Time: 20:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="user" method="post">
    <input type="hidden" name="action" value="add">
    昵称:<input type="text" id="username" name="username"  ><br>
    性别:<input type="text" id="sex"   name="sex"> <br>
    家庭住址:<input type="text" id="address"  name="address" > <br>
    <input type="submit" value="提交">
</form>
</body>
</html>
