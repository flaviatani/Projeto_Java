/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopxpto20202.view.funcionarioUnidade;

import backendxpto20202.controle.ControleFuncionarioUnidade;
import backendxpto20202.modelo.bean.FuncionarioUnidade;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author flavi
 */
public class listarFuncionarioUni { 
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {     
    
         String desempenho = JOptionPane.showInputDialog("Entre com o desempenho");
         FuncionarioUnidade usupes = new FuncionarioUnidade(desempenho);
         ControleFuncionarioUnidade contUsuPes = new ControleFuncionarioUnidade();
         List<FuncionarioUnidade> usupess = contUsuPes.lista(usupes);

         for (FuncionarioUnidade usupesL : usupess) {
            JOptionPane.showMessageDialog(null, usupesL.toString());
              
         }    
    }
}
