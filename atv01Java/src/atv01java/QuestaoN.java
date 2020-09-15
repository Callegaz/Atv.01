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
public class QuestaoN {
    
     public static void main(String[] args) {
        
     int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do nadador:"));
    
        if(idade > 0 && idade <= 10){
            JOptionPane.showMessageDialog(null, "O nadador pertence a categoria Infatil");
        }else if(idade >= 11 && idade <= 14){
            JOptionPane.showMessageDialog(null, "O nadador pertence a categoria Junior");
        }else if(idade >= 15 && idade <= 20){
            JOptionPane.showMessageDialog(null, "O nadador pertence a categoria Adolescente");
        }else if(idade >= 21 && idade <= 35){
             JOptionPane.showMessageDialog(null, "O nadador pertence a categoria Jovem");
        }else {
            JOptionPane.showMessageDialog(null, "O nadador pertence a categoria Master");
        }
        
    }
}
