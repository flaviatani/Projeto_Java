
<%@page import="backendxpto20202.controle.ControleFuncionarioUnidade"%>
<%@page import="backendxpto20202.modelo.bean.FuncionarioUnidade"%>
<%@page import="backendxpto20202.modelo.bean.Unidade"%>
<%@page import="backendxpto20202.controle.ControleUnidade"%>
<%@page import="java.util.List"%>
<%@page import="backendxpto20202.modelo.bean.Funcionarios"%>
<%@page import="backendxpto20202.controle.ControleFuncionarios"%>
<%
ControleFuncionarios pesCont = new ControleFuncionarios();
    Funcionarios fc = new Funcionarios(0,"","",0);
    List<Funcionarios> pess = pesCont.lista(fc);

    ControleUnidade usuCont = new ControleUnidade();
    Unidade usuEnt = new Unidade(0,"","");
    List<Unidade> usus = usuCont.lista(usuEnt);
    
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    FuncionarioUnidade fun = new FuncionarioUnidade(id,"","","");
    ControleFuncionarioUnidade usuPesCont = new ControleFuncionarioUnidade();
    fun = usuPesCont.busca(fun);
    String pbusca = request.getParameter("PBUSCA");


%>

<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>ALTERAR - DESEMPENHO FUNCIONARIO</title>
    <body>
       <div class="container"/>
       <h1>ALTERAR - DESEMPENHO FUNCIONARIO</h1>
        <form name="alterarFuncionarioUni" action="validaAlterarFunUni.jsp" method="post">
            <table>
                <tr>
                    <td>Unidade:</td>
                        <td>
                            <select NAME="Unidade" class="browser-default">
                                <% for (Unidade uni : usus) { %>
                                    <% if( uni.getNome()== fun.getNomeunidade()) { %>
                                        <option selected value="<%=uni.getNome()%>"><%=uni.getNome()%></option>
                                    <% } else { %>
                                        <option value="<%=uni.getNome()%>"><%=uni.getNome()%></option>
                                    <% } %>
                                <% } %>
                            </select> 
                        </td>
                </tr>
                <tr>
                        <td>Funcionarios:</td>
                        <td>
                            <select NAME ="Funcionario" class="browser-default">
                                <% for (Funcionarios pes : pess) { %>
                                    <% if( pes.getNome()== fun.getNomefuncionario()) { %>
                                        <option selected value="<%=pes.getNome()%>"><%=pes.getNome()%></option>
                                    <% } else { %>
                                        <option value="<%=pes.getNome()%>"><%=pes.getNome()%></option>
                                    <% } %>
                                <% } %>
                            </select> 
                        </td>
                    </tr>
                    <tr>
                        <td>Desempenho:</td>
                        <td><input type="text" name="Desempenho" value="<%=fun.getDesempenho()%>"></td>

                    </tr>
                </table>    
            <input type="HIDDEN" name="ID" value="<%=fun.getId()%>"> <br>
            <input type="HIDDEN" name="PBUSCA" value="<%=pbusca%>">
            <input type="submit" name="Enviar" value="OK">
        </form>
        <div>
    </body>
</html>