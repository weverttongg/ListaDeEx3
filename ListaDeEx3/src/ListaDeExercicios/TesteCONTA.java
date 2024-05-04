
package ListaDeExercicios;

//pegando as informaçoes da > Classe ContaCorrente <
import ListaDeExercicios.ContaCorrente;
import javax.swing.JOptionPane;

public class TesteCONTA {
    //ATALHO PARA CIRAN O METÓDO PRINCIPAL >> psvm + TAB
    
    public static void main(String[] args) {
        //criando objeto
        
        ContaCorrente conta = new ContaCorrente();
        
        //defindo valores aos atributos
        conta.setTipo(1);
        conta.setNumero(3232);
        conta.setSaldo(559.12);
        
        //criando variavel para mostrar os valores
        String info = conta.toString();
        
        //imprimindo os resultados
        System.out.println(info);
        
        JOptionPane.showMessageDialog(null, info);
    }
    
}
