<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="backendxpto20202.modelo.bean.UsuarioPessoa"%>
<%@page import="backendxpto20202.controle.ControleUsuarioPessoa"%>

<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    int idUsuario = Integer.parseInt(request.getParameter("ID_USUARIO"));
    int idPessoa = Integer.parseInt(request.getParameter("ID_PESSOA"));
    String obs = request.getParameter("OBS");
    String pbusca = request.getParameter("PBUSCA");
    UsuarioPessoa usupes = new UsuarioPessoa(id,idUsuario,idPessoa,obs);
    ControleUsuarioPessoa usupescont = new ControleUsuarioPessoa();
    usupes = usupescont.altera(usupes);
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "validaConsultarRelacaoUsuarioPessoa.jsp?OBS=" + pbusca;
    response.sendRedirect(url);
%>    
    
    