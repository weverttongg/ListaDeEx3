
package ListaDeExercicios;


public class Agencia {
    //variaveis no estado de PRIVADAS
    private int numero;
    private String nome;
    
    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL NUMERO ( metodo que retorna um valor e sem par�metro )
    public int getNumero() {
        return numero;
    }
    
// (Set) VARIAVEL NUMERO ( metodo que n�o retorna valor e com par�metro ) 
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL NOME ( metodo que retorna um valor e sem par�metro )
    public String getNome() {
        return nome;
    }
    
// (Set) VARIAVEL NOME ( metodo que n�o retorna valor e com par�metro ) 
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //MET�DO ToString

    @Override
    public String toString() {
        return "Agencia{" + "numero=" + numero + ", nome=" + nome + '}';
    }
    

}
