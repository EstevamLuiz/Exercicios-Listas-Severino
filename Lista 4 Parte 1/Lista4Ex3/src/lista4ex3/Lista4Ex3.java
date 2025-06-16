package lista4ex3;
import java.util.*;

public class Lista4Ex3 {
    public static void main(String[] args) {
        Random numero_aleatorio = new Random(100);
        
        int valor[] = new int[50];
        
        for (int i = 0; i < valor.length; i++){
            valor[i] = numero_aleatorio.nextInt(100);
        }
        
        System.out.println("Números positivos gerados:");
        for (int i = 0; i<valor.length; i++){
            if (valor[i]>0){
                
                System.out.println("Valor [" +i+ "] = " +valor[i]);
                
            }
        }
    }
}
