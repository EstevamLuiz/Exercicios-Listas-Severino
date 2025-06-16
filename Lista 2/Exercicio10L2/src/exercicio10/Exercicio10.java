package exercicio10;
import java.util.Scanner;

public class Exercicio10 {

    
    public static void main(String[] args) {
     
    Scanner input = new Scanner (System.in);
        
    int dia;
    
        System.out.println("Digite um número de 1-7 para ver seu dia da semana relativo. \n"
                 + " 1 - Domingo\n"
                + "2 - Segunda\n"
                + "3 - Terça\n"
                + "4 - Quarta\n"
                + "5 - Quinta\n"
                + "6 - Sexta\n"
                + "7 - Sabado");
        
        dia = input.nextInt();
        
           switch (dia) {
        case 1:
            System.out.println("Número 1 escolhido - Domingo");
            break;
        case 2:
            System.out.println("Número 2 escolhido - Segunda");
            break;
        case 3:
            System.out.println("Número 3 escolhido - Terça");
            break;
        case 4:
            System.out.println("Número 4 escolhido - Quarta");
            break;
        case 5:
            System.out.println("Número 5 escolhido - Quinta");
            break;
        case 6:
            System.out.println("Número 6 escolhido - Sexta");
            break;
        case 7:
            System.out.println("Número 7 escolhido - Sábado");
            break;
        default:
            System.out.println("Invalido, o número escolhido precisa ser de 1 à 7.");
    
    }
    
   } 
}
