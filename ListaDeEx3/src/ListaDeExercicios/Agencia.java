
package ListaDeExercicios;


public class Agencia {
    //variaveis no estado de PRIVADAS
    private int numero;
    private String nome;
    
    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL NUMERO ( metodo que retorna um valor e sem parâmetro )
    public int getNumero() {
        return numero;
    }
    
// (Set) VARIAVEL NUMERO ( metodo que não retorna valor e com parâmetro ) 
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL NOME ( metodo que retorna um valor e sem parâmetro )
    public String getNome() {
        return nome;
    }
    
// (Set) VARIAVEL NOME ( metodo que não retorna valor e com parâmetro ) 
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //METÓDO ToString

    @Override
    public String toString() {
        return "Agencia{" + "numero=" + numero + ", nome=" + nome + '}';
    }
    

}
