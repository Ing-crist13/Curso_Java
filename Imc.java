import javax.swing.JOptionPane;

package teste;

/**
 *
 * @author Ingrid Souza
 */
public class Imc {
    
    public static void main(String[] args){
           
    
    float  peso, altura, imc = 0;
    
    
    peso = Float.parseFloat(JOptionPane.showInputDialog("Digite seu peso: "));
    altura = Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura: "));
    
    //calculco IMC
    
    imc =(peso /(altura * altura));
    
    JOptionPane.showMessageDialog(null, "O IMC  é: " + imc);
    
    if (imc <=18.5){
       JOptionPane.showMessageDialog(null, "Abaixo do peso");
    }
    
    else if (imc < 18.6){ 
        JOptionPane.showMessageDialog(null, "Peso ideal");
    }
    else if (imc > 25) {
        JOptionPane.showMessageDialog(null, "Levemente acima do peso");
    }
    else if (imc > 30) {
         JOptionPane.showMessageDialog(null, "Obesidade grau |");
    }
    else if (imc > 35) {
            JOptionPane.showMessageDialog(null, "Obesidade grau ||");
    }   
       
    else if (imc > 40){
             JOptionPane.showMessageDialog(null, "Obesidade grau |||");
         }
    }
    
}
