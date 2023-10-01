/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MediaPOO;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author walter.pasold
 */
public class Hashs {
    
    
   public static void main(String[] args) {
        hashs();
    }
    
    public static void hashs(){
        
        HashMap<String,String> alunosHash = new HashMap<>();
        
        alunosHash.put("Walter", "Aprovado");
        
        alunosHash.put("Etevaldo", "Reprobado");
        
        alunosHash.put("Ferrys", "Recuperação");
        
        alunosHash.put("Gerson", "Aprovado");
        
        
        JOptionPane.showMessageDialog(null, alunosHash.get("Walter"));
        
        JOptionPane.showMessageDialog(null, alunosHash.values());
        
        
        
    }
    
    
}
