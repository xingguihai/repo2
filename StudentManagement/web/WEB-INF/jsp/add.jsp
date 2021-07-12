<%--
  Created by IntelliJ IDEA.
  User: Lele
  Date: 2020/12/9
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加页面</title>
</head>
<body>
<form action="/toAdd" method="get">
        姓名：<input type="text" name="sName"><br>
        性别：<input type="text" name="sGender"><br>
        年龄：<input type="text" name="sAge"><br>
        住址：<input type="text" name="sAddress"><br>
       Email：<input type="text" name="sEmail"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
