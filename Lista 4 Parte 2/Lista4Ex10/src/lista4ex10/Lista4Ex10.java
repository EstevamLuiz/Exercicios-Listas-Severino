package lista4ex10;
import java.util.*;
public class Lista4Ex10 {
    public static void main(String[] args) {
        Random seila = new Random();
        int vetor[] = new int [6];
        int quantidade_pares = 0;
        int soma_dos_pares = 0;
        int quantidade_impares = 0;
        int soma_impares = 0;
        
        for (int i = 0; i<vetor.length; i++){
            vetor[i]=seila.nextInt(100);
            System.out.println("Índice ["+i+"] no vetor: " +vetor[i]);
        }
        System.out.println("Números pares gerados: ");
        for (int i=0;i<vetor.length;i++){
            if (vetor[i]%2==0){
                System.out.println(vetor[i]);
                soma_dos_pares+=vetor[i];
            }
        }
        System.out.println("Quantidade de números pares: " +quantidade_pares);
        System.out.println("Soma dos pares: " +soma_dos_pares);
        
        System.out.println("Números ímpares gerados: ");
        for (int i=0;i<vetor.length;i++){
            if (vetor[i]%2!=0){
                System.out.println(vetor[i]);
                quantidade_impares++;
            }
        }
        System.out.println("Quantidade de números ímpares: " +quantidade_impares);    
    }
}
