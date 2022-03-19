/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendxpto20202.controle;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import backendxpto20202.modelo.bean.Pessoa;
import backendxpto20202.modelo.bean.Usuario;
import backendxpto20202.modelo.bean.UsuarioPessoa;
import backendxpto20202.modelo.dao.DaoUsuarioPessoa;

/**
 *
 * @author ProfAlexandre
 */
public class ControleUsuarioPessoa {
    
    static DaoUsuarioPessoa daoUsuPes;
    ControleUsuario contUsu ;
    ControlePessoa contPes ;

    public ControleUsuarioPessoa() throws SQLException, ClassNotFoundException {
        daoUsuPes = new DaoUsuarioPessoa();
    }

    public UsuarioPessoa busca (UsuarioPessoa usupes) throws SQLException, ClassNotFoundException {
       contUsu = new ControleUsuario();
       contPes = new ControlePessoa();
        // busca UsuarioPessoa por id
        usupes = daoUsuPes.busca(usupes);
        // construi os beans com os id de retorno de usuPes
        Usuario usu = new Usuario(usupes.getIdU());
        Pessoa pes = new Pessoa(usupes.getIdP());
        // valorizar os beans de usuario e pessao executando
        // seus controles.
        usupes.setUsu(contUsu.busca(usu));
        usupes.setPes(contPes.busca(pes));

        return usupes;
    }

    public UsuarioPessoa inseri (UsuarioPessoa usupes) throws SQLException {
        usupes = daoUsuPes.inseri(usupes);
        return usupes;
    }

    public UsuarioPessoa altera (UsuarioPessoa usupes) throws SQLException {
        usupes = daoUsuPes.altera(usupes);
        return usupes;
    }

    public UsuarioPessoa exclui (UsuarioPessoa usupes) throws SQLException {
        usupes = daoUsuPes.exclui(usupes);
        return usupes;
    }

    public List<UsuarioPessoa> lista (UsuarioPessoa usupes) throws SQLException, ClassNotFoundException {

        List<UsuarioPessoa> usupess = new ArrayList<>();
        usupess = daoUsuPes.lista(usupes);
        for (UsuarioPessoa usupesL : usupess) {
            contUsu = new ControleUsuario();
            contPes = new ControlePessoa();
            Usuario usu = new Usuario(usupesL.getIdU());
            Pessoa pes = new Pessoa(usupesL.getIdP());
            // valorizar os beans de usuario e pessao executando
            // seus controles.
            usupesL.setUsu(contUsu.busca(usu));
            usupesL.setPes(contPes.busca(pes));
        }
        return usupess;
    }
    
}
