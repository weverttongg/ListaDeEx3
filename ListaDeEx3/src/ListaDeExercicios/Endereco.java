
package ListaDeExercicios;

public class Endereco {
    //variaveis no estado de PRIVADAS
    private String rua;
    private int numero;
    private String telefone;
    
                    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL RUA ( metodo que retorna um valor e sem parâmetro )
    public String getRua() {
        return rua;
    }
    
    // (Set) VARIAVEL RUA ( metodo que n?o retorna valor e com parâmetro ) 
    public void setRua(String rua) {
        this.rua = rua;
    }
    
                    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL NUMERO ( metodo que retorna um valor e sem parâmetro )
    public int getNumero() {
        return numero;
    }
    
    // (Set) VARIAVEL NUMERO ( metodo que n?o retorna valor e com parâmetro )
    public void setNumero (int numero) {
        this.numero = numero;
    }
                    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL TELEFONE ( metodo que retorna um valor e sem parâmetro )
    public String getTelefone() {
        return telefone;
    }
    
    // (Set) VARIAVEL TELEFONE ( metodo que n?o retorna valor e com parâmetro ) 
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    //METÓDO ToString

    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", numero=" + numero + ", telefone=" + telefone + '}';
    }
    
    //METÓDO CONSTRUCTOR
    public Endereco(String rua, int numero, String telefone) {
        this.rua = rua;
        this.numero = numero;
        this.telefone = telefone;
    }
    
}