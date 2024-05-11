package ListaDeExercicios;

//pegando as informaçoes da > Classe Banco <

import javax.swing.JOptionPane;

public class TesteBANCO {
    
    //ATALHO PARA CIRAN O METÓDO PRINCIPAL >> psvm + TAB
    public static void main(String[] args) {
        //cirando objeto
        Banco  banco = new Banco();
        
        //definindo valor aos atributos
        banco.setCodigo(2024);
        banco.setNome(" Wevertton Rodrigues");
        banco.setPaisOrigem(" Brasil");
        
      
        
         //imprimindo resultado
        System.out.println(banco);
        
        JOptionPane.showMessageDialog(null, banco);
    }
}
