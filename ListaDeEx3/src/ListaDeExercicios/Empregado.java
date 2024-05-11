
package ListaDeExercicios;

public class Empregado {
    //variaveis no estado de PRIVADAS
    private String nome;
    private int matricula;
    private String funcao;
    
    //ENCAPSULAMENTO
    
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
    public int getMatricula() {
        return matricula;
    }
    
// (Set) VARIAVEL MATRICULA ( metodo que não retorna valor e com parâmetro ) 
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL FUNCAO ( metodo que retorna um valor e sem parâmetro )
    public String getFuncao() {
        return funcao;
    }
    
// (Set) VARIAVEL FUNCAO ( metodo que não retorna valor e com parâmetro ) 
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    //METÓDO ToString
    @Override
    public String toString() {
        return "Empregado{" + "nome=" + nome + ", matricula=" + matricula + ", função=" + funcao + '}';
    }

    
}
