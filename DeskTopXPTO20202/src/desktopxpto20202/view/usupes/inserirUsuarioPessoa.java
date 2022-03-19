/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopxpto20202.view.usupes;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import backendxpto20202.controle.ControleUsuarioPessoa;
import backendxpto20202.modelo.bean.UsuarioPessoa;

/**
 *
 * @author ProfAlexandre
 */
public class inserirUsuarioPessoa {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

         
         int idU = Integer.parseInt(JOptionPane.showInputDialog("Entre com o IdUsuario"));
         int idP = Integer.parseInt(JOptionPane.showInputDialog("Entre com o IdPessoa"));
         String obs = JOptionPane.showInputDialog("Entre com o Observacao");

         UsuarioPessoa usupes = new UsuarioPessoa(0,idU,idP,obs);
         ControleUsuarioPessoa contUsuPes = new ControleUsuarioPessoa();
         usupes = contUsuPes.inseri(usupes);
         JOptionPane.showMessageDialog(null, usupes.toString());

    }

    
}
