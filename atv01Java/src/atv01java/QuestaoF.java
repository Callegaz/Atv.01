
package atv01java;

import javax.swing.JOptionPane;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabri
 */
public class QuestaoF {
    
      public static void main(String[] args) {
       
        List<Double> list = new ArrayList<>();
        
        
        for (int i = 0; i <= 2; i++) {
            double n = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número"));
            list.add(n);
        }
        
        Collections.sort(list);
        
        System.out.println("Números ordenados:" + list);
        
    }
    
}
