<%@page import="backendxpto20202.controle.ControleUnidade"%>
<%@page import="backendxpto20202.modelo.bean.Unidade"%>
<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    String nome = request.getParameter("NOME");
    String Responsavel = request.getParameter("RESPONSAVEL");
    String pbusca = request.getParameter("PBUSCA");
    Unidade pes = new Unidade(id,nome,Responsavel);
    ControleUnidade pesCont = new ControleUnidade();
    pes = pesCont.altera(pes);
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "validaConsultarUnidade.jsp?NOME=" + pbusca;
    response.sendRedirect(url);
%>