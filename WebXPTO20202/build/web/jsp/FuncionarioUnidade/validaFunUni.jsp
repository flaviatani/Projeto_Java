<%@page import="backendxpto20202.controle.ControleFuncionarioUnidade"%>
<%@page import="backendxpto20202.modelo.bean.FuncionarioUnidade"%>
<%
    String Nomefuncionario = request.getParameter("Funcionario");
    String Nomeunidade = request.getParameter("Unidade");
    String Desempenho = request.getParameter("Desempenho");
    FuncionarioUnidade usupes = new FuncionarioUnidade(0,Nomefuncionario,Nomeunidade,Desempenho);
    ControleFuncionarioUnidade usupescont = new ControleFuncionarioUnidade();
    usupes = usupescont.inseri(usupes);
    
// REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "inserirFuncionarioUni.jsp";
    response.sendRedirect(url);

%>