
package ListaDeExercicios;

public class ContaCorrente {
    //variaveis no estado de PRIVADAS
    private int numero;
    private int tipo;
    private double saldo;
    
    
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
    
    // (Get) VARIAVEL TIPO ( metodo que retorna um valor e sem par�metro )
    public int getTipo () {
        return tipo;
    }
    
    // (Set) VARIAVEL TIPO ( metodo que n�o retorna valor e com par�metro ) 
    public void setTipo (int tipo) {
        this.tipo = tipo;
    }
    
                    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL SALDO ( metodo que retorna um valor e sem par�metro )
    public double getSaldo() {
        return saldo;
    }
    
    // (Set) VARIAVEL SALDO ( metodo que n�o retorna valor e com par�metro ) 
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
