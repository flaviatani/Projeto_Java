/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopxpto20202view.unidade;

import backendxpto20202.controle.ControleUnidade;
import backendxpto20202.modelo.bean.Unidade;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author flavi
 */
public class buscarUnidade {
    
     public static void main(String[] args) throws SQLException, ClassNotFoundException {
         
         int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ID"));
         Unidade pes = new Unidade(id);
         ControleUnidade contPes = new ControleUnidade();
         pes = contPes.busca(pes);
         JOptionPane.showMessageDialog(null, pes.toString());
    }
    
}
