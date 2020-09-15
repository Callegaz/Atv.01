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
public class QuestaoM {
    public static void main(String[] args) {
        
        int cc = Integer.parseInt(JOptionPane.showInputDialog("Informe as cilindradas do veículo"));
        
        if(cc >= 0 && cc <= 120) {
            JOptionPane.showMessageDialog(null, "O veículo pertence a categoria Sub Production");
        }else if(cc >= 121 && cc <= 240){
            JOptionPane.showMessageDialog(null, "O veículo pertence a categoria Production");
        }else if(cc >= 240){
            JOptionPane.showMessageDialog(null, "O veículo pertence a categoria Super Production");
        }
    
    }
}
