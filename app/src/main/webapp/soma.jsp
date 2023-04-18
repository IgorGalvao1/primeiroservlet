<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">

        <title>Soma</title>
    </head>
    <body>
        <form action="/tabuada" method="post">
            <input type="number" name="numero" />
            <button type="submit">Somar</button>
        </form>
        <hr />

        <c:forEach var="num" items="${resultado}">
            ${num} <br />
        </c:forEach>
    </body>
</html>