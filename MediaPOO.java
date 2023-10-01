/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package MediaPOO;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author walter.pasold
 */
public class MediaPOO {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        HashMap<String,String> alunosHash = new HashMap<>();
        
        alunosHash = alunos();
        
        for (String aluno : alunosHash.keySet()) {
            
            JOptionPane.showMessageDialog(null, "ALuno: "+ aluno + ": "+alunosHash.get(aluno));
            
            
        }
    }
    
    
    public static double mediaAluno(){
        
        double nota1, nota2, nota3, media;
        
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: "));
        
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: "));
        
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: "));
        
        media = (nota1+nota2+nota3) / 3;
        
        return media;
    }
    
    
    public static String resultadoMedia(){
        
        double media = mediaAluno();
        String resultado = "Reprovado";
        if (media >= 7){
            resultado = "Aprovado";
        }
        else if (media >= 5) {
            resultado = "Recuperação";
        }
        
        JOptionPane.showMessageDialog(null, media);
        return resultado;
               
    }
    
    public static HashMap<String,String> alunos(){
        HashMap <String, String >  alunos = new HashMap<>();
        
        for (int i = 0; i < 4; i++) {
            String aluno  = JOptionPane.showInputDialog("Digite o nome do Aluno");
            alunos.put(aluno,resultadoMedia() );
        }
        
        return alunos;
    }
}
