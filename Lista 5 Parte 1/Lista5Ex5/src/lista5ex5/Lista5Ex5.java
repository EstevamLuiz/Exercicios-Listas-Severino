package lista5ex5;
import java.util.*;

public class Lista5Ex5 {

    public static void calculadora_tabuada(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j<= i; j++){
                System.out.print(i * j + " ");
            }
        System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o número que deseja para ver sua respectiva tabela de multiplicação.");
        int numero = input.nextInt();
    
    calculadora_tabuada(numero);
        
    }
    
}
