package org.apache.jsp.jsp.contacess;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import backendxpto20202.modelo.bean.Usuario;
import backendxpto20202.controle.ControleUsuario;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/jsp/contacess/../../inc/materalizeWeb.inc");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    String login = request.getParameter("LOGIN");
    String senha = request.getParameter("SENHA");
    Usuario usu = new Usuario(login,senha);
    ControleUsuario usucont = new ControleUsuario();
    usu = usucont.valida(usu);
    session.setAttribute("UsuarioLogado",usu);

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    ");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <!-- Compiled and minified CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/css/materialize.css\">\r\n");
      out.write("    <!-- Compiled and minified JavaScript -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-2.2.2.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.5/js/materialize.js\"></script>\r\n");
      out.write("</head>");
      out.write("\n");
      out.write("    <title>SISTEMA </title>\n");
      out.write("    <body>\n");
      out.write("        ");
 if (usu != null) { 
      out.write("\n");
      out.write("            <!-- Dropdown1 Trigger -->\n");
      out.write("            <a class='dropdown-button btn' data-beloworigin=\"true\" href='#' data-activates='dropdown1'>Manter Usuário</a>        \n");
      out.write("            <a class='dropdown-button btn' data-beloworigin=\"true\" href='#' data-activates='dropdown2'>Manter Pessoa</a>        \n");
      out.write("            <a class='dropdown-button btn' data-beloworigin=\"true\" href='#' data-activates='dropdown3'>Manter Controle de Acesso</a>        \n");
      out.write("            <a class='dropdown-button btn' data-beloworigin=\"true\" href='#' data-activates='dropdown4'>Manter Funcionario</a>    \n");
      out.write("            <a class='dropdown-button btn' data-beloworigin=\"true\" href='#' data-activates='dropdown5'>Manter Unidade</a>        \n");
      out.write("            <a class='dropdown-button btn' data-beloworigin=\"true\" href='#' data-activates='dropdown6'>Manter Funcionario e Unidade</a>  \n");
      out.write("\n");
      out.write("            ");
 if (usu.getTipo().equals("ADM")) { 
      out.write("\n");
      out.write("                <!-- Dropdown1 Structure -->\n");
      out.write("                <ul id='dropdown1' class='dropdown-content'>\n");
      out.write("                    <li><a href=\"../usuario/inserirUsuario.jsp\"> InseriUsuario </a></li>\n");
      out.write("                    <li><a href=\"../usuario/consultarUsuario.jsp\"> ConsultaUsuarioParametro </a></li>\n");
      out.write("                </ul>\n");
      out.write("            ");
 } else { 
      out.write("\n");
      out.write("                <ul id='dropdown1' class='dropdown-content'>\n");
      out.write("                    <li><a href=\"../usuario/consultarUsuario.jsp\"> ConsultaUsuarioParametro </a></li>\n");
      out.write("                </ul>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            ");
 if (usu.getTipo().equals("ADM")) { 
      out.write("\n");
      out.write("                <!-- Dropdown2 Structure -->\n");
      out.write("                <ul id='dropdown2' class='dropdown-content'>\n");
      out.write("                    <li><a href=\"../pessoa/inserirPessoa.jsp\"> InseriPessoa </a></li>\n");
      out.write("                    <li><a href=\"../pessoa/consultarPessoa.jsp\"> ConsultaPessoa </a></li>\n");
      out.write("                </ul>\n");
      out.write("            ");
 } else { 
      out.write("\n");
      out.write("                <ul id='dropdown2' class='dropdown-content'>\n");
      out.write("                    <li><a href=\"../pessoa/consultarPessoa.jsp\"> ConsultaPessoa </a></li>\n");
      out.write("                </ul>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            ");
 if (usu.getTipo().equals("ADM")) { 
      out.write("\n");
      out.write("                <!-- Dropdown3 Structure -->\n");
      out.write("                <ul id='dropdown3' class='dropdown-content'>\n");
      out.write("                    <li><a href=\"../usupes/inserirRelacaoUsuarioPessoa.jsp\"> InseriUsuarioPessoa </a></li>\n");
      out.write("                    <li><a href=\"../usupes/consultarRelacaoUsuarioPessoa.jsp\"> ConsultaUsuarioPessoa </a></li>\n");
      out.write("                </ul>\n");
      out.write("            ");
 } else { 
      out.write("\n");
      out.write("                <ul id='dropdown3' class='dropdown-content'>\n");
      out.write("                    <li><a href=\"../usuario/consultarUsuarioPessoa.jsp\"> ConsultaUsuarioPessoa </a></li>\n");
      out.write("                </ul>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            ");
 if (usu.getTipo().equals("ADM")) { 
      out.write("\n");
      out.write("                <!-- Dropdown3 Structure -->\n");
      out.write("                <ul id='dropdown4' class='dropdown-content'>\n");
      out.write("                    <li><a href=\"../Funcionarios/inserirFuncionario.jsp\"> InseriFuncionario </a></li>\n");
      out.write("                    <li><a href=\"../Funcionarios/consultarFuncionario.jsp\"> ConsultaFuncionario </a></li>\n");
      out.write("                </ul>\n");
      out.write("            ");
 } else { 
      out.write("\n");
      out.write("                <ul id='dropdown4' class='dropdown-content'>\n");
      out.write("                    <li><a href=\"../Funcionarios/consultarFuncionario.jsp\"> ConsultaFuncionario </a></li>\n");
      out.write("                </ul>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            \n");
      out.write("             ");
 if (usu.getTipo().equals("ADM")) { 
      out.write("\n");
      out.write("                <!-- Dropdown3 Structure -->\n");
      out.write("                <ul id='dropdown5' class='dropdown-content'>\n");
      out.write("                    <li><a href=\"../Unidade/inserirUnidade.jsp\"> InseriUnidade </a></li>\n");
      out.write("                    <li><a href=\"../Unidade/consultarUnidade.jsp\"> ConsultaUnidade </a></li>\n");
      out.write("                </ul>\n");
      out.write("            ");
 } else { 
      out.write("\n");
      out.write("                <ul id='dropdown5' class='dropdown-content'>\n");
      out.write("                    <li><a href=\"../Unidade/consultarUnidade.jsp\"> ConsultaUnidade </a></li>\n");
      out.write("                </ul>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            \n");
      out.write("             ");
 if (usu.getTipo().equals("ADM")) { 
      out.write("\n");
      out.write("                <!-- Dropdown3 Structure -->\n");
      out.write("                <ul id='dropdown6' class='dropdown-content'>\n");
      out.write("                    <li><a href=\"../FuncionarioUnidade/inserirFuncionarioUni.jsp\"> Inserir Funcionario Desempenho</a></li>\n");
      out.write("                    <li><a href=\"../FuncionarioUnidade/consultaFunUni.jsp\"> Consulta Funcionario Desempenho </a></li>\n");
      out.write("                </ul>\n");
      out.write("            ");
 } else { 
      out.write("\n");
      out.write("                <ul id='dropdown6' class='dropdown-content'>\n");
      out.write("                    <li><a href=\"../FuncionarioUnidade/consultaFunUni.jsp\"> ConsultaUnidade </a></li>\n");
      out.write("                </ul>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write(" \n");
      out.write(" \n");
      out.write("            ");
 } else { 
      out.write("\n");
      out.write("                <h1>USUÁRIO INVÁLIDO</h1>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
