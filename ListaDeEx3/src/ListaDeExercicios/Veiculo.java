
package ListaDeExercicios;

public class Veiculo {
    //variaveis no estado de PRIVADAS
    private String marca;
    private String modelo;
    private double preco;
    
    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL MARCA ( metodo que retorna um valor e sem parâmetro )
    public String getMarca() {
        return marca;
    }
    
// (Set) VARIAVEL MARCA ( metodo que não retorna valor e com parâmetro ) 
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL MODELO ( metodo que retorna um valor e sem parâmetro )
    public String getModelo() {
        return modelo;
    }
    
// (Set) VARIAVEL MODELO ( metodo que não retorna valor e com parâmetro ) 
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL PRECO ( metodo que retorna um valor e sem parâmetro )
    public double getPreco() {
        return preco;
    }
    
// (Set) VARIAVEL PRECO ( metodo que não retorna valor e com parâmetro ) 
    public void setPreco(double preco) {
        this.preco = preco;
    }

    //METÓDO ToString
    @Override
    public String toString() {
        return "As Informações do Veiculo {" + "Marca: " + marca + ", Modelo: " + modelo + ", Preco: R$" + preco + '}';
    }


}
