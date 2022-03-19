<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="backendxpto20202.modelo.bean.Pessoa"%>
<%@page import="backendxpto20202.controle.ControlePessoa"%>

<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    Pessoa pes = new Pessoa(id);
    ControlePessoa pesCont = new ControlePessoa();
    pes = pesCont.exclui(pes);
    String pbusca = request.getParameter("PBUSCA");
    
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "validaConsultarPessoa.jsp?NOME=" + pbusca;
    response.sendRedirect(url);
%>