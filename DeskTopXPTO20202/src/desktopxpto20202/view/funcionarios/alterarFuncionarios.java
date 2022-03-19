/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopxpto20202.view.funcionarios;

import backendxpto20202.controle.ControleFuncionarios;
import backendxpto20202.modelo.bean.Funcionarios;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author flavi
 */
public class alterarFuncionarios {
    
      public static void main(String[] args) throws SQLException, ClassNotFoundException {
         
         int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ID do funcionario"));
         String nome = JOptionPane.showInputDialog("Entre com o Nome");
         String funcao = JOptionPane.showInputDialog("Entre com a função");
         int idpessoa = Integer.parseInt(JOptionPane.showInputDialog("Entre com o seu ID"));
         
         Funcionarios pes = new Funcionarios(id,nome,funcao,idpessoa);
         ControleFuncionarios contPes = new ControleFuncionarios();
         pes = contPes.altera(pes);
         JOptionPane.showMessageDialog(null, pes.toString());

    }
    
}
