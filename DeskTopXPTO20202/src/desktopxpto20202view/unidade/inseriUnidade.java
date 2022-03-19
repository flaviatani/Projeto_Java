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
public class inseriUnidade {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
         
         String nomeUnidade = JOptionPane.showInputDialog("Entre com o Nome");
         String responsavel = JOptionPane.showInputDialog("Entre com o nome do responsavel");
         
         Unidade pes = new Unidade(0,nomeUnidade,responsavel);
         ControleUnidade contPes = new ControleUnidade();
         pes = contPes.inseri(pes);
         JOptionPane.showMessageDialog(null, pes.toString());

    }
    
}
