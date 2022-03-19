<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="backendxpto20202.modelo.bean.UsuarioPessoa"%>
<%@page import="backendxpto20202.controle.ControleUsuarioPessoa"%>
<%@page import="backendxpto20202.modelo.bean.Usuario"%>
<%@page import="backendxpto20202.controle.ControleUsuario"%>
<%@page import="backendxpto20202.modelo.bean.Pessoa"%>
<%@page import="backendxpto20202.controle.ControlePessoa"%>

<%
ControlePessoa pesCont = new ControlePessoa();
    Pessoa pf = new Pessoa(0,"","","","");
    List<Pessoa> pess = pesCont.lista(pf);

    ControleUsuario usuCont = new ControleUsuario();
    Usuario usuEnt = new Usuario("","");
    List<Usuario> usus = usuCont.lista(usuEnt);
    
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    UsuarioPessoa usuPes = new UsuarioPessoa(id,0,0,"");
    ControleUsuarioPessoa usuPesCont = new ControleUsuarioPessoa();
    usuPes = usuPesCont.busca(usuPes);
    String pbusca = request.getParameter("PBUSCA");


%>

<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>ALTERAR - USUÁRIO PESSOA</title>
    <body>
       <div class="container"/>
       <h1>ALTERAR - USUÁRIO PESSOA</h1>
        <form name="alterarUsuarioPessoa" action="validaAlterarRelacaoUsuarioPessoa.jsp" method="post">
            <table>
                <tr>
                    <td>Usuario:</td>
                        <td>
                            <select NAME="ID_USUARIO" class="browser-default">
                                <% for (Usuario usu : usus) { %>
                                    <% if( usu.getId() == usuPes.getIdU()) { %>
                                        <option selected value="<%=usu.getId()%>"><%=usu.getLogin()%></option>
                                    <% } else { %>
                                        <option value="<%=usu.getId()%>"><%=usu.getLogin()%></option>
                                    <% } %>
                                <% } %>
                            </select> 
                        </td>
                </tr>
                <tr>
                        <td>Pessoa:</td>
                        <td>
                            <select NAME ="ID_PESSOA" class="browser-default">
                                <% for (Pessoa pes : pess) { %>
                                    <% if( pes.getId()== usuPes.getIdP()) { %>
                                        <option selected value="<%=pes.getId()%>"><%=pes.getNome()%></option>
                                    <% } else { %>
                                        <option value="<%=pes.getId()%>"><%=pes.getNome()%></option>
                                    <% } %>
                                <% } %>
                            </select> 
                        </td>
                    </tr>
                    <tr>
                        <td>Observação:</td>
                        <td><input type="text" name="OBS" value="<%=usuPes.getObs()%>"></td>

                    </tr>
                </table>    
            <input type="HIDDEN" name="ID" value="<%=usuPes.getId()%>"> <br>
            <input type="HIDDEN" name="PBUSCA" value="<%=pbusca%>">
            <input type="submit" name="Enviar" value="OK">
        </form>
        <div>
    </body>
</html>