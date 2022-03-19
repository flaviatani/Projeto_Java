/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopxpto20202.view.pessoa;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import backendxpto20202.controle.ControlePessoa;
import backendxpto20202.modelo.bean.Pessoa;

/**
 *
 * @author ProfAlexandre
 */
public class listarPessoa {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {     
    
         String nome = JOptionPane.showInputDialog("Entre com o Nome");
         Pessoa pes = new Pessoa(nome);
         ControlePessoa contPes = new ControlePessoa();
         List<Pessoa> pess = contPes.lista(pes);

         for (Pessoa pesL : pess) {
            JOptionPane.showMessageDialog(null, pesL.toString());
         }

    }
}
