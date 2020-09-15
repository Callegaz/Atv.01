/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv01java;
import javax.swing.JOptionPane;


/**
 *
 * @author gabri
 */
public class QuestaoG {
     public static void main(String[] args) {
        int operation = Integer.parseInt(JOptionPane.showInputDialog("1. Adição" + "\n" +
                "2. Subtração" + "\n" +
                "3. Divisão" + "\n" +
                "4. Multiplicação"));
        
        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o primeiro número"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o segundo número"));
        
        if(operation == 1) {
            Double result = n1 + n2;
            JOptionPane.showMessageDialog(null, result);
        }else if(operation == 2){
            Double result = n1 - n2;
            JOptionPane.showMessageDialog(null, result);
        }else if(operation == 3){
            Double result = n1 / n2;
            JOptionPane.showMessageDialog(null, result);
        }else if(operation == 4) {
            Double result = n1 * n2;
            JOptionPane.showMessageDialog(null, result);
        }else {
            JOptionPane.showMessageDialog(null, "Opção inválida");
        }
    }
}
