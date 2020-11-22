<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/11/14
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ page isELIgnored="false"%>
    <form action="teacher" method="post">
        <input type="hidden" name="action" value="update">
        <input type="hidden" name="id" value="${teacher.id}">
        老师姓名:<input type="text" name="teacherName" name="teacherName" value="${teacher.teacherName}">
        老师班级:<input type="text" name="classId" name="classId" value="${teacher.classId}">
        <input type="submit" value="提交">
    </form>
</body>
</html>
