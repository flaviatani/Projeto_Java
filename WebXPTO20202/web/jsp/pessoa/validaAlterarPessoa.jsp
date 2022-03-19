<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="backendxpto20202.controle.ControlePessoa"%>
<%@page import="backendxpto20202.modelo.bean.Pessoa"%>

<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    String cpf = request.getParameter("CPF");
    String nome = request.getParameter("NOME");
    String mail = request.getParameter("EMAIL");
    String tipo = request.getParameter("TIPO");
    String pbusca = request.getParameter("PBUSCA");
    Pessoa pes = new Pessoa(id,nome,cpf,tipo,mail);
    ControlePessoa pesCont = new ControlePessoa();
    pes = pesCont.altera(pes);
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "validaConsultarPessoa.jsp?NOME=" + pbusca;
    response.sendRedirect(url);
%>