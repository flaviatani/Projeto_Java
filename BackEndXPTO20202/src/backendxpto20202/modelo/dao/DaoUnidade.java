/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendxpto20202.modelo.dao;

import backendxpto20202.modelo.bean.Unidade;
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
public class DaoUnidade {
    
    private final Connection c;
    
    public DaoUnidade() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDB().getConnection();
    }
    
    public Unidade busca (Unidade pes) throws SQLException {
        String sql = "select * from unidadetrab WHERE id = ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
            // seta os valores
            stmt.setInt(1,pes.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            Unidade retorno = null;
            while (rs.next()) {      
            // criando o objeto Usuario
                retorno = new Unidade(
                    rs.getInt(1),
                    rs.getString(2),                  
                    rs.getString(3));
            // adiciona o usu à lista de usus
            }
            stmt.close();
            c.close();
        return retorno;
    }

     public Unidade inseri (Unidade pes) throws SQLException {
        String sql = "insert into unidadetrab" + " (nome_unidae, responsavel)" + " values (?,?)";
    
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

        // seta os valores
        stmt.setString(1,pes.getNome());
        stmt.setString(2,pes.getResponsavel());
              
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
     
      public Unidade altera (Unidade pes) throws SQLException {
        String sql = "UPDATE unidadetrab SET nome_unidae = ?, responsavel = ? WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,pes.getNome());
        stmt.setString(2,pes.getResponsavel());
        stmt.setInt(3,pes.getId());

        // executa
        stmt.execute();
        stmt.close();
        return pes;

    }
      
        public Unidade exclui (Unidade pes) throws SQLException {
         String sql = "delete from unidadetrab WHERE id = ?";
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

         public List<Unidade> lista (Unidade pes) throws SQLException {
         // usus: array armazena a lista de registros
        List<Unidade> pess = new ArrayList<>();
        
        String sql = "select * from unidadetrab where nome_unidae like ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,"%" + pes.getNome() + "%");
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto Usuario
            Unidade pesSaida = new Unidade(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3));
            // adiciona o usu à lista de usus
            pess.add(pesSaida);
        }
        
        rs.close();
        stmt.close();
        return pess;

    }

    
}
