<%@page import="backendxpto20202.controle.ControleFuncionarioUnidade"%>
<%@page import="backendxpto20202.modelo.bean.FuncionarioUnidade"%>
<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    FuncionarioUnidade usuPes = new FuncionarioUnidade(id);
    ControleFuncionarioUnidade usuPesCont = new ControleFuncionarioUnidade();
    usuPes = usuPesCont.exclui(usuPes);
    
    String pbusca = request.getParameter("PBUSCA");
    
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "validaConsultarFunUni.jsp?desempenho=" + pbusca;
    response.sendRedirect(url);

%>