package lista4ex4;
import java.util.*;
public class Lista4Ex4 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int numero[] = new int[30];
        int numero_modificado[] = new int[30];
        for (int i = 0;i<numero.length; i++){
            numero[i]=aleatorio.nextInt(10);
    }
  
    for (int i = 0; i<numero.length;i++){
        if (numero[i]==0){
            numero_modificado[i]=1;
        } else {
            numero_modificado[i]=numero[i];
        }
    }
        
        System.out.println("Primeiro vetor:");
        for (int i = 0; i<numero.length;i++){
            System.out.println("Valor [" +i+ "]" +numero[i]);
        }
    
        System.out.println("Segundo vetor com os 0 substituidos por 1:");
        for (int i = 0; i<numero_modificado.length;i++){
            System.out.println("Valor ["+i+ "]" +numero_modificado[i]);
        }
    }
 }

