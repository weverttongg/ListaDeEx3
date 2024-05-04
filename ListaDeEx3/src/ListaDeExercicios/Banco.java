
package ListaDeExercicios;


public class Banco {
    //variaveis - atributos no estado de PRIVADAS
    private int codigo;
    private String nome;
    private String paisOrigem;
    
                //ENCAPSULAMENTO
    
    // (Get) VARIAVEL CODIGO ( metodo que retorna um valor e sem parâmetro )
    public int getCodigo() {
        return codigo;
    }
    
    // (Set) VARIAVEL CODIGO ( metodo que não retorna valor e com parâmetro ) 
    public void setCodigo (int codigo) {
       this.codigo = codigo;
    }
    
                //ENCAPSULAMENTO
    
    // (Get) VARIAVEL NOME ( metodo que retorna um valor e sem parâmetro )
    public String getNome () {
        return nome;
    }
    
    // (Set) VARIAVEL NOME ( metodo que não retorna valor e com parâmetro ) 
    public void setNome (String nome) {
        this.nome = nome; 
    }
    
                    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL PAISORIGEM ( metodo que retorna um valor e sem parâmetro )
    public String getPaisOrigem () {
        return paisOrigem;
    }
    
    // (Set) VARIAVEL PAISORIGEM ( metodo que não retorna valor e com parâmetro ) 
    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
    


    //METÓDO ToString
    @Override
    public String toString() {
        System.out.println();
        return "Banco{" + "Nome:" + nome + ", Codigo: " + codigo + ", Pais de Origem: " + paisOrigem + '}';
    }
 
    

}
