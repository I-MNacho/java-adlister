<%--
  Created by IntelliJ IDEA.
  User: phoenix
  Date: 10/15/21
  Time: 11:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

    String username = (request.getParameter("username") == null) ? "" : request.getParameter("username");
    String password = (request.getParameter("password") == null) ? "" : request.getParameter("password");

    if (username.equals("admin") && password.equals("password")) {
        response.sendRedirect("/profile.jsp");
    }
%>
<html>
<head>
    <title>Login page</title>
</head>
<body>

<h1>Login Form</h1>

<form method="POST">
    <div>
        <label for="username">Username:</label><br>
        <input type="text" id="username" name="username" placeholder="Enter Your Username"><br>
    </div>
    <div>
        <label for="password">Password:</label><br>
        <input type="password" id="password" name="password" placeholder="Enter your password">
    </div>
    <button>Log In</button>

</form>

</body>
</html>
