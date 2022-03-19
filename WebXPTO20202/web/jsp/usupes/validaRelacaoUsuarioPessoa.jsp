<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="backendxpto20202.modelo.bean.UsuarioPessoa"%>
<%@page import="backendxpto20202.controle.ControleUsuarioPessoa"%>

<%
    int idUsuario = Integer.parseInt(request.getParameter("ID_USUARIO"));
    int idPessoa = Integer.parseInt(request.getParameter("ID_PESSOA"));
    String obs = request.getParameter("OBS");
    UsuarioPessoa usupes = new UsuarioPessoa(0,idUsuario,idPessoa,obs);
    ControleUsuarioPessoa usupescont = new ControleUsuarioPessoa();
    usupes = usupescont.inseri(usupes);
    
// REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "inserirRelacaoUsuarioPessoa.jsp";
    response.sendRedirect(url);

%>