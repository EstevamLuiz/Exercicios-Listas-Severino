package lista4ex6;
import java.util.*;
public class Lista4Ex6 {
    public static void main(String[] args) {
       Random aleatorio = new Random();
       int vetorA[] = new int [5];
       int vetorB[] = new int[5];
       int vetorC[] = new int[5];
       
         for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Primeiro vetor:");
            vetorA[i] = aleatorio.nextInt(51)-25; 
            System.out.println("Indice [" + i + "] no vetor " + vetorA[i]);
        }
    for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Segundo vetor:");
            vetorB[i] = aleatorio.nextInt(51)-25; 
            System.out.println("Indice [" + i + "] no vetor " + vetorB[i]);
        }
            System.out.println("Vetor resultante das subtrações");
            for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorB[vetorB.length - 1 - i] - vetorA[i];
            System.out.println("Terceiro vetor C de índice[" + i + "] = Segundo vetor B de índice[" + (vetorB.length - 1 - i) + "] - vetor A de índice[" + i + "] = ("
                    + vetorB[vetorB.length - 1 - i] + ") - (" + vetorA[i] + ") = (" + vetorC[i]+")");
        }
    }
}