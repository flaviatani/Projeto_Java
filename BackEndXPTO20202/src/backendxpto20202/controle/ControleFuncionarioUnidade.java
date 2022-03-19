/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendxpto20202.controle;

import backendxpto20202.modelo.bean.FuncionarioUnidade;
import backendxpto20202.modelo.dao.DaoFuncionarioUnidade;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author flavi
 */
public class ControleFuncionarioUnidade {
    
     static DaoFuncionarioUnidade daoPes;

    public ControleFuncionarioUnidade() throws SQLException, ClassNotFoundException {
        daoPes = new DaoFuncionarioUnidade();
    }
    
    public FuncionarioUnidade busca (FuncionarioUnidade pes) throws SQLException {
        pes = daoPes.busca(pes);
        return pes;
    }

    public FuncionarioUnidade inseri (FuncionarioUnidade pes) throws SQLException {
        pes = daoPes.inseri(pes);
        return pes;
    }

    public FuncionarioUnidade altera (FuncionarioUnidade pes) throws SQLException {
        pes = daoPes.altera(pes);
        return pes;
    }

    public FuncionarioUnidade exclui (FuncionarioUnidade pes) throws SQLException {
        pes = daoPes.exclui(pes);
        return pes;
    }

    public List<FuncionarioUnidade> lista (FuncionarioUnidade pes) throws SQLException {
        List<FuncionarioUnidade> pess = new ArrayList<>();
        pess = daoPes.lista(pes);
        return pess;
    }  
    
}
