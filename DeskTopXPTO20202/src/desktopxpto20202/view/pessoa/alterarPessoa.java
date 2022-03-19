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
public class alterarPessoa {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
         
         int id = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ID"));
         String nome = JOptionPane.showInputDialog("Entre com o Nome");
         String cpf = JOptionPane.showInputDialog("Entre com o Cpf");
         String tipo = JOptionPane.showInputDialog("Entre com o Tipo");
         String email = JOptionPane.showInputDialog("Entre com o Email");
         Pessoa pes = new Pessoa(id,nome,cpf,tipo,email);
         ControlePessoa contPes = new ControlePessoa();
         pes = contPes.altera(pes);
         JOptionPane.showMessageDialog(null, pes.toString());

    }
    
}
