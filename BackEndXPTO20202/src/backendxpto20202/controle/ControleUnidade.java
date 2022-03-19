/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendxpto20202.controle;

import backendxpto20202.modelo.bean.Unidade;
import backendxpto20202.modelo.dao.DaoUnidade;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author flavi
 */
public class ControleUnidade {
    
     static DaoUnidade daoPes;

    public ControleUnidade() throws SQLException, ClassNotFoundException {
        daoPes = new DaoUnidade();
    }
    
    public Unidade busca (Unidade pes) throws SQLException {
        pes = daoPes.busca(pes);
        return pes;
    }

    public Unidade inseri (Unidade pes) throws SQLException {
        pes = daoPes.inseri(pes);
        return pes;
    }

    public Unidade altera (Unidade pes) throws SQLException {
        pes = daoPes.altera(pes);
        return pes;
    }

    public Unidade exclui (Unidade pes) throws SQLException {
        pes = daoPes.exclui(pes);
        return pes;
    }

    public List<Unidade> lista (Unidade pes) throws SQLException {
        List<Unidade> pess = new ArrayList<>();
        pess = daoPes.lista(pes);
        return pess;
    }  
    
}
