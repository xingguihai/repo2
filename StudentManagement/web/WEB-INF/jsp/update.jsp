<%--
  Created by IntelliJ IDEA.
  User: Lele
  Date: 2020/12/9
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改页面</title>
</head>
<body>
<form action="/toUp" method="get">
    <input type="text" name="sId" value="${stud.sId}" hidden>
    姓名：<input type="text" name="sName" value="${stud.sName}"><br>
    性别：<input type="text" name="sGender" value="${stud.sGender}"><br>
    年龄：<input type="text" name="sAge" value="${stud.sAge}"><br>
    住址：<input type="text" name="sAddress" value="${stud.sAddress}"><br>
    Email：<input type="text" name="sEmail" value="${stud.sEmail}"><br>
    <input type="submit" value="修改">
</form>
</body>
</html>
