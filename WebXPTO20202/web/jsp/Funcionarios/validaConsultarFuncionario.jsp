<%@page import="java.util.List"%>
<%@page import="backendxpto20202.controle.ControleFuncionarios"%>
<%@page import="backendxpto20202.modelo.bean.Funcionarios"%>
<%@page import="backendxpto20202.modelo.bean.Usuario"%>
<%
    String nome = request.getParameter("NOME");
    Funcionarios pes = new Funcionarios(0,nome,"",0);
    ControleFuncionarios pescont = new ControleFuncionarios ();
    List<Funcionarios> pess = pescont.lista(pes);
    Usuario usuLogado = (Usuario) session.getAttribute("UsuarioLogado");
    String url = "PBUSCA=" + nome+"&ID=" ;
%>

<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>LISTA FUNCIONARIOS</title>
    <body>
        <table class="striped responsive-table">
            <thead>
              <tr>
                  <th data-field="Id">Id</th>
                  <th data-field="Nome">Nome</th>
                  <th data-field="Funcao">Funcao</th>
                  <th data-field="Idpessoa">Idpessoa</th>
                  <th data-field="Excluir">Excluir</th>
                  <th data-field="Alterar">Alterar</th>
              </tr>
            </thead>
            <% if (!(pess.isEmpty())) { %>    
                <tbody>
                    <% for (Funcionarios listaPessoas : pess) { %>
                        <tr>
                            <td><%=listaPessoas.getId()%></td>
                            <td><%=listaPessoas.getNome()%></td>
                            <td><%=listaPessoas.getFuncao()%></td>
                            <td><%=listaPessoas.getIdpessoa()%></td>
                            <% if (usuLogado.getTipo().equals("ADM")) { %>
                                <td><a href="excluirFuncionario.jsp?<%=url + listaPessoas.getId()%>">Excluir</a></td>
                                <td><a href="alterarFuncionario.jsp?<%=url + listaPessoas.getId()%>">Alterar</a></td>
                            <% } %>
                        </tr>
                    <% } %>
                </tbody>
            <% } %>
        </table>    
    </body>
</html>