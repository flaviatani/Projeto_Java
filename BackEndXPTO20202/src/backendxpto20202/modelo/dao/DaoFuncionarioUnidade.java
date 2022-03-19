/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendxpto20202.modelo.dao;

import backendxpto20202.modelo.bean.FuncionarioUnidade;
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
public class DaoFuncionarioUnidade {
    
    private final Connection c;
    
    public DaoFuncionarioUnidade() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDB().getConnection();
    }
    
    public FuncionarioUnidade busca (FuncionarioUnidade pes) throws SQLException {
        String sql = "select * from fun_unidade WHERE id = ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
            // seta os valores
            stmt.setInt(1,pes.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            FuncionarioUnidade retorno = null;
            while (rs.next()) {      
            // criando o objeto Usuario
                retorno = new FuncionarioUnidade(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4));
            // adiciona o usu à lista de usus
            }
            stmt.close();
            c.close();
        return retorno;
    }

     public FuncionarioUnidade inseri (FuncionarioUnidade pes) throws SQLException {
        String sql = "insert into fun_unidade" + " (nomefuncionario, nomeunidade, desempenho)" + " values (?,?,?)";
    
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

        // seta os valores
        stmt.setString(1,pes.getNomefuncionario());
        stmt.setString(2,pes.getNomeunidade());
        stmt.setString(3,pes.getDesempenho());
        
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
     
      public FuncionarioUnidade altera (FuncionarioUnidade pes) throws SQLException {
        String sql = "UPDATE fun_unidade SET nomefuncionario = ?, nomeunidade = ?, desempenho = ? WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,pes.getNomefuncionario());
        stmt.setString(2,pes.getNomeunidade());
        stmt.setString(3,pes.getDesempenho());
        stmt.setInt(4,pes.getId());

        // executa
        stmt.execute();
        stmt.close();
        return pes;

    }
      
        public FuncionarioUnidade exclui (FuncionarioUnidade pes) throws SQLException {
         String sql = "delete from fun_unidade WHERE id = ?";
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

         public List<FuncionarioUnidade> lista (FuncionarioUnidade pes) throws SQLException {
         // usus: array armazena a lista de registros
        List<FuncionarioUnidade> pess = new ArrayList<>();
        
        String sql = "select * from fun_unidade where desempenho like ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,"%" + pes.getDesempenho()+ "%");
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto Usuario
            FuncionarioUnidade pesSaida = new FuncionarioUnidade(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4));
            // adiciona o usu à lista de usus
            pess.add(pesSaida);
        }
        
        rs.close();
        stmt.close();
        return pess;

    }

    
}
