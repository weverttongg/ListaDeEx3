
package ListaDeExercicios;


import javax.swing.JOptionPane;
public class TesteCLIENTE {
    
    public static void main(String[] args) {
        //criando objeto
        Cliente c = new Cliente();
        
        //Defindo valores aos atributos
        c.setNome("Wevertton Rodrigues");
        c.setIdentidade("0000-2");
        c.setCpf("000.000.000-1");
        
        
        
        
        //imprimindo resultados
        System.out.println(c);
        JOptionPane.showMessageDialog(null, c);
    }
}
