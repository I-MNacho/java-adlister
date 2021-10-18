<%--
  Created by IntelliJ IDEA.
  User: phoenix
  Date: 10/18/21
  Time: 3:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View All Products</title>
    <style>
        div{
         border: 1px solid black;
        }
    </style>
</head>
<body>

    <h1>Product list</h1>

    <c:forEach var="product" items="${products}">
        <div>
            <p>Product Name: ${product.name}</p>
            <p>Price in cents: ${product.priceInCents}</p>
        </div>
    </c:forEach>

</body>
</html>
