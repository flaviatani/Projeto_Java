<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>CONSULTAR - FUNCIONARIO</title>
    <body>
       <div class="container"/>
       <h1>CONSULTAR FUNCIONARIO</h1>
       <form name="consultarFuncionario" action="validaConsultarFuncionario.jsp" method="post">
           NOME <input type="text" name ="NOME" value=""> <br>
           <input type="submit" name ="Enviar" value="Enviar"> <br>
       </form>
       </div>
    </body>
</html>
