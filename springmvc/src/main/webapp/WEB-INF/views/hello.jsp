<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/2
  Time: 12:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Title</title>
</head>
<body>
    <h2>hello.springmvc</h2>
    <h2>${massage}</h2>
    <form action="/form" method="post">
        <input type="text" name="url">
    </form>
</body>
</html>
