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
public class excluirFuncionariosUni {
    
    
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
            
         int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ID"));
         FuncionarioUnidade usuPes = new FuncionarioUnidade(id);
         ControleFuncionarioUnidade contUsu = new ControleFuncionarioUnidade();
         usuPes = contUsu.exclui(usuPes);
         JOptionPane.showMessageDialog(null, usuPes.toString());
    }
    
}
