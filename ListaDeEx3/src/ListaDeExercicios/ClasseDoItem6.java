
package ListaDeExercicios;


public class ClasseDoItem6 {
     //variaveis no estado de PRIVADAS
    private String nome;
    private int idade;
    private String cidade;
    private String disponibilidade;
   
    
    //ENCAPSULAMENTO
    
    public String getDisponibilidade() {
        return disponibilidade;
    }
    
    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    
    // (Get) VARIAVEL NOME ( metodo que retorna um valor e sem parâmetro )
    public String getNome() {
        return nome;
    }
    
// (Set) VARIAVEL NOME ( metodo que não retorna valor e com parâmetro ) 
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL MATRICULA ( metodo que retorna um valor e sem parâmetro )
    public int getIdade() {
        return idade;
    }
    
// (Set) VARIAVEL MATRICULA ( metodo que não retorna valor e com parâmetro ) 
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL FUNCAO ( metodo que retorna um valor e sem parâmetro )
    public String getCidade() {
        return cidade;
    }
    
// (Set) VARIAVEL FUNCAO ( metodo que não retorna valor e com parâmetro ) 
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "ClasseDoItem6{" + "nome=" + nome + ", idade=" + idade + ", cidade=" + cidade + '}';
    }

    
    


    
   
}
