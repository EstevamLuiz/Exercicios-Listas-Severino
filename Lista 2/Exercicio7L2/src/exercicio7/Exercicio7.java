package exercicio7;
import java.util.Scanner;

public class Exercicio7 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double salario,salarioNovo;
        
        System.out.println("Digite a quantia recebida em R$ em seu salário.");
        salario = input.nextInt();
        salarioNovo = salario + (salario*0.3);
        
        if (salario>1000)
            System.out.println("As condições de reajuste não são aplicadas ao seu caso.");
        else
            System.out.println("Seu sálario após o reajuste é de: " +salarioNovo);
        
    }
    
}
