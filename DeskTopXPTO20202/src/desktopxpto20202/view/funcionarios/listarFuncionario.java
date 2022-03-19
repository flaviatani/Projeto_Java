/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopxpto20202.view.funcionarios;

import backendxpto20202.controle.ControleFuncionarios;
import backendxpto20202.modelo.bean.Funcionarios;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author flavi
 */
public class listarFuncionario {
    
     public static void main(String[] args) throws SQLException, ClassNotFoundException {     
    
         String nome = JOptionPane.showInputDialog("Entre com o Nome");
         Funcionarios pes = new Funcionarios(nome);
         ControleFuncionarios contPes = new ControleFuncionarios();
         List<Funcionarios> pess = contPes.lista(pes);

         for (Funcionarios pesL : pess) {
            JOptionPane.showMessageDialog(null, pesL.toString());
         } 
     }
}
