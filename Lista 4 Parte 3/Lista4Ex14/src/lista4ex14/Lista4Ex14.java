package lista4ex14;
import java.util.*;

public class Lista4Ex14 {


    public static void main(String[] args) {
       Random aleatorio = new Random();
        
       int vetorA[] = new int[10];
       int vetorB[] = new int[10];
       int resultado_multiplicacao[] = new int[10];
       int resultado_divisao[] = new int[10];
       
        System.out.println("Primeiro vetor:");
        for (int i = 0; i < vetorA.length; i++){
            vetorA[i]=aleatorio.nextInt(100);
            System.out.println("Índice ["+i+"] no vetor " +vetorA[i]);
        }
        
        System.out.println("Segundo vetor:");
        for (int i = 0; i < vetorB.length; i++){
            vetorB[i]=aleatorio.nextInt(100);
            System.out.println("Índice ["+i+"] no vetor " +vetorA[i]);
        }
        
        System.out.println("Vetor resultante da operação de multiplicação entre os dois vetores:");
        for (int i = 0; i < resultado_multiplicacao.length; i++){
            resultado_multiplicacao[i]= vetorA[i] * vetorB[i];
            System.out.println("Índice ["+i+"] no vetor " +resultado_multiplicacao[i]);
        }
        
        System.out.println("Vetor resultante da operação de divisão entre os dois vetores:");
        for (int i = 0; i < resultado_divisao.length; i++){
            resultado_divisao[i]= vetorA[i]/vetorB[i];
            System.out.println("Índice ["+i+"] no vetor " +resultado_divisao[i]);
        
    }
    } 
}
