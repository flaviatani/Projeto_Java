<%@page import="backendxpto20202.controle.ControleUnidade"%>
<%@page import="backendxpto20202.modelo.bean.Unidade"%>
<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    Unidade pes = new Unidade(id);
    ControleUnidade pesCont = new ControleUnidade();
    pes = pesCont.exclui(pes);
    String pbusca = request.getParameter("PBUSCA");
    
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "validaConsultarUnidade.jsp?NOME=" + pbusca;
    response.sendRedirect(url);
%>