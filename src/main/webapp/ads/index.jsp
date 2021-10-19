<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<jsp:include page="/partials/head.jsp">
    <jsp:param name="title" value="Welcome to my site!"/>
</jsp:include>
</head>
<body>
<%--to include the navbar--%>
    <jsp:include page="/partials/navbar.jsp"/>
<main class="container">
    <h1>Ads</h1>
    <c:forEach var="ad" items="${ads}">
        <div>
            <h3>${ad.title}</h3>
            <p>${ad.description}</p>
        </div>
    </c:forEach>
</main>
</body>
</html>
