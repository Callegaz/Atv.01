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
public class QuestaoI {
    
     public static void main(String[] args) {
        
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o lado A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o lado B: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o lado C: "));
            
        Triangulo triangle = new Triangulo(a,b,c);
        System.out.println(triangle.eTriangulo());
        System.out.println(triangle.tipoTriangulo());
    }
    
}
