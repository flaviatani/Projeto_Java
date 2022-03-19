/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendxpto20202.controle;

import backendxpto20202.modelo.bean.Funcionarios;
import backendxpto20202.modelo.dao.DaoFuncionarios;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author flavi
 */
public class ControleFuncionarios {
    
     static DaoFuncionarios daoPes;

    public ControleFuncionarios() throws SQLException, ClassNotFoundException {
        daoPes = new DaoFuncionarios();
    }
    
    public Funcionarios busca (Funcionarios pes) throws SQLException {
        pes = daoPes.busca(pes);
        return pes;
    }

    public Funcionarios inseri (Funcionarios pes) throws SQLException {
        pes = daoPes.inseri(pes);
        return pes;
    }

    public Funcionarios altera (Funcionarios pes) throws SQLException {
        pes = daoPes.altera(pes);
        return pes;
    }

    public Funcionarios exclui (Funcionarios pes) throws SQLException {
        pes = daoPes.exclui(pes);
        return pes;
    }

    public List<Funcionarios> lista (Funcionarios pes) throws SQLException {
        List<Funcionarios> pess = new ArrayList<>();
        pess = daoPes.lista(pes);
        return pess;
    }  
}
