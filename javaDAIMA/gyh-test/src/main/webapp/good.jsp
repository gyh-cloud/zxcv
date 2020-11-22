<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/11/20
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link type="text/css" rel="stylesheet" href="/static/bootstrap/css/bootstrap.min.css"/>
</head>
<body>
<%@ page isELIgnored="false" %>
<script type="text/javascript" src="/static/bootstrap/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="/static/bootstrap/js/bootstrap.min.js"></script>

<table class="table table-bordered" align="center">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>des</th>
        <th>price</th>
        <th>discount</th>
        <th>pic</th>
        <th>操作OR<a class="btn btn-default" href="/good/toinsert" role="button">添加</a></th>
    </tr>
    <c:forEach items="${list}" var="good">
        <tr>
            <td>${good.gid}</td>
            <td>${good.gname}</td>
            <td>${good.gdes}</td>
            <td>${good.gprice}</td>
            <td>${good.gdiscount}</td>
            <td><img src="${good.gpic}" style="width: 50px;height: 50px"></td>

            <td>
                <a class="btn btn-default" href="/good/findById?id=${good.gid}" role="button">修改</a>
<%--                <a href="/good/findById?id=${good.gid}">修改</a>--%>
                <a class="btn btn-default" href="/good/deleteById?id=${good.gid}" role="button">删除</a>
                <%--<a href="/good/deleteById?id=${good.gid}">删除</a>--%>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
