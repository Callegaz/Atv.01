/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv01java;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class QuestaoK {
    public static void main(String[] args) throws ParseException {
        
        JOptionPane.showMessageDialog(null, "As datas devem ser informadas no formato: DD-MM-YYYY");
        String a = JOptionPane.showInputDialog(null, "Informe a primeira data");
        String b = JOptionPane.showInputDialog(null, "Informe a seguna data");
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); 
           Date date1 = sdf.parse(a); 
           Date date2 = sdf.parse(b); 
           
           if(date1.compareTo(date2) < 0){
               JOptionPane.showMessageDialog(null, date1);
           }else if(date1.compareTo(date2) > 0) {
               JOptionPane.showMessageDialog(null, date2);
           }else {
               JOptionPane.showMessageDialog(null, "As datas são iguais");
           }
            
       
    }
}
