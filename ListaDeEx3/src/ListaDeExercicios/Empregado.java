
package ListaDeExercicios;

public class Empregado {
    //variaveis no estado de PRIVADAS
    private String nome;
    private int matricula;
    private String funcao;
    
    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL NOME ( metodo que retorna um valor e sem par�metro )
    public String getNome() {
        return nome;
    }
    
// (Set) VARIAVEL NOME ( metodo que n�o retorna valor e com par�metro ) 
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL MATRICULA ( metodo que retorna um valor e sem par�metro )
    public int getMatricula() {
        return matricula;
    }
    
// (Set) VARIAVEL MATRICULA ( metodo que n�o retorna valor e com par�metro ) 
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL FUNCAO ( metodo que retorna um valor e sem par�metro )
    public String getFuncao() {
        return funcao;
    }
    
// (Set) VARIAVEL FUNCAO ( metodo que n�o retorna valor e com par�metro ) 
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    //MET�DO ToString
    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", matricula=" + matricula + ", fun��o=" + funcao + '}';
    }

    
}
