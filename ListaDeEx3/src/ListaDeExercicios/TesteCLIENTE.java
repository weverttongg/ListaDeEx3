
package ListaDeExercicios;

import ListaDeExercicios.Cliente;
import javax.swing.JOptionPane;
public class TesteCLIENTE {
    
    public static void main(String[] args) {
        //criando objeto
        Cliente c = new Cliente();
        
        //Defindo valores aos atributos
        c.setNome("Wevertton Rodrigues");
        c.setIdentidade("0000-2");
        c.setCpf("000.000.000-1");
        
        //criando variavel para ler o ToString
        String info = c.toString();
        
        //imprimindo resultados
        System.out.println(info);
        JOptionPane.showMessageDialog(null, info);
    }
}
