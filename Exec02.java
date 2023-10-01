/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exec02;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author walter.pasold
 */
public class Exec02 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, nome());
        
        JOptionPane.showMessageDialog(null, idade());
        
    }
    
    public static String nome(){
        String nome;
        nome = JOptionPane.showInputDialog("Digite seu Nome: ");
        
        return nome;
               
    }
    
    public static int ano(){
        int ano;
        ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano que você nasceu! "));
        
        return ano;
                
    }
    
    public static int idade (){
        int idade, ano;
        
        Calendar cal = Calendar.getInstance();
        
        ano = ano();
        
        idade =  cal.get(Calendar.YEAR) - ano;
        
        return idade;
    }
}