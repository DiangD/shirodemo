<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/loginUser" method="post">
    <h1>欢迎登陆</h1>
    <label>用户名</label>
    <input type="text" id="input-username" name="username"><br>
    <label>密码</label>
    <input type="text" id="input-password" name="password"><br>
    <input type="submit"value="登录">
</form>
</body>
</html>