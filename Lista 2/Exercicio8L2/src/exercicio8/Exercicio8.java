package exercicio8;
import java.util.Scanner;

public class Exercicio8 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Digite sua idade para visualizar em que categoria ela se encaixa.");
        
    int idade;
    idade = input.nextInt();
        
    if (idade<=7)
            System.out.println("Infantil.");
    if (idade >= 8 && idade <= 10)
            System.out.println("Juvenil.");
    if (idade >=11 && idade <= 15)
            System.out.println("Adolescente.");
    if (idade >=16 && idade <=30)
            System.out.println("Adulto.");
    else
            System.out.println("Senior.");
    }
    
}
