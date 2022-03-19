/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendxpto20202.modelo.bean;

/**
 *
 * @author flavi
 */
public class Funcionarios {
    
    private int id;
    private String nome;
    private String funcao;
    private int idpessoa;
    
     public Funcionarios(int id) {
        this.id = id;
    }
        
     public Funcionarios(int id, String nome, String funcao, int idpessoa) {
        this.id = id;
        this.nome = nome;
        this.funcao = funcao;
        this.idpessoa = idpessoa;
      }

    public Funcionarios(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getIdpessoa() {
        return idpessoa;
    }

    public void setIdpessoa(int idpessoa) {
        this.idpessoa = idpessoa;
    }
    
    
    @Override
    public String toString() {
        return "Funcionarios{" + "id=" + id + ", nome=" + nome + ", funcao=" + funcao + ", idpessoa=" + idpessoa + '}';
    }
    
}