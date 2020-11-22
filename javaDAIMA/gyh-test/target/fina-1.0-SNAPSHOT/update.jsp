<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/11/20
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link type="text/css" rel="stylesheet" href="/static/bootstrap/css/bootstrap.min.css"/>
</head>
<body>
<%@ page isELIgnored="false" %>
<script type="text/javascript" src="/static/bootstrap/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="/static/bootstrap/js/bootstrap.min.js"></script>
<div align="center">
  <%--  <form action="/good/updateById" method="post">
        <div class="form-group">
            <label for="exampleInputEmail1">Email address</label>
            <input type="text" class="form-control" id="exampleInputEmail1" placeholder="Email">
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">Password</label>
            <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
        </div>

        <div class="form-group">
            <label for="exampleInputFile">File input</label>
            <input type="file" id="exampleInputFile">
            <p class="help-block">Example block-level help text here.</p>
        </div>

        <button type="submit" class="btn btn-default">Submit</button>
    </form>--%>


    <form action="/good/updateById" method="post">
        <input type="hidden" name="gid" value="${good.gid}"><br>
        姓名:<input type="text" name="gname" value="${good.gname}"><br>
        店铺:<input type="text" name="gdes" value="${good.gdes}"><br>
        价格:<input type="text" name="gprice" value="${good.gprice}"><br>
        库存:<input type="text" name="gdiscount" value="${good.gdiscount}"><br>
        图片:<input type="text" name="gpic" value="${good.gpic}"><br>
        <button type="submit" class="btn btn-default">Submit</button>
<%--        <input type="submit" value="提交">--%>
    </form>
</div>
</body>
</html>
