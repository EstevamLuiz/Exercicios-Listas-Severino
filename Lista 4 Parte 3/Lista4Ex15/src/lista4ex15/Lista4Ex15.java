package lista4ex15;
import java.util.*;

public class Lista4Ex15 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int vetor[] = new int[10];
        
        System.out.println("Vetor:");
        for (int i = 0; i<vetor.length;i++){
            vetor[i]=aleatorio.nextInt(101)-50;
            System.out.println("Índice ["+i+"] no vetor " +vetor[i]);
        }
        for (int i = 0; i <vetor.length;i++) {
            if (vetor[i] < 0) {
                vetor[i] = 0;
            }
        } 
     System.out.println("Vetor com valores negativos substituídos por 0:");
        for (int i = 0; i<vetor.length; i++) {
            System.out.println("Índice [" + i + "] no vetor " +vetor[i]);
     }
 }
}
