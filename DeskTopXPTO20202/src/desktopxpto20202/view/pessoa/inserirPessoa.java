/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopxpto20202.view.pessoa;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import backendxpto20202.controle.ControlePessoa;
import backendxpto20202.modelo.bean.Pessoa;

/**
 *
 * @author ProfAlexandre
 */
public class inserirPessoa {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
         
         String nome = JOptionPane.showInputDialog("Entre com o Nome");
         String cpf = JOptionPane.showInputDialog("Entre com o Cpf");
         String tipo = JOptionPane.showInputDialog("Entre com o Tipo");
         String email = JOptionPane.showInputDialog("Entre com o Email");
         Pessoa pes = new Pessoa(0,nome,cpf,tipo,email);
         ControlePessoa contPes = new ControlePessoa();
         pes = contPes.inseri(pes);
         JOptionPane.showMessageDialog(null, pes.toString());

    }

    
}
