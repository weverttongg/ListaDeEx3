
package ListaDeExercicios;

import ListaDeExercicios.Agencia;
import javax.swing.JOptionPane;
public class TesteAGENCIA {
    
    public static void main(String[] args) {
        //Criando objeto
        Agencia a = new Agencia();
        
        // defindo valores os atributos
        a.setNome("Banco do Povo");
        a.setNumero(1);
        
        //cirnado variacel para receber o valor do ToString
        String info = a.toString();
        
        //nostrando resultados
        System.out.println(info);
        JOptionPane.showMessageDialog(null, info);
    }
}
