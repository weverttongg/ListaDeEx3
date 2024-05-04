
package ListaDeExercicios;

import ListaDeExercicios.Empregado;

public class TesteEMPREGADO {
    public static void main(String[] args) {
        //Criando Objeto
        Empregado e = new Empregado();
        
        //Definindo valor aos atriburos
        e.setFuncao("Estoquista");
        e.setMatricula(2332);
        e.setNome("Wevertton Rodrigues");
        
        //variavel para receber os dados do ToString
        String info = e.toString();
        
        System.out.println(info);
    }
    
}
