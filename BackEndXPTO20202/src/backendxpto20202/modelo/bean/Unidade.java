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
public class Unidade {

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

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    
    private int id;
    private String nome;
    private String responsavel;
        
     public Unidade(int id) {
        this.id = id;
    }
        
      public Unidade(String nome) {
        this.nome = nome;
    }
      
     public Unidade(int id, String nome, String responsavel) {
        this.id = id;
        this.nome = nome;
        this.responsavel = responsavel;
       }
    
    @Override
    public String toString() {
        return "Unidade{" + "id=" + id + ", nome=" + nome + ", responsavel=" + responsavel + '}';
    }
    
}
