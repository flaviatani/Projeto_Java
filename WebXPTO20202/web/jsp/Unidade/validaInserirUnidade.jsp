<%@page import="backendxpto20202.controle.ControleUnidade"%>
<%@page import="backendxpto20202.modelo.bean.Unidade"%>
<%
    String nome = request.getParameter("NOME");
    String responsavel = request.getParameter("RESPONSAVEL");
 
    Unidade pes = new Unidade(0,nome,responsavel);
    ControleUnidade pescont = new ControleUnidade();
    pes = pescont.inseri(pes);

    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "inserirUnidade.jsp";
    response.sendRedirect(url);
%>

