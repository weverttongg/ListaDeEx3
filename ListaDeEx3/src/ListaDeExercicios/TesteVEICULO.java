
package ListaDeExercicios;

import ListaDeExercicios.Veiculo;
import javax.swing.JOptionPane;

public class TesteVEICULO {
    public static void main(String[] args) {
        //Criando Objeto
        Veiculo v = new Veiculo();
        
        v.setMarca("Toyota");
        v.setModelo("Supra");
        v.setPreco(249.99);
        
        String info = v.toString();
        
        System.out.println(info);
     
     JOptionPane.showMessageDialog(null, info);
    }
    
}
