/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv01java;
import javax.swing.JOptionPane;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
 *
 * @author gabri
 */
public class QuestaoL {
     public static void main(String[] args) throws ParseException {
        
        String name1 = JOptionPane.showInputDialog("Informe o nome da primeira pessoa:");
        String a = JOptionPane.showInputDialog(null, "Informe a data de nascimento separado por hifen:");
        
        String name2 = JOptionPane.showInputDialog("Informe o nome da segunda pessoa:");
        String b = JOptionPane.showInputDialog(null, "Informe a data de nascimento separado por hifen:");
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); 
        Date date1 = sdf.parse(a); 
        Date date2 = sdf.parse(b);
        
           
           if(date1.compareTo(date2) < 0){
               JOptionPane.showMessageDialog(null, name1 + " é a mais velho(a)");
           }else if(date1.compareTo(date2) > 0) {
               JOptionPane.showMessageDialog(null, name2 + " é a mais velho(a)");
           }else {
               JOptionPane.showMessageDialog(null, name1 + " e " + name2 + " possuem a mesma idade");
           }
    }
}
