<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="backendxpto20202.modelo.bean.Usuario"%>
<%@page import="backendxpto20202.modelo.bean.UsuarioPessoa"%>
<%@page import="backendxpto20202.controle.ControleUsuarioPessoa"%>

<%
    String obs = request.getParameter("OBS");
    UsuarioPessoa usupes = new UsuarioPessoa(0,0,0,obs);
    ControleUsuarioPessoa usupescont = new ControleUsuarioPessoa();
    List<UsuarioPessoa> usupess = usupescont.lista(usupes);
    Usuario usuLogado = (Usuario) session.getAttribute("UsuarioLogado");
    String url = "PBUSCA=" + usupes.getObs() +"&ID=" ;
%>

<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>LISTA USUÁRIOS</title>
    <body>
        <table class="striped responsive-table">
            <thead>
              <tr>
                  <th data-field="IdUsuPessoa">Id</th>
                  <th data-field="IdPessoa">IdPessoa</th>
                  <th data-field="NomePessoa">NomePessoa</th>
                  <th data-field="IdUsuario">IdUsuario</th>
                  <th data-field="NomeUsuario">NomeUsuario</th>
                  <th data-field="Observacao">Observacao</th>
                  <th data-field="Excluir">Excluir</th>
                  <th data-field="Alterar">Alterar</th>
              </tr>
            </thead>
            <% if (!(usupess.isEmpty())) { %>    
                <tbody>
                    <% for (UsuarioPessoa listaUsuarioPessoa : usupess) { %>
                        <tr>
                            <td><%=listaUsuarioPessoa.getId()%></td>
                            <td><%=listaUsuarioPessoa.getIdP()%></td>
                            <td><%=listaUsuarioPessoa.getPes().getNome()%></td>
                            <td><%=listaUsuarioPessoa.getIdU()%></td>
                            <td><%=listaUsuarioPessoa.getUsu().getLogin()%></td>
                            <td><%=listaUsuarioPessoa.getObs()%></td>
                            <% if (usuLogado.getTipo().equals("ADM")) { %>
                                <td><a href="excluirRelacaoUsuarioPessoa.jsp?<%=url + listaUsuarioPessoa.getId()%>">Excluir</a></td>
                                <td><a href="alterarRelacaoUsuarioPessoa.jsp?<%=url + listaUsuarioPessoa.getId()%>">Alterar</a></td>
                            <% } %>
                        </tr>
                    <% } %>
                </tbody>
            <% } %>
        </table>    
    </body>
</html>