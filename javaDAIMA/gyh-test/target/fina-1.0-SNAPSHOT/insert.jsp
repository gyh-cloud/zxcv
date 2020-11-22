<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/11/20
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <form action="/good/insert" method="post" enctype="multipart/form-data" >

        姓名:<input type="text" name="gname" ><br>
        店铺:<input type="text" name="gdes" ><br>
        价格:<input type="text" name="gprice" ><br>
        库存:<input type="text" name="gdiscount" ><br>
        图片:<input type="file" name="file"><br>
        <input type="submit" value="提交">
    </form>
</div>
</body>
</html>
