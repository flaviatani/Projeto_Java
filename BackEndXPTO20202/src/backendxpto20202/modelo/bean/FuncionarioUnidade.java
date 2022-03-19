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
public class FuncionarioUnidade {
    
    private int id;
    private String nomefuncionario;
    private String nomeunidade;
    private String desempenho;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
  
        public String getDesempenho() {
        return desempenho;
    }

    public void setDesempenho(String desempenho) {
        this.desempenho = desempenho;
    }
      
    public String getNomefuncionario() {
        return nomefuncionario;
    }

    public void setNomefuncionario(String nomefuncionario) {
        this.nomefuncionario = nomefuncionario;
    }

    public String getNomeunidade() {
        return nomeunidade;
    }

    public void setNomeunidade(String nomeunidade) {
        this.nomeunidade = nomeunidade;
    }
    
    
    
     public FuncionarioUnidade(int id) {
        this.id = id;
    }
     
       public FuncionarioUnidade(String desempenho) {
        this.desempenho = desempenho;
    }
        
     public FuncionarioUnidade(int id, String nomefuncionario, String nomeunidade, String desempenho) {
        this.id = id;
        this.nomefuncionario = nomefuncionario;
        this.nomeunidade = nomeunidade;
        this.desempenho = desempenho;
      }
    @Override
    public String toString() {
        return "Unidade{" + "id=" + id + ", nomefuncionario=" + nomefuncionario + ", nomeunidade=" + nomeunidade + "desempenho=" + desempenho +'}';
    }

}
