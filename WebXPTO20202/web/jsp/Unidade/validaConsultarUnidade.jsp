<%@page import="java.util.List"%>
<%@page import="backendxpto20202.controle.ControleUnidade"%>
<%@page import="backendxpto20202.modelo.bean.Unidade"%>
<%@page import="backendxpto20202.modelo.bean.Usuario"%>
<%
    String nome = request.getParameter("NOME");
    Unidade pes = new Unidade(0,nome,"");
    ControleUnidade pescont = new ControleUnidade();
    List<Unidade> pess = pescont.lista(pes);
    Usuario usuLogado = (Usuario) session.getAttribute("UsuarioLogado");
    String url = "PBUSCA=" + nome+"&ID=" ;
%>

<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>LISTA PESSOAS</title>
    <body>
        <table class="striped responsive-table">
            <thead>
              <tr>
                  <th data-field="Id">Id</th>
                  <th data-field="Nome">Nome</th>
                  <th data-field="Responsavel">Responsavel</th>
                  <th data-field="Excluir">Excluir</th>
                  <th data-field="Alterar">Alterar</th>
              </tr>
            </thead>
            <% if (!(pess.isEmpty())) { %>    
                <tbody>
                    <% for (Unidade listaPessoas : pess) { %>
                        <tr>
                            <td><%=listaPessoas.getId()%></td>
                            <td><%=listaPessoas.getNome()%></td>
                            <td><%=listaPessoas.getResponsavel()%></td>
                            <% if (usuLogado.getTipo().equals("ADM")) { %>
                                <td><a href="excluirUnidade.jsp?<%=url + listaPessoas.getId()%>">Excluir</a></td>
                                <td><a href="alterarUnidade.jsp?<%=url + listaPessoas.getId()%>">Alterar</a></td>
                            <% } %>
                        </tr>
                    <% } %>
                </tbody>
            <% } %>
        </table>    
    </body>
</html>