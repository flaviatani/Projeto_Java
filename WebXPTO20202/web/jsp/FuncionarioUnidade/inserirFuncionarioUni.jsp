<%@page import="backendxpto20202.controle.ControleFuncionarioUnidade"%>
<%@page import="backendxpto20202.controle.ControleFuncionarios"%>
<%@page import="backendxpto20202.modelo.bean.Funcionarios"%>
<%@page import="java.util.List"%>
<%@page import="backendxpto20202.modelo.bean.Unidade"%>
<%@page import="backendxpto20202.controle.ControleUnidade"%>
<%@page import="backendxpto20202.modelo.bean.FuncionarioUnidade"%>
<%
    ControleUnidade pesCont = new ControleUnidade();
    Unidade pf = new Unidade(0,"","");
    List<Unidade> pess = pesCont.lista(pf);

    ControleFuncionarios usuCont = new ControleFuncionarios();
    Funcionarios usuEnt = new Funcionarios(0,"","",0);
    List<Funcionarios> usus = usuCont.lista(usuEnt);
    
    ControleFuncionarioUnidade funiCont = new ControleFuncionarioUnidade();
    FuncionarioUnidade funi = new FuncionarioUnidade(0,"","","");
    List<FuncionarioUnidade> fun_uni = funiCont.lista(funi);
%>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>INSERIR DESEMPENHO DO FUNCIONARIO</title>
    <body>
        <div class="container"/>
            <h1>Inserir Desempenho do Funcionario</h1>
            <form name="inserirFuncionarioUni" action="validaFunUni.jsp" method="POST">
                <table>
                    <tr>
                        <td>Unidade:</td>
                        <td>
                            <select NAME ="Unidade" class="browser-default">
                                <% for (Unidade pes : pess) { %>
                                    <option value="<%=pes.getNome()%>"><%=pes.getNome()%></option>
                                <% } %>
                            </select> 
                        </td>
                    </tr>
                    <tr>
                        <td>Funcionarios:</td>
                        <td>
                            <select NAME="Funcionario" class="browser-default">
                                <% for (Funcionarios usu : usus) { %>
                                    <option value="<%=usu.getNome()%>"><%=usu.getNome()%></option>
                                <% } %>
                            </select> 
                        </td>
                    </tr>
                    <tr>
                        <td>Desempenho:</td>
                        <td><input type="text" name="Desempenho" value=""></td>
                    </tr>
                </table>    
                <input type="submit" name="Enviar" value="Enviar">  <br>
            </form>
        </div>                     
    </body>
</html>
