<%@page import="backendxpto20202.controle.ControleUnidade"%>
<%@page import="backendxpto20202.modelo.bean.Unidade"%>
<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    Unidade pes = new Unidade(id);
    ControleUnidade pesCont = new ControleUnidade();
    pes = pesCont.busca(pes);
    String pbusca = request.getParameter("PBUSCA");
%>

<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>ALTERAR - UNIDADE</title>
    <body>
       <div class="container"/>
       <h1>ALTERAR UNIDADE</h1>
        <form name="alterarUnidade" action="validaAlterarUnidade.jsp" method="post">
            Nome: <input type="text" name="NOME" value="<%=pes.getNome()%>"> <br>
            Responsavel: <input type="text" name="RESPONSAVEL" value="<%=pes.getResponsavel()%>"> <br>          
            <input type="HIDDEN" name="ID" value="<%=pes.getId()%>"> <br>
            <input type="HIDDEN" name="PBUSCA" value="<%=pbusca%>"> <br>
            <input type="submit" name="Enviar" value="OK">
        </form>
        <div>
    </body>
</html>