<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>CONSULTAR FUNCIONARIO DESEMPENHO</title>
    <body>
       <div class="container"/>
       <h1>CONSULTAR FUNCIONARIO DESEMPENHO</h1>
       <form name="consultaFunUni" action="validaConsultarFunUni.jsp" method="post">
           Nome <input type="text" name ="Nomefuncionario" value=""> <br>
           Unidade <input type="text" name ="Nomeunidade" value=""> <br>
           Desempenho <input type="text" name ="desempenho" value=""> <br>
           <input type="submit" name ="Enviar" value="Enviar"> <br>
       </form>
       </div>
    </body>
</html>
