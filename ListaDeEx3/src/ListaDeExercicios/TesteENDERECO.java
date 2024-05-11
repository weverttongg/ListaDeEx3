
package ListaDeExercicios;

import ListaDeExercicios.Endereco;
import javax.swing.JOptionPane;

public class TesteENDERECO {

    public static void main(String[] args) {
        //Criando objeto
        Endereco e = new Endereco();
        
        //Defindo valores aos atributos
        e.setNumero(20);
        e.setRua("Av das Castanheiras");
        e.setTelefone("(61) 9999-000");
        
        
        
        //imprimindo valores
        System.out.println(e);
        JOptionPane.showMessageDialog(null, e);
        
    }
    
}
