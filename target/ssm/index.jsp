<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="user/findUserAll">fineAllUserInfo</a>

<form method="post" action="/user/saveUserInfo">
姓名：<input type="text" name="username"><br>
地址：<input type="text" name="address"><br>
<input type="submit" name="保存操作"><br>
</form>
</body>
</html>
