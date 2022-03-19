/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopxpto20202.view.funcionarios;

import backendxpto20202.controle.ControleFuncionarios;
import backendxpto20202.modelo.bean.Funcionarios;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author flavi
 */
public class inseriFuncionarios {
    
     public static void main(String[] args) throws SQLException, ClassNotFoundException {
         
         String nome = JOptionPane.showInputDialog("Entre com o Nome do funcionário");
         String funcao = JOptionPane.showInputDialog("Entre com a Função do funcionário");
         int idpessoa = Integer.parseInt(JOptionPane.showInputDialog("Entre com o seu ID"));
         
         Funcionarios pes = new Funcionarios(0,nome,funcao,idpessoa);
         ControleFuncionarios contPes = new ControleFuncionarios();
         pes = contPes.inseri(pes);
         JOptionPane.showMessageDialog(null, pes.toString());

    }

    
}
