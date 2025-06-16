package lista4ex7;
import java.util.*;
public class Lista4Ex7 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int vetorA[] = new int[15];
        int vetorB[] = new int[15];
        int numero_primo = 0;
        
        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = aleatorio.nextInt(100);
            System.out.println("Índice ["+i+"] no vetor: " +vetorA[i]);
        }
    
        for (int i = 0; i<vetorA.length; i++){
            int numero = vetorA[i];
            int divisores = 0;
            
        for (int n = 1; n<=numero; n++){
            if (numero % n == 0){
            divisores = divisores + 1;
            }
            }    
        if (divisores == 2){
        vetorB[numero_primo]=numero;
        numero_primo = numero_primo + 1;
        }
        }
    
        System.out.println("Números primos: ");
        if (numero_primo == 0){
            System.out.println("Não encontramos nenhum número primo.");
        } else {
            for (int i = 0; i<numero_primo; i++){
                System.out.println("Numero primo com índice ["+i+"] no vetor: " +vetorB[i]);
            }
        }
    }
}
