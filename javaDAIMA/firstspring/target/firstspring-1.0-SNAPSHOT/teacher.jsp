<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/11/13
  Time: 17:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link type="text/css" rel="stylesheet" href="static/bootstrap/css/bootstrap.min.css"/>
    <link type="text/css" rel="stylesheet" href="static/css/student.css">
    <style>
        .all th{
            text-align: center;
        }
    </style>
</head>
<body>
<%@ page isELIgnored="false"%>
<script type="text/javascript" src="static/bootstrap/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="static/bootstrap/js/bootstrap.min.js"></script>
<div class="all">
<div class="row">
    <div class="col-md-2"></div>
    <div class="col-md-8"><table class="table table-bordered" id="ta" >
        <tr>
            <th>id</th>
            <th>name</th>
            <th>classid</th>
            <th>操作</th>
        </tr>

        <c:forEach items="${list}" var="teacher">
            <tr>
                <th>${teacher.id}</th>
                <th>${teacher.teacherName}</th>
                <th>${teacher.classId}</th>
                <th><%--<a href="teacher?action=findById">新增</a>--%>
                    <a href="teacher?action=findById2&id=${teacher.id}"><font color="#7fff00">修改</font> </a>
                    <a href="teacher?action=delete&id=${teacher.id}"><font color="#8a2be2">删除</font> </a>
                </th>
            </tr>
        </c:forEach>
        <tr>
            <th colspan="6">
                <nav aria-label="Page navigation">
                    <ul class="pagination">
                            <a href="teacher?page=1">
                                <button type="button" class="btn btn-default">
                                    首页
                                </button>
                            </a>
                        &nbsp; 当前${pg.pageNum}页 总共${pg.pages}页 &nbsp;
                        <li>
                            <c:if test="${pg.pageNum != 1}">
                                <a href="teacher?page=${pg.pageNum-1}" aria-label="Previous">
                                    <span aria-hidden="true">&laquo;</span>
                                </a>
                            </c:if>
                        </li>
                        <li class="disabled">
                            <c:if test="${pg.pageNum == 1}">
                                <a href="#" aria-label="Previous">
                                    <span aria-hidden="true">&laquo;</span>
                                </a>
                            </c:if>
                        </li>
                        <li class="disabled"><%--如果是最后一页--%>
                            <c:if test="${pg.isLastPage ==true}">
                                <a href="#" aria-label="Next">
                                    <span aria-hidden="true">&raquo;</span>
                                </a>
                            </c:if>
                        </li>
                        <li>
                            <c:if test="${pg.isLastPage ==false}">
                                <a href="teacher?page=${pg.nextPage}" aria-label="Next">
                                    <span aria-hidden="true">&raquo;</span>
                                </a>
                            </c:if>
                        </li>
                        <a href="teacher?page=${pg.pages}">
                            <button type="button" class="btn btn-default">
                                末页
                            </button>
                        </a>
                    </ul>
                </nav>
            </th>
        </tr>
    </table></div>
    <div class="col-md-2"></div>
</div>
</div>
</body>
</html>
