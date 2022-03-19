<%@page import="backendxpto20202.controle.ControleFuncionarios"%>
<%@page import="backendxpto20202.modelo.bean.Funcionarios"%>
<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    Funcionarios pes = new Funcionarios(id);
    ControleFuncionarios pesCont = new ControleFuncionarios();
    pes = pesCont.busca(pes);
    String pbusca = request.getParameter("PBUSCA");
%>

<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>ALTERAR - FUNCIONARIO</title>
    <body>
       <div class="container"/>
       <h1>ALTERAR FUNCIONARIO</h1>
        <form name="alterarFuncionario" action="validaAlterarFuncionario.jsp" method="post">
           
            Nome: <input type="text" name="NOME" value="<%=pes.getNome()%>"> <br>
            Função: <input type="text" name="FUNCAO" value="<%=pes.getFuncao()%>"> <br>
            Idpessoa: <input type="text" name="IDPESSOA" value="<%=pes.getIdpessoa()%>"> <br>
            <input type="HIDDEN" name="ID" value="<%=pes.getId()%>"> <br>
            <input type="HIDDEN" name="PBUSCA" value="<%=pbusca%>"> <br>
            <input type="submit" name="Enviar" value="OK">
        </form>
        <div>
    </body>
</html>