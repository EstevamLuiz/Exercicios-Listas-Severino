package exercicio11;
import java.util.Scanner;


public class Exercicio11 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int mes;
        
        System.out.println("Digite um número de 1-12 para descobrir seu mês relativo."
                + "1 - Janeiro\n"
                + "2 - Fevereiro\n"
                + "3 - Março\n"
                + "4 - Abril\n"
                + "5 - Maio\n"
                + "6 - Junho\n"
                + "7 - Julho\n"
                + "8 - Agosto\n"
                + "9 - Setembro\n"
                + "10 - Outubro \n"
                + "11 - Novembro \n"
                + "12 - Dezembro \n");
        
        
        mes = input.nextInt();
   
        switch (mes) {
        case 1:
            System.out.println("Número 1 escolhido - Janeiro");
            break;
        case 2:
            System.out.println("Número 2 escolhido - Fevereiro");
            break;
        case 3:
            System.out.println("Número 3 escolhido - Março");
            break;
        case 4:
            System.out.println("Número 4 escolhido - Abril");
            break;
        case 5:
            System.out.println("Número 5 escolhido - Maio");
            break;
        case 6:
            System.out.println("Número 6 escolhido - Junho");
            break;
        case 7:
            System.out.println("Número 7 escolhido - Julho");
            break;
        case 8:
            System.out.println("Número 8 escolhido - Agosto");
            break;
        case 9:
            System.out.println("Número 9 escolhido - Setembro");
        case 10:
            System.out.println("Número 10 escolhido - Outubro");
            break;
        case 11:
            System.out.println("Número 11 escolhido - Novembro");
            break;
        case 12:
            System.out.println("Número 12 escolhido - Dezembro");
            break;       
        default:
            System.out.println("Entrada inválida, o número escolhido deve ser um número de 1 a 12.");
        }
        
        
        
        
    }
    
}
