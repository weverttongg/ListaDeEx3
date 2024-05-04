
package ListaDeExercicios;

public class Endereco {
    //variaveis no estado de PRIVADAS
    private String rua;
    private int numero;
    private String telefone;
    
                    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL RUA ( metodo que retorna um valor e sem par?metro )
    public String getRua() {
        return rua;
    }
    
    // (Set) VARIAVEL RUA ( metodo que n?o retorna valor e com par?metro ) 
    public void setRua(String rua) {
        this.rua = rua;
    }
    
                    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL NUMERO ( metodo que retorna um valor e sem par?metro )
    public int getNumero() {
        return numero;
    }
    
    // (Set) VARIAVEL NUMERO ( metodo que n?o retorna valor e com par?metro )
    public void setNumero (int numero) {
        this.numero = numero;
    }
                    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL TELEFONE ( metodo que retorna um valor e sem par?metro )
    public String getTelefone() {
        return telefone;
    }
    
    // (Set) VARIAVEL TELEFONE ( metodo que n?o retorna valor e com par?metro ) 
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}