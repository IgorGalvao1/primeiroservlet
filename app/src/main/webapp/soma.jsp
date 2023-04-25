<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8" />
        <title>Soma</title>
    </head>
    <body>
        
        <form action="/soma" method ="post">

            <input type="number" name ="numero1" />
            <input type="number" name ="numero2" />
            <button type="submit">Calcular</button>
            ${resultado}

        </form>
        <hr />

    </body>
</html>