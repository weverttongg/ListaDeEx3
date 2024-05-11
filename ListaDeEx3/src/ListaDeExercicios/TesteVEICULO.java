
package ListaDeExercicios;

import javax.swing.JOptionPane;

public class TesteVEICULO {
    public static void main(String[] args) {
        //Criando Objeto
        Veiculo v = new Veiculo();
        
        v.setMarca("Toyota");
        v.setModelo("Supra");
        v.setPreco(249.99);
        
    
        
        System.out.println(v);
     
     JOptionPane.showMessageDialog(null, v);
    }
    
}
