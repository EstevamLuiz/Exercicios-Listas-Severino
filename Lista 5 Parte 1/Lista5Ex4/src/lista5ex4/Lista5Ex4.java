package lista5ex4;
import java.util.*;
public class Lista5Ex4 {


    public static double calculadora_aumentoPercentual(double valor_antigo, double valor_novo){
        double aumentoPercentual = 0;
        double resultado = valor_novo - valor_antigo;
        aumentoPercentual = (resultado/valor_antigo)*100;
        return aumentoPercentual;
    }
    

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
       System.out.println("Digite o valor antigo do produto: ");
       double preco_antigo = input.nextDouble();
       System.out.println("Digite o novo valor do produto: ");
       double preco_novo = input.nextDouble(); 
    
       System.out.println("Calculando o aumento do protudo em porcentagem...");
       double aumentoPercentual = calculadora_aumentoPercentual(preco_antigo, preco_novo);
        System.out.printf("O aumento no produto foi de: %.2f%%\n", aumentoPercentual);
        

    }
    
}
