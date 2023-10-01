/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Exec1;

import javax.swing.JOptionPane;

/**
 *
 * @author walter.pasold
 */
public class Exec1 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, divideNumeros());
    }
    
    
    public static double somaNumeros(){
        double n1, n2, soma;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero 1"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digit o numero 2"));
        
       soma = n1 + n2;
       
       return soma;
        
              
    }
    
    public static double divideNumeros(){
        double soma, resultado;
        soma = somaNumeros();
        
        resultado = soma /2;
        
        return resultado;      
        
    }
}
