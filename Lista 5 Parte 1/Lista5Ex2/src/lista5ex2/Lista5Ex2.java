package lista5ex2;

import java.util.*;

public class Lista5Ex2 {

    public static int inteiros_existentes_entre_numeroA_numeroB(int numero_a, int numero_b) {
        int soma = 0;

        if (numero_a < numero_b) {
            for (int i = numero_a + 1; i < numero_b; i++) {
                soma = soma + i;
            }
        } else if (numero_b < numero_a) {
            for (int i = numero_b + 1; i < numero_a; i++) {
                soma = soma + i;
            }
        } else {
            soma = 0;
        }
        return soma;
    }
    
    public static void main(String[] args) {
        Random seila = new Random();
    int numero_a = seila.nextInt(101);
    int numero_b = seila.nextInt(101);
    
        System.out.println("Cálculando os números inteiros existentes entre: " +numero_a+ " e " +numero_b);
        int resultado = inteiros_existentes_entre_numeroA_numeroB(numero_a, numero_b);
        System.out.println("E o resultado é: " +resultado);
    }

}
