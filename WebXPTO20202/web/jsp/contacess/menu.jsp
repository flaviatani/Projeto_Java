<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="backendxpto20202.modelo.bean.Usuario"%>
<%@page import="backendxpto20202.controle.ControleUsuario"%>

<%
    String login = request.getParameter("LOGIN");
    String senha = request.getParameter("SENHA");
    Usuario usu = new Usuario(login,senha);
    ControleUsuario usucont = new ControleUsuario();
    usu = usucont.valida(usu);
    session.setAttribute("UsuarioLogado",usu);
%>


<!DOCTYPE html>
<html>
    <%@include file="../../inc/materalizeWeb.inc" %>
    <title>SISTEMA </title>
    <body>
        <% if (usu != null) { %>
            <!-- Dropdown1 Trigger -->
            <a class='dropdown-button btn' data-beloworigin="true" href='#' data-activates='dropdown1'>Manter Usuário</a>        
            <a class='dropdown-button btn' data-beloworigin="true" href='#' data-activates='dropdown2'>Manter Pessoa</a>        
            <a class='dropdown-button btn' data-beloworigin="true" href='#' data-activates='dropdown3'>Manter Controle de Acesso</a>        
            <a class='dropdown-button btn' data-beloworigin="true" href='#' data-activates='dropdown4'>Manter Funcionario</a>    
            <a class='dropdown-button btn' data-beloworigin="true" href='#' data-activates='dropdown5'>Manter Unidade</a>        
            <a class='dropdown-button btn' data-beloworigin="true" href='#' data-activates='dropdown6'>Manter Funcionario e Desempenho</a>  

            <% if (usu.getTipo().equals("ADM")) { %>
                <!-- Dropdown1 Structure -->
                <ul id='dropdown1' class='dropdown-content'>
                    <li><a href="../usuario/inserirUsuario.jsp"> InseriUsuario </a></li>
                    <li><a href="../usuario/consultarUsuario.jsp"> ConsultaUsuarioParametro </a></li>
                </ul>
            <% } else { %>
                <ul id='dropdown1' class='dropdown-content'>
                    <li><a href="../usuario/consultarUsuario.jsp"> ConsultaUsuarioParametro </a></li>
                </ul>
            <% } %>
            <% if (usu.getTipo().equals("ADM")) { %>
                <!-- Dropdown2 Structure -->
                <ul id='dropdown2' class='dropdown-content'>
                    <li><a href="../pessoa/inserirPessoa.jsp"> InseriPessoa </a></li>
                    <li><a href="../pessoa/consultarPessoa.jsp"> ConsultaPessoa </a></li>
                </ul>
            <% } else { %>
                <ul id='dropdown2' class='dropdown-content'>
                    <li><a href="../pessoa/consultarPessoa.jsp"> ConsultaPessoa </a></li>
                </ul>
            <% } %>
            <% if (usu.getTipo().equals("ADM")) { %>
                <!-- Dropdown3 Structure -->
                <ul id='dropdown3' class='dropdown-content'>
                    <li><a href="../usupes/inserirRelacaoUsuarioPessoa.jsp"> InseriUsuarioPessoa </a></li>
                    <li><a href="../usupes/consultarRelacaoUsuarioPessoa.jsp"> ConsultaUsuarioPessoa </a></li>
                </ul>
            <% } else { %>
                <ul id='dropdown3' class='dropdown-content'>
                    <li><a href="../usuario/consultarUsuarioPessoa.jsp"> ConsultaUsuarioPessoa </a></li>
                </ul>
            <% } %>
            <% if (usu.getTipo().equals("ADM")) { %>
                <!-- Dropdown3 Structure -->
                <ul id='dropdown4' class='dropdown-content'>
                    <li><a href="../Funcionarios/inserirFuncionario.jsp"> InseriFuncionario </a></li>
                    <li><a href="../Funcionarios/consultarFuncionario.jsp"> ConsultaFuncionario </a></li>
                </ul>
            <% } else { %>
                <ul id='dropdown4' class='dropdown-content'>
                    <li><a href="../Funcionarios/consultarFuncionario.jsp"> ConsultaFuncionario </a></li>
                </ul>
            <% } %>
            
             <% if (usu.getTipo().equals("ADM")) { %>
                <!-- Dropdown3 Structure -->
                <ul id='dropdown5' class='dropdown-content'>
                    <li><a href="../Unidade/inserirUnidade.jsp"> InseriUnidade </a></li>
                    <li><a href="../Unidade/consultarUnidade.jsp"> ConsultaUnidade </a></li>
                </ul>
            <% } else { %>
                <ul id='dropdown5' class='dropdown-content'>
                    <li><a href="../Unidade/consultarUnidade.jsp"> ConsultaUnidade </a></li>
                </ul>
            <% } %>
            
             <% if (usu.getTipo().equals("ADM")) { %>
                <!-- Dropdown3 Structure -->
                <ul id='dropdown6' class='dropdown-content'>
                    <li><a href="../FuncionarioUnidade/inserirFuncionarioUni.jsp"> Inserir Funcionario Desempenho</a></li>
                    <li><a href="../FuncionarioUnidade/consultaFunUni.jsp"> Consulta Funcionario Desempenho </a></li>
                </ul>
            <% } else { %>
                <ul id='dropdown6' class='dropdown-content'>
                    <li><a href="../FuncionarioUnidade/consultaFunUni.jsp"> Consulta Funcionario Desempenho </a></li>
                </ul>
            <% } %>
 
 
            <% } else { %>
                <h1>USUÁRIO INVÁLIDO</h1>
        <% } %>
    </body>
</html>