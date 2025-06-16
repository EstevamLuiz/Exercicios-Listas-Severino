package exercicio9;
import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;

        System.out.println("Descubra sua classe eleitoral, para isto digite sua idade: ");
        idade = input.nextInt();

        if (idade < 16) {
            System.out.println("Não eleitor.");
        } else if ((idade >= 18 && idade < 65)) {
            System.out.println("Eleitor obrigatório.");
        } else if ((idade >= 16 && idade < 18) || idade >= 65) {
            System.out.println("Eleitor facultativo.");
        }

        input.close();
    }
}

