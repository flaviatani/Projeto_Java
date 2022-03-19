<%@page import="backendxpto20202.controle.ControleFuncionarios"%>
<%@page import="backendxpto20202.modelo.bean.Funcionarios"%>
<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    Funcionarios pes = new Funcionarios(id);
    ControleFuncionarios pesCont = new ControleFuncionarios();
    pes = pesCont.exclui(pes);
    String pbusca = request.getParameter("PBUSCA");
    
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "validaConsultarFuncionario.jsp?NOME=" + pbusca;
    response.sendRedirect(url);
%>