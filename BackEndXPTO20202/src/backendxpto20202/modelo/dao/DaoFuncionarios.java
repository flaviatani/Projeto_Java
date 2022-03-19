/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendxpto20202.modelo.dao;

import backendxpto20202.modelo.bean.Funcionarios;
import backendxpto20202.util.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author flavi
 */
public class DaoFuncionarios {
    
    private final Connection c;
    
    public DaoFuncionarios() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDB().getConnection();
    }
    
    public Funcionarios busca (Funcionarios pes) throws SQLException {
        String sql = "select * from funcionarios WHERE id = ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
            // seta os valores
            stmt.setInt(1,pes.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            Funcionarios retorno = null;
            while (rs.next()) {      
            // criando o objeto Usuario
                retorno = new Funcionarios(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getInt(4));
            // adiciona o usu à lista de usus
            }
            stmt.close();
            c.close();
        return retorno;
    }

     public Funcionarios inseri (Funcionarios pes) throws SQLException {
        String sql = "insert into funcionarios" + " (nome, funcao, id_pessoa)" + " values (?,?,?)";
    
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

        // seta os valores
        stmt.setString(1,pes.getNome());
        stmt.setString(2,pes.getFuncao());
        stmt.setInt(3,pes.getIdpessoa());
        
        // executa
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            int id = rs.getInt(1);
            pes.setId(id);
        }
        stmt.close();
        c.close();
        return pes;
    }
     
      public Funcionarios altera (Funcionarios pes) throws SQLException {
        String sql = "UPDATE funcionarios SET nome = ?, funcao = ?, id_pessoa = ? WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,pes.getNome());
        stmt.setString(2,pes.getFuncao());
        stmt.setInt(3,pes.getIdpessoa());
        stmt.setInt(4,pes.getId());

        // executa
        stmt.execute();
        stmt.close();
        return pes;

    }
      
        public Funcionarios exclui (Funcionarios pes) throws SQLException {
         String sql = "delete from funcionarios WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setInt(1,pes.getId());
        // executa
        stmt.execute();
        stmt.close();
        c.close();
        return pes;
    }

         public List<Funcionarios> lista (Funcionarios pes) throws SQLException {
         // usus: array armazena a lista de registros
        List<Funcionarios> pess = new ArrayList<>();
        
        String sql = "select * from funcionarios where nome like ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,"%" + pes.getNome() + "%");
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto Usuario
            Funcionarios pesSaida = new Funcionarios(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getInt(4));
            // adiciona o usu à lista de usus
            pess.add(pesSaida);
        }
        
        rs.close();
        stmt.close();
        return pess;

    }

}

