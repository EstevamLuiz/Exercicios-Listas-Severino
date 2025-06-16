package lista4ex8;
import java.util.*;
public class Lista4Ex8 {
    public static void main(String[] args) {
        Random numero_aleatorio = new Random();
        int vet[] = new int[15];
        
        System.out.println("Primeiro vetor: ");
        for (int i = 0; i<vet.length;i++){
            vet[i]=numero_aleatorio.nextInt(100);
            System.out.println("Índice ["+"] no vetor: "+vet[i]);
       }
    int maior = vet[0];
    for (int i = 1; i<vet.length;i++){
        if(vet[i]>maior){
            maior = vet[i];
        }
    }
    
    if (maior==0){
        System.out.println("Não é possível dividir um número com valor zero ou menor.");
    } else {
        System.out.println("Segundo vetor com os valores sendo divididos pelo maior valor:");
        for (int i = 0; i<vet.length;i++){
            double resultado = (double) vet[i]/maior;
            System.out.println("Índice ["+i+"] com resultado:" +resultado);
        }
    }
    
    }
    
}
