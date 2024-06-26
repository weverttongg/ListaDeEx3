
package ListaDeExercicios;


public class Banco {
    //variaveis - atributos no estado de PRIVADAS
    private int codigo;
    private String nome;
    private String paisOrigem;
    
                //ENCAPSULAMENTO
    
    // (Get) VARIAVEL CODIGO ( metodo que retorna um valor e sem par�metro )
    public int getCodigo() {
        return codigo;
    }
    
    // (Set) VARIAVEL CODIGO ( metodo que n�o retorna valor e com par�metro ) 
    public void setCodigo (int codigo) {
       this.codigo = codigo;
    }
    
                //ENCAPSULAMENTO
    
    // (Get) VARIAVEL NOME ( metodo que retorna um valor e sem par�metro )
    public String getNome () {
        return nome;
    }
    
    // (Set) VARIAVEL NOME ( metodo que n�o retorna valor e com par�metro ) 
    public void setNome (String nome) {
        this.nome = nome; 
    }
    
                    //ENCAPSULAMENTO
    
    // (Get) VARIAVEL PAISORIGEM ( metodo que retorna um valor e sem par�metro )
    public String getPaisOrigem () {
        return paisOrigem;
    }
    
    // (Set) VARIAVEL PAISORIGEM ( metodo que n�o retorna valor e com par�metro ) 
    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
    


    //MET�DO ToString
    @Override
    public String toString() {
        System.out.println();
        return "Banco{" + "Nome:" + nome + ", Codigo: " + codigo + ", Pais de Origem: " + paisOrigem + '}';
    }
 
    

}
