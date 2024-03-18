
import javax.swing.JOptionPane;

public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        System.out.println("Teste");
        
        int varA, varB, soma, subtracao, multiplicacao, div;
        
        
        
        varA = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da variavel A: "));
        varB = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da variavel B: "));
        
        soma = varA + varB;
        subtracao = varA - varB;
        multiplicacao = varA * varB;
        div = varA / varB;
        
        JOptionPane.showConfirmDialog(null, "O resultado da soma é: " + soma);
        JOptionPane.showConfirmDialog(null, "O resultado da subtração é: " + subtracao);
        JOptionPane.showConfirmDialog(null, "O resultado da multiplicação é: " + multiplicacao);
        JOptionPane.showConfirmDialog(null, "O resultado da divisão é: " + div);
        
    }
}
    
