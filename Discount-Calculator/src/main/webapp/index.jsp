<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Calculator</title>
</head>
<body>
<form action="DiscountCalculator" method="post">
    <h1>Discount Calculator</h1>
    <div>
        <p>Product Description</p><input type="text" name="Description" size="40"><br>
        <p>List Price</p><input type="number" name="Price" size="40"><br>
        <p>Discount Percent</p><input type="number" name="Percent" size="40"><br>
        <br>
        <input type="submit" name="Calculate Discount">
    </div>
</form>
<br/>
</body>
</html>