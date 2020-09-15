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
public class QuestaoP {
     public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Informe o nome do funcionário: ");
        int tempoDeCasa = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo de registrado em anos:"));
        char sexo = JOptionPane.showInputDialog("Informe o sexo H para Homem M para Mulher: ").charAt(0);
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário"));
        
        if(tempoDeCasa > 15 && sexo == 'H'){
            double bonus = 0.20;
            double salarioNatal = (salario * bonus) + salario;
            JOptionPane.showMessageDialog(null, "Salário com bônus de natal: R$" +  salarioNatal);
        }else if(tempoDeCasa > 10 && sexo == 'M') {
            double bonus = 0.25;
            double salarioNatal = (salario * bonus) + salario;
            JOptionPane.showMessageDialog(null, "Salário com bônus de natal: R$" +  salarioNatal);
        }else {
            double salarioNatal = salario + 200;
            JOptionPane.showMessageDialog(null, "Salário com bônus de natal: R$" +  salarioNatal);
        }
    }
}
