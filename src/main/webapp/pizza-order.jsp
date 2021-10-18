<%--
  Created by IntelliJ IDEA.
  User: phoenix
  Date: 10/18/21
  Time: 10:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<h1>Pizza Order Form</h1>

<form id="pizza-form" method="POST">

    <td>
        <label for="size"><h2>Choose a size:</h2></label>
        <select form="pizza-form" id="size" name="size">
            <option value="xl">Extra Large</option>
            <option value="large">Large</option>
            <option value="medium">Medium</option>
            <option value="small">Small</option>
        </select>
    </td>
    <br>

    <td>
        <label for="crust"><h2>Choose a crust:</h2></label>
        <select form="pizza-form"  id="crust" name="crust">
            <option value="thin">Thin Crust</option>
            <option value="pan">Pan</option>
            <option value="hand-tossed">Hand tossed</option>
            <option value="deep-dish">Deep Dish</option>
        </select>
    </td>
    <br>

    <td>
        <label for="sauce"><h2>Choose a sauce:</h2></label>
        <select form="pizza-form"  id="sauce" name="sauce">
            <option value="pesto">Pesto</option>
            <option value="white">White</option>
            <option value="Marinara">Marinara</option>
            <option value="buffalo">Buffalo</option>
        </select>
    </td>
    <br>

    <td>
        <label for="toppings"><h2>Choose your toppings:</h2></label>
        <select form="pizza-form"  id="toppings" name="toppings">

            <input type="checkbox" id="pepperoni" name="pepperoni" value="pepperoni">
            <label for="pepperoni"> Pepperoni</label><br>

            <input type="checkbox" id="bacon" name="bacon" value="bacon">
            <label for="bacon">Bacon</label><br>

            <input type="checkbox" id="canadian-bacon" name="canadian-bacon" value="canadian-bacon">
            <label for="canadian-bacon">Canadian-Bacon</label><br>

<%--            <option value="pepperoni">Pepperoni</option>--%>
<%--            <option value="bacon">Bacon</option>--%>
<%--            <option value="canadian-bacon">Canadian Bacon</option>--%>
<%--            <option value="anchovies">Anchovies</option>--%>
        </select>
    </td>
    <br>

       <label for="address">Enter Address: </label><br>
       <input form="pizza-form" type="text" id="address" name="address" value=""><br>
       <button type="submit">Submit Order</button>


</form>



</body>
</html>
