<%@page import="backendxpto20202.controle.ControleFuncionarios"%>
<%@page import="backendxpto20202.modelo.bean.Funcionarios"%>
<%
    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    String nome = request.getParameter("NOME");
    String funcao = request.getParameter("FUNCAO");
    int idpessoa = Integer.parseInt(request.getParameter("IDPESSOA"));
    String pbusca = request.getParameter("PBUSCA");
    Funcionarios pes = new Funcionarios(id,nome,funcao,idpessoa);
    ControleFuncionarios pesCont = new ControleFuncionarios();
    pes = pesCont.altera(pes);
    // REDIRECIONA PARA A PAG LOGIN.JSP
    String url = "validaConsultarFuncionario.jsp?NOME=" + pbusca;
    response.sendRedirect(url);
%>
