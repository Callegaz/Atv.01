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
public class QuestaoC {
    
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo número"));
        
        if(n1 > n2) { 
            JOptionPane.showMessageDialog(null, "O maior número é: " + n1);
        }else{
            JOptionPane.showMessageDialog(null, "O maior número é: " + n2);
        }
    }
}
