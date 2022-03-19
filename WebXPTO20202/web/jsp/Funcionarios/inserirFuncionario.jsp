<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>INSERIR - FUNCIONARIO</title>
    <body>
       <div class="container"/>
        <h1>INSERIR FUNCIONARIO</h1>
        <form name="inserirFuncionario" action="validaInserirFuncionario.jsp" method="post">
            Nome: <input type="text" name="NOME" value=""> <br>
            Função: <input type="text" name="FUNCAO" value=""> <br>
            Idpessoa: <input type="text" name="IDPESSOA" value=""> <br>
            <input type="submit" name="Enviar" value="OK">
        </form>
        </div>
    </body>
</html>
