<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="backendxpto20202.modelo.bean.Usuario"%>
<%@page import="backendxpto20202.controle.ControleUsuario"%>

<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    Usuario usu = new Usuario(id);
    ControleUsuario usuCont = new ControleUsuario();
    usu = usuCont.exclui(usu);
    String pbusca = request.getParameter("PBUSCA");
    
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "validaConsultarUsuario.jsp?LOGIN=" + pbusca;
    response.sendRedirect(url);
%>