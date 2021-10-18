<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: phoenix
  Date: 10/15/21
  Time: 3:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Contacts</title>
</head>
<body>
  <h1>This is ${name}'s contacts page!</h1>

    <c:forEach var="contact" items="${contacts}">
        <c:if test="${contact.isActive}">
            <tr>
                <td>${contact.id}</td>
                <td>${contact.name}</td>
                <td>${contact.email}</td>
                <td>${contact.address}</td>
                <td>${contact.phoneNumber}</td>
                <td>${contact.isActive}</td>
            </tr>
        </c:if>
    </c:forEach>
</body>
</html>
