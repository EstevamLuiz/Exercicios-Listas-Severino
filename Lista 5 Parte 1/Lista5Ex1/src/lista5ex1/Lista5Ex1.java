package lista5ex1;
import java.util.*;

public class Lista5Ex1 {
    
    
    public static int soma_dos_divisiveis(int num_a, int num_b, int num_c){
        int soma = 0;
        
        for (int i = num_b; i<=num_c; i++){
            if (i%num_a==0){
                soma+=i;
            }
        }
    return soma;
    }
    
    public static void main(String[] args) {
       Random aleatorio = new Random();
        
       int num_a = aleatorio.nextInt(31)+2;
       int num_b = aleatorio.nextInt(51);
       int num_c = aleatorio.nextInt(51);
        
        System.out.println("A = "+num_a+ " B = "+num_b+" C= "+num_c);
        int resultado = soma_dos_divisiveis(num_a,num_b,num_c);
        System.out.println("O resultado da soma dos díviseis é: " +resultado);
    }
    
}

