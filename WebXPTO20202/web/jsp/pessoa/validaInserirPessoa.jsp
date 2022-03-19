<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="backendxpto20202.modelo.bean.Pessoa"%>
<%@page import="backendxpto20202.controle.ControlePessoa"%>

<%
    String cpf = request.getParameter("CPF");
    String nome = request.getParameter("NOME");
    String mail = request.getParameter("EMAIL");
    String tipo = request.getParameter("TIPO");
 
    Pessoa pes = new Pessoa(0,nome,cpf,tipo,mail);
    ControlePessoa pescont = new ControlePessoa();
    pes = pescont.inseri(pes);

    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "inserirPessoa.jsp";
    response.sendRedirect(url);
%>

