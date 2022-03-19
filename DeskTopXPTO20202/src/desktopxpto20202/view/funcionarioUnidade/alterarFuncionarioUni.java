/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopxpto20202.view.funcionarioUnidade;

import backendxpto20202.controle.ControleFuncionarioUnidade;
import backendxpto20202.modelo.bean.FuncionarioUnidade;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author flavi
 */
public class alterarFuncionarioUni {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

         int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com o Id")); 
         String nomefuncionario = JOptionPane.showInputDialog("Entre com o nome do Funcionario");
         String nomeunidade = JOptionPane.showInputDialog("Entre com o local da Unidade");
         String desempenho = JOptionPane.showInputDialog("Entre com o Observacao");

         FuncionarioUnidade usupes = new FuncionarioUnidade(id,nomefuncionario,nomeunidade,desempenho);
         ControleFuncionarioUnidade contUsuPes = new ControleFuncionarioUnidade();
         usupes = contUsuPes.altera(usupes);
         JOptionPane.showMessageDialog(null, usupes.toString());

    }
    
}
