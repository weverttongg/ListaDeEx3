
package ListaDeExercicios;

public class Cliente {
   //variaveis no estado de PRIVADAS
private String nome;
private String identidade;
private String cpf;

                //ENCAPSULAMENTO
    
    // (Get) VARIAVEL NOME ( metodo que retorna um valor e sem par�metro )
    public String getNome(){
        return nome;
    }
    
// (Set) VARIAVEL NOME ( metodo que n�o retorna valor e com par�metro ) 
    public void setNome(String nome) {
        this.nome = nome;
    }
    
                //ENCAPSULAMENTO
    
    // (Get) VARIAVEL IDENTIDADE ( metodo que retorna um valor e sem par�metro )
    public String getIdentidade() {
            return identidade;
    }
    
// (Set) VARIAVEL IDENTIDADE ( metodo que n�o retorna valor e com par�metro ) 
    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }
    
    
                //ENCAPSULAMENTO
    
    // (Get) VARIAVEL CPF ( metodo que retorna um valor e sem par�metro )
    public String getCpf(){
        return cpf;
    }
    
// (Set) VARIAVEL CPF ( metodo que n�o retorna valor e com par�metro ) 
    public void getCpf(String cpf) {
        this.cpf = cpf;
    }

    //MET�DO ToString

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", identidade=" + identidade + ", cpf=" + cpf + '}';
    }
    

    

}
