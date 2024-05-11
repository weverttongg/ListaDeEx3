
package ListaDeExercicios;


import javax.swing.JOptionPane;
public class TesteAGENCIA {
    
    public static void main(String[] args) {
        //Criando objeto
        Agencia a = new Agencia();
        
        // defindo valores os atributos
        a.setNome("Banco do Povo");
        a.setNumero(1);
        
       
        
        //nostrando resultados
        System.out.println(a);
        JOptionPane.showMessageDialog(null, a);
    }
}
