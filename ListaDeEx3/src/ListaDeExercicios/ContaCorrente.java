
package ListaDeExercicios;

public class ContaCorrente {
    //variaveis no estado de PRIVADAS
    private int numero;
    private int tipo;
    private double saldo;
    
    
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
    
    // (Get) VARIAVEL TIPO ( metodo que retorna um valor e sem parâmetro )
    public int getTipo () {
        return tipo;
    }
    
    // (Set) VARIAVEL TIPO ( metodo que não retorna valor e com parâmetro ) 
    public void setTipo (int tipo) {
        this.tipo = tipo;
    }
    
                    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL SALDO ( metodo que retorna um valor e sem parâmetro )
    public double getSaldo() {
        return saldo;
    }
    
    // (Set) VARIAVEL SALDO ( metodo que não retorna valor e com parâmetro ) 
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
