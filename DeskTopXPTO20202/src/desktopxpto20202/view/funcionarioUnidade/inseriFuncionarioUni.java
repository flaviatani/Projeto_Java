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
public class inseriFuncionarioUni {
      
    
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

         
         String nomefuncionario = JOptionPane.showInputDialog("Entre com o nome do funcionario");
         String nomeunidade = JOptionPane.showInputDialog("Entre com o local da unidade");
         String desempenho = JOptionPane.showInputDialog("Entre com o desempenho");

         FuncionarioUnidade usupes = new FuncionarioUnidade(0,nomefuncionario,nomeunidade,desempenho);
         ControleFuncionarioUnidade contUsuPes = new ControleFuncionarioUnidade();
         usupes = contUsuPes.inseri(usupes);
         JOptionPane.showMessageDialog(null, usupes.toString());

    }
    
}
