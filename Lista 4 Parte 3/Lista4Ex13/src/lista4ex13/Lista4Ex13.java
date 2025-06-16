package lista4ex13;
import java.util.*;

public class Lista4Ex13 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();
        
        int vetor[] = new int[10];
        
        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++){
        vetor[i]=aleatorio.nextInt(101);
            System.out.println("Índice ["+i+"] no vetor: "+vetor[i]);
    }
    
        System.out.println("Digite o número que deseja para saber se ele se encontra no vetor!");
        int numero = input.nextInt();
        int resultado = numero;
        int numero_encontrado = 0;
        
        for (int i = 0; i<vetor.length; i++){
            if (vetor[i]==resultado){
                System.out.println("O número " +resultado+" digitado foi encontrado e se encontra no índice ["+i+"]");
                numero_encontrado = numero_encontrado+1;
            }
        }
    if (numero_encontrado == 0){
        System.out.println("O número "+resultado+" não foi encontrado no vetor.");
    }
    }
}
