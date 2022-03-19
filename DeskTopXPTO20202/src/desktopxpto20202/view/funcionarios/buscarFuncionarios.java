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
public class buscarFuncionarios {
    
     public static void main(String[] args) throws SQLException, ClassNotFoundException {
         
         int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ID"));
         Funcionarios pes = new Funcionarios(id);
         ControleFuncionarios contPes = new ControleFuncionarios();
         pes = contPes.busca(pes);
         JOptionPane.showMessageDialog(null, pes.toString());

    }  
    
}
