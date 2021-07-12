<%--
  Created by IntelliJ IDEA.
  User: Lele
  Date: 2020/12/9
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>首页</title>
</head>
<body>
<table border="1">
    <tr>学员信息表</tr>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
        <td>住址</td>
        <td>Email</td>
        <td>操作</td>
    </tr>
<c:forEach var="stu" items="${sList}">
    <tr>
        <td><a href="/goUp?sId=${stu.sId}" style="text-underline: none;color: aqua">${stu.sId}</a></td>
        <td>${stu.sName}</td>
        <td>${stu.sGender}</td>
        <td>${stu.sAge}</td>
        <td>${stu.sAddress}</td>
        <td>${stu.sEmail}</td>
        <td><a href="/toDel?id=${stu.sId}">删除</a></td>
    </tr>
</c:forEach>
    <a href="/goAdd">添加学生信息</a>
</table>
</body>
</html>
