package lista4ex11;
import java.util.*;
public class Lista4Ex11 {
    public static void main(String[] args) {
        Random aleatorio=new Random();
        int vet[]=new int[15];
        int soma_numeros=0;
        int contador_numeros_menores=0;
        for (int i = 0;i<vet.length;i++){
            vet[i]=aleatorio.nextInt(101);
        System.out.println("Índice ["+i+"] no vetor: " +vet[i]);
        soma_numeros+= vet[i];
        }  
    double media = (double) soma_numeros / vet.length;
        System.out.println("Média dos valores: " +media);
        
        System.out.println("Números com um valor abaixo do valor da média:");
        for (int i=0;i<vet.length;i++){
         if (vet[i]<media){
             System.out.println("Índice ["+i+"] no vetor: " +vet[i]);
             contador_numeros_menores++;
         }   
        }
    if (contador_numeros_menores==0){
        System.out.println("Nenhum número menor que a média foi gerado.");
    }
    }
}
