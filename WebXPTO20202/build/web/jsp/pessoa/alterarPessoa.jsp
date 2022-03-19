<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="backendxpto20202.modelo.bean.Pessoa"%>
<%@page import="backendxpto20202.controle.ControlePessoa"%>

<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    Pessoa pes = new Pessoa(id);
    ControlePessoa pesCont = new ControlePessoa();
    pes = pesCont.busca(pes);
    String pbusca = request.getParameter("PBUSCA");
%>

<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>ALTERAR - PESSOA</title>
    <body>
       <div class="container"/>
       <h1>ALTERAR PESSOA</h1>
        <form name="alterarPessoa" action="validaAlterarPessoa.jsp" method="post">
            Cpf: <input type="text" name="CPF" value="<%=pes.getCpf()%>"> <br>
            Nome: <input type="text" name="NOME" value="<%=pes.getNome()%>"> <br>
            Tipo: <input type="text" name="TIPO" value="<%=pes.getTipo()%>"> <br>
            Email: <input type="text" name="EMAIL" value="<%=pes.getEmail()%>"> <br>
            <input type="HIDDEN" name="ID" value="<%=pes.getId()%>"> <br>
            <input type="HIDDEN" name="PBUSCA" value="<%=pbusca%>"> <br>
            <input type="submit" name="Enviar" value="OK">
        </form>
        <div>
    </body>
</html>