package org.apache.jsp.jsp.Funcionarios;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import backendxpto20202.controle.ControleFuncionarios;
import backendxpto20202.modelo.bean.Funcionarios;

public final class alterarFuncionario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/jsp/Funcionarios/../../inc/materalizeWeb.inc");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');

    String cod = request.getParameter("ID");
    int id = Integer.parseInt(cod);
    Funcionarios pes = new Funcionarios(id);
    ControleFuncionarios pesCont = new ControleFuncionarios();
    pes = pesCont.busca(pes);
    String pbusca = request.getParameter("PBUSCA");

      out.write("\n");
      out.write("\n");
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
      out.write("    <title>ALTERAR - FUNCIONARIO</title>\n");
      out.write("    <body>\n");
      out.write("       <div class=\"container\"/>\n");
      out.write("       <h1>ALTERAR FUNCIONARIO</h1>\n");
      out.write("        <form name=\"alterarFuncionario\" action=\"validaAlterarFuncionario.jsp\" method=\"post\">\n");
      out.write("           \n");
      out.write("            Nome: <input type=\"text\" name=\"NOME\" value=\"");
      out.print(pes.getNome());
      out.write("\"> <br>\n");
      out.write("            Função: <input type=\"text\" name=\"FUNCAO\" value=\"");
      out.print(pes.getFuncao());
      out.write("\"> <br>\n");
      out.write("            Idpessoa: <input type=\"text\" name=\"IDPESSOA\" value=\"");
      out.print(pes.getIdpessoa());
      out.write("\"> <br>\n");
      out.write("            <input type=\"HIDDEN\" name=\"ID\" value=\"");
      out.print(pes.getId());
      out.write("\"> <br>\n");
      out.write("            <input type=\"HIDDEN\" name=\"PBUSCA\" value=\"");
      out.print(pbusca);
      out.write("\"> <br>\n");
      out.write("            <input type=\"submit\" name=\"Enviar\" value=\"OK\">\n");
      out.write("        </form>\n");
      out.write("        <div>\n");
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
