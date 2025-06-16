package lista4ex5;
import java.util.*;
public class Lista4Ex5 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
       int vetor_positivo[] = new int[10];
       int vetor_negativo[] = new int[10];
       int indice_vetor_negativo = 0;
    
    for (int i = 0; i < vetor_positivo.length; i++){
     vetor_positivo[i] = aleatorio.nextInt(201)-100;
    }
    
        System.out.println("Primeiro vetor (Todos os valores)");
        for (int i = 0; i < vetor_positivo.length; i++){
            System.out.println("Indice ["+i+"] no vetor: " +vetor_positivo[i]);   
        }
    
        for (int i = 0; i < vetor_positivo.length; i++){
            if (vetor_positivo[i]>0){
                vetor_negativo[indice_vetor_negativo] = vetor_positivo[i];
                indice_vetor_negativo++;
            }
        }
    
        System.out.println("Segundo vetor (Com apenas valores positivos)");
        for (int i = 0; i < indice_vetor_negativo; i++){
            System.out.println("Indice ["+i+"] no vetor: " +vetor_negativo[i]);
        }
    } 
}
