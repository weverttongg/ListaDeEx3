
package ListaDeExercicios;

//pegando as informa�oes da > Classe ContaCorrente <

import javax.swing.JOptionPane;

public class TesteCONTA {
    //ATALHO PARA CIRAN O MET�DO PRINCIPAL >> psvm + TAB
    
    public static void main(String[] args) {
        //criando objeto
        
        ContaCorrente conta = new ContaCorrente();
        
        //defindo valores aos atributos
        conta.setTipo(1);
        conta.setNumero(3232);
        conta.setSaldo(559.12);
        

        
        //imprimindo os resultados
        System.out.println(conta);
        
        JOptionPane.showMessageDialog(null, conta);
    }
    
}
