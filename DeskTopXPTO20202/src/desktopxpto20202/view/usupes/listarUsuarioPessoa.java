/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopxpto20202.view.usupes;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import backendxpto20202.controle.ControleUsuarioPessoa;
import backendxpto20202.modelo.bean.UsuarioPessoa;

/**
 *
 * @author ProfAlexandre
 */
public class listarUsuarioPessoa {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {     
    
         String obs = JOptionPane.showInputDialog("Entre com o Observacao");
         UsuarioPessoa usupes = new UsuarioPessoa(obs);
         ControleUsuarioPessoa contUsuPes = new ControleUsuarioPessoa();
         List<UsuarioPessoa> usupess = contUsuPes.lista(usupes);

         for (UsuarioPessoa usupesL : usupess) {
            JOptionPane.showMessageDialog(null, usupesL.toString());
            JOptionPane.showMessageDialog(null, usupesL.getPes().getNome());
            JOptionPane.showMessageDialog(null, usupesL.getUsu().getLogin());
     
         }              

    }
}
