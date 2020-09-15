/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv01java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author gabri
 */
public class QuestaoH {
    
    public static void main(String[] args) {
        List<Double> areas = new ArrayList<>();
        
        
        for (int i = 1; i <= 3; i++) {
            double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura do triângulo " + i));
            double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a base do triângulo " + i));
            double area = (base * altura) / 2;
            areas.add(area);
        }
        double highest = Collections.max(areas);
        String result = String.format("%.2f", highest);
        System.out.println(areas);
        JOptionPane.showMessageDialog(null, "A maior área é: " + result);
    }
}
