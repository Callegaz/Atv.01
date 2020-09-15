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
public class QuestaoE {
     public static void main(String[] args) {
         int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número"));
         
         if(n%2 == 0) {
             JOptionPane.showMessageDialog(null, "O número é par");
         }else {
             JOptionPane.showMessageDialog(null, "O número é ímpar");
         }
    }
}
