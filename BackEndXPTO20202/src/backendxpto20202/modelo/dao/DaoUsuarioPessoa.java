/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendxpto20202.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import backendxpto20202.modelo.bean.UsuarioPessoa;
import backendxpto20202.util.ConexaoDB;

/**
 *
 * @author ProfAlexandre
 */
public class DaoUsuarioPessoa {
    
    private final Connection c;
    
    public DaoUsuarioPessoa() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDB().getConnection();
    }

    public UsuarioPessoa busca (UsuarioPessoa usupes) throws SQLException {
        String sql = "select * from usuarios_pessoas WHERE id = ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
            // seta os valores
            stmt.setInt(1,usupes.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            UsuarioPessoa retorno = null;
            while (rs.next()) {      
            // criando o objeto Usuario
                retorno = new UsuarioPessoa(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getInt(3),
                    rs.getString(4));
            // adiciona o usu à lista de usus
            }
            stmt.close();
            c.close();
        return retorno;
    }

    public UsuarioPessoa inseri (UsuarioPessoa usupes) throws SQLException {
        String sql = "insert into usuarios_pessoas" + " (idUsuario, idPessoa, observacao)" + " values (?,?,?)";
    
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

        // seta os valores
        stmt.setInt(1,usupes.getIdU());
        stmt.setInt(2,usupes.getIdP());
        stmt.setString(3,usupes.getObs());

        // executa
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            int id = rs.getInt(1);
            usupes.setId(id);
        }
        stmt.close();
        c.close();
        return usupes;
    }

    public UsuarioPessoa altera (UsuarioPessoa usupes) throws SQLException {
        String sql = "UPDATE usuarios_pessoas SET idUsuario = ?, idPessoa = ?, observacao = ? WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setInt(1,usupes.getIdU());
        stmt.setInt(2,usupes.getIdP());
        stmt.setString(3,usupes.getObs());
        stmt.setInt(4,usupes.getId());

        // executa
        stmt.execute();
        stmt.close();
        return usupes;

    }

    public UsuarioPessoa exclui (UsuarioPessoa usupes) throws SQLException {
         String sql = "delete from usuarios_pessoas WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setInt(1,usupes.getId());
        // executa
        stmt.execute();
        stmt.close();
        c.close();
        return usupes;
    }

    public List<UsuarioPessoa> lista (UsuarioPessoa usupes) throws SQLException {
         // usus: array armazena a lista de registros
        List<UsuarioPessoa> ususPes = new ArrayList<>();
        
        String sql = "select * from usuarios_pessoas where observacao like ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,"%" + usupes.getObs()+ "%");
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto Usuario
            UsuarioPessoa usuPesSaida = new UsuarioPessoa(
                rs.getInt(1),
                rs.getInt(2),
                rs.getInt(3),
                rs.getString(4)
            );
            // adiciona o usu à lista de usus
            ususPes.add(usuPesSaida);
        }
        
        rs.close();
        stmt.close();
        return ususPes;
        

    }


}
