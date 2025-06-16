package lista5ex13;
import java.util.*;

public class Lista5Ex13 {

    public static int[] ordem_decrescente(int [] A, int[] B){
        int[] C = new int[A.length+B.length];
        
        for (int i = 0; i<A.length;i++){
            C[i]=A[i];
        }
        for (int i = 0; i<B.length;i++){
            C[i+A.length]=B[i];
        }
        
        Arrays.sort(C);
        for (int i = 0;i<C.length/2;i++){
            int posicao_temporaria=C[i];
            C[i] = C[C.length - 1 - i];
            C[C.length - 1 - i] = posicao_temporaria;
        }
        return C;
        
    } 
    
    public static void main(String[] args) {
        Random seila = new Random();
        
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        
        System.out.println("Vetor A:");
        for (int i = 0; i<vetorA.length;i++){
            vetorA[i] = seila.nextInt(101);
            System.out.println("Índice ["+i+"] no vetor: "+vetorA[i]);
        }
        System.out.println("Vetor B:");
        for (int i = 0; i<vetorB.length;i++){
            vetorB[i]=seila.nextInt(101);
            System.out.println("Índice ["+i+"] no vetor: "+vetorB[i]);
        }
    
        int[] vetorC = ordem_decrescente(vetorA,vetorB);
        
        System.out.println("Vetor C com os elementos em ordem decrescente: ");
        for (int i = 0; i<vetorC.length;i++){
            System.out.println("Índice ["+i+"] no vetor: "+vetorC[i]);
        }
    }
    
}
