
package ListaDeExercicios;

public class Veiculo {
    //variaveis no estado de PRIVADAS
    private String marca;
    private String modelo;
    private double preco;
    
    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL MARCA ( metodo que retorna um valor e sem par�metro )
    public String getMarca() {
        return marca;
    }
    
// (Set) VARIAVEL MARCA ( metodo que n�o retorna valor e com par�metro ) 
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL MODELO ( metodo que retorna um valor e sem par�metro )
    public String getModelo() {
        return modelo;
    }
    
// (Set) VARIAVEL MODELO ( metodo que n�o retorna valor e com par�metro ) 
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL PRECO ( metodo que retorna um valor e sem par�metro )
    public double getPreco() {
        return preco;
    }
    
// (Set) VARIAVEL PRECO ( metodo que n�o retorna valor e com par�metro ) 
    public void setPreco(double preco) {
        this.preco = preco;
    }

    //MET�DO ToString
    @Override
    public String toString() {
        return "As Informa��es do Veiculo {" + "Marca: " + marca + ", Modelo: " + modelo + ", Preco: R$" + preco + '}';
    }


}
