/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopxpto20202view.unidade;

import backendxpto20202.controle.ControleUnidade;
import backendxpto20202.modelo.bean.Unidade;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author flavi
 */
public class listarUnidade {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {     
    
         String nome = JOptionPane.showInputDialog("Entre com o Nome");
         Unidade pes = new Unidade(nome);
         ControleUnidade contPes = new ControleUnidade();
         List<Unidade> pess = contPes.lista(pes);

         for (Unidade pesL : pess) {
            JOptionPane.showMessageDialog(null, pesL.toString());
         }

    }
    
}
