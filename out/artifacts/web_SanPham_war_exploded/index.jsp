<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 18/07/2019
  Time: 9:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>

</head>
<body>
<form method="post" action="/product">
    <div width="200px">Product Description:</div>
    <input type="text" name="product description" width="100px"/><br/>
    <div width="200px">List Price:</div>
    <input type="text" name="list price" width="100px"/>
    <div width="200px">Discount Percent:</div>
    <input type="text" name="discount percent" width="100px"/><br/>
    <input type="submit" id="summit" value="Calculate Discount">
</form>
</body>
</html>
