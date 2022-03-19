<%@page import="backendxpto20202.controle.ControleFuncionarioUnidade"%>
<%@page import="backendxpto20202.modelo.bean.FuncionarioUnidade"%>
<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    String uni = request.getParameter("Unidade");
    String fun = request.getParameter("Funcionario");
    String desempenho = request.getParameter("Desempenho");
    String pbusca = request.getParameter("PBUSCA");
    FuncionarioUnidade usupes = new FuncionarioUnidade(id,uni,fun,desempenho);
    ControleFuncionarioUnidade usupescont = new ControleFuncionarioUnidade();
    usupes = usupescont.altera(usupes);
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "validaConsultarFunUni.jsp?desempenho=" + pbusca;
    response.sendRedirect(url);
%>    
    
    