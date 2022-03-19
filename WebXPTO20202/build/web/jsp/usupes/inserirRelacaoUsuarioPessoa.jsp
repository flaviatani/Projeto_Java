<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
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

%>

<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>INSERIR USUARIO PESSOA</title>
    <body>
        <div class="container"/>
            <h1>Inseri Usuario Pessoa</h1>
            <form name="inseriUsuarioPessoa" action="validaRelacaoUsuarioPessoa.jsp" method="POST">
                <table>
                    <tr>
                        <td>Pessoa:</td>
                        <td>
                            <select NAME ="ID_PESSOA" class="browser-default">
                                <% for (Pessoa pes : pess) { %>
                                    <option value="<%=pes.getId()%>"><%=pes.getNome()%></option>
                                <% } %>
                            </select> 
                        </td>
                    </tr>
                    <tr>
                        <td>Usuario:</td>
                        <td>
                            <select NAME="ID_USUARIO" class="browser-default">
                                <% for (Usuario usu : usus) { %>
                                    <option value="<%=usu.getId()%>"><%=usu.getLogin()%></option>
                                <% } %>
                            </select> 
                        </td>
                    </tr>
                    <tr>
                        <td>Observação:</td>
                        <td><input type="text" name="OBS" value=""></td>
                    </tr>
                </table>    
                <input type="submit" name="Enviar" value="Enviar">  <br>
            </form>
        </div>                     
    </body>
</html>
