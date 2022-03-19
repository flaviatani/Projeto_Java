<%@page import="backendxpto20202.modelo.bean.Funcionarios"%>
<%@page import="backendxpto20202.modelo.bean.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="backendxpto20202.controle.ControleFuncionarioUnidade"%>
<%@page import="backendxpto20202.modelo.bean.FuncionarioUnidade"%>
<%
    
    String desempenho = request.getParameter("desempenho");
    String Nomefuncionario = request.getParameter("Nomefuncionario");
    String Nomeunidade = request.getParameter("Nomeunidade");
    FuncionarioUnidade usupes = new FuncionarioUnidade(0,Nomefuncionario,Nomeunidade,desempenho);
    ControleFuncionarioUnidade usupescont = new ControleFuncionarioUnidade();
    List<FuncionarioUnidade> usupess = usupescont.lista(usupes);
    Usuario usuLogado = (Usuario) session.getAttribute("UsuarioLogado");
    String url = "PBUSCA=" + usupes.getDesempenho()+"&ID=" ;
    
%>

<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>LISTA USUÁRIOS</title>
    <body>
        <table class="striped responsive-table">
            <thead>
              <tr>
                  <th data-field="Id">Id</th>
                  <th data-field="IdFun">Nome do Funcionario</th>
                  <th data-field="IdUni">Nome da Unidade</th>
                  <th data-field="desempenho">Desempenho</th>
                  <th data-field="Excluir">Excluir</th>
                  <th data-field="Alterar">Alterar</th>
              </tr>
            </thead>
            <% if (!(usupess.isEmpty())) { %>    
                <tbody>
                    <% for (FuncionarioUnidade listaUsuarioPessoa : usupess) { %>
                        <tr>
                            <td><%=listaUsuarioPessoa.getId()%></td>
                            <td><%=listaUsuarioPessoa.getNomefuncionario()%></td>
                            <td><%=listaUsuarioPessoa.getNomeunidade()%></td>
                            <td><%=listaUsuarioPessoa.getDesempenho()%></td>
                            <% if (usuLogado.getTipo().equals("ADM")) { %>
                                <td><a href="excluirFuncionarioUni.jsp?<%=url + listaUsuarioPessoa.getId()%>">Excluir</a></td>
                                <td><a href="alterarFuncionarioUni.jsp?<%=url + listaUsuarioPessoa.getId()%>">Alterar</a></td>
                            <% } %>                             
                        </tr>
                    <% } %>  
                </tbody>
            <% } %>
        </table>    
    </body>
</html>