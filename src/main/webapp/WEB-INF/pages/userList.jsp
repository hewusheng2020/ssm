<%--
  Created by IntelliJ IDEA.
  User: hws
  Date: 2020/8/29
  Time: 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>页面查询成功！</h1>
<c:forEach items="${userlist}" var="user">
    ${user.username},${user.address}<br>

</c:forEach>
</body>
</html>
