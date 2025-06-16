package lista5ex10;

import java.util.*;

public class Lista5Ex10 {

    public static int[] calculadora_de_Fatoriais(int[] primeiro_vetor) {
        int[] segundo_vetor = new int[primeiro_vetor.length];

        for (int i = 0; i < primeiro_vetor.length; i++) {
            int n = primeiro_vetor[i];
            long fatorial = 1;
            if (n < 0) {
                segundo_vetor[i] = -1;
            } else {
                for (int j = 2; j <= n; j++) {
                    fatorial *= j;
                }
                segundo_vetor[i] = (int) fatorial;
            }
        }
        return segundo_vetor;
    }

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] vetorA = new int[10];

        System.out.println("Primeiro vetor:");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = aleatorio.nextInt(10);
            System.out.println("Índice [" + i + "]: no vetor: " + vetorA[i]);
        }
        int[] vetorB = calculadora_de_Fatoriais(vetorA);
        System.out.println("Segundo vetor com os fatoriais do primeiro vetor:");
        for (int i = 0; i < vetorB.length; i++) {
            if (vetorB[i] == -1) {
                System.out.println("Índice [" + i + "] possui fatorial inválido pois é um número negativo");
            } else {
                System.out.println("Índice [" + i + "] no vetor " + vetorB[i]);
            }
        }
    }
}
