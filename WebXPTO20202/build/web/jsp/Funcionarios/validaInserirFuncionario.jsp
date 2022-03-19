<%@page import="backendxpto20202.controle.ControleFuncionarios"%>
<%@page import="backendxpto20202.modelo.bean.Funcionarios"%>
<%
    
    String nome = request.getParameter("NOME");
    String funcao = request.getParameter("FUNCAO");
    int idpessoa = Integer.parseInt(request.getParameter("IDPESSOA"));
 
    Funcionarios pes = new Funcionarios(0,nome,funcao,idpessoa);
    ControleFuncionarios pescont = new ControleFuncionarios();
    pes = pescont.inseri(pes);

    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "inserirFuncionario.jsp";
    response.sendRedirect(url);
%>

