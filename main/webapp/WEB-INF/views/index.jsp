<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 20/08/2018
  Time: 10:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <h1>Calculator</h1>
  <form action="calcu" method="get">

        <td><input type="number" name="number1" value="${number1}"></td>
        <td><input type="number" name="number2" value="${number2}"></td>
    <p>
        <td><input type="submit"  name="dau" value="Addition"></td>
        <td><input type="submit"  name="dau" value="Subtraction"></td>
        <td><input type="submit" name="dau" value="Multiplication"></td>
        <td><input type="submit" name="dau" value="Division"></td>
    </p>
  </form>
  <h1>Result = ${result}</h1>
  </body>
</html>
