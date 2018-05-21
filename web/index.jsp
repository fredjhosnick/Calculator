<%--
  Created by IntelliJ IDEA.
  User: fred
  Date: 21.05.18
  Time: 23:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="/Calculate" method="post">
<label> Number 1: </label><input type="text" name="Number 1"><br>
<label> Number 2: </label><input type="text" name="Number 2"><br>
<select name="option">
    <option value="+">(+)</option>
    <option value="-">(-)</option>
    <option value="*">(*)</option>
    <option value="/">(/)</option>

</select><input type="submit" value="Calculate">
    </form>

</body>
</html>
