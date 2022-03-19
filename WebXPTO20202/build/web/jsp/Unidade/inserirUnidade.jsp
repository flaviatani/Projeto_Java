<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>INSERIR - UNIDADE</title>
    <body>
       <div class="container"/>
        <h1>INSERIR UNIDADE</h1>
        <form name="inserirUnidade" action="validaInserirUnidade.jsp" method="post">
            Nome: <input type="text" name="NOME" value=""> <br>
            Responsavel: <input type="text" name="RESPONSAVEL" value=""> <br>           
            <input type="submit" name="Enviar" value="OK">
        </form>
        </div>
    </body>
</html>
