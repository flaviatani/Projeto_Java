package org.apache.jsp.jsp.FuncionarioUnidade;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import backendxpto20202.controle.ControleFuncionarios;
import backendxpto20202.modelo.bean.Funcionarios;
import java.util.List;
import backendxpto20202.modelo.bean.Unidade;
import backendxpto20202.controle.ControleUnidade;

public final class inserirFuncionarioUni_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/jsp/FuncionarioUnidade/../../inc/materalizeWeb.inc");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    ControleUnidade pesCont = new ControleUnidade();
    Unidade pf = new Unidade(0,"","");
    List<Unidade> pess = pesCont.lista(pf);

    ControleFuncionarios usuCont = new ControleFuncionarios();
    Funcionarios usuEnt = new Funcionarios(0,"","",0);
    List<Funcionarios> usus = usuCont.lista(usuEnt);


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
      out.write("    <title>INSERIR DESEMPENHO DO FUNCIONARIO</title>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\"/>\n");
      out.write("            <h1>Inserir Desempenho do Funcionario</h1>\n");
      out.write("            <form name=\"inserirFuncionarioUni\" action=\"validaFunUni.jsp\" method=\"POST\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Unidade:</td>\n");
      out.write("                        <td>\n");
      out.write("                            <select NAME =\"ID\" class=\"browser-default\">\n");
      out.write("                                ");
 for (Unidade pes : pess) { 
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print(pes.getId());
      out.write('"');
      out.write('>');
      out.print(pes.getNome());
      out.write("</option>\n");
      out.write("                                ");
 } 
      out.write("\n");
      out.write("                            </select> \n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Funcionarios:</td>\n");
      out.write("                        <td>\n");
      out.write("                            <select NAME=\"IDFUN\" class=\"browser-default\">\n");
      out.write("                                ");
 for (Funcionarios usu : usus) { 
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print(usu.getId());
      out.write('"');
      out.write('>');
      out.print(usu.getNome());
      out.write("</option>\n");
      out.write("                                ");
 } 
      out.write("\n");
      out.write("                            </select> \n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Desempenho:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"Desempenho\" value=\"\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>    \n");
      out.write("                <input type=\"submit\" name=\"Enviar\" value=\"Enviar\">  <br>\n");
      out.write("            </form>\n");
      out.write("        </div>                     \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
