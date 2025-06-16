package exercicio5l2;

import java.util.Scanner;

public class Exercicio5L2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int escolha, contadorAlcool, contadorGasolina, contadorDiesel;

        contadorAlcool = 0;
        contadorGasolina = 0;
        contadorDiesel = 0;

        System.out.println("Digite um número de 1 a 3 para selecionar sua preferência de combústivel, sendo: \n"
                + "1: Álcool.\n"
                + "2: Gasolina.\n"
                + "3: Diesel.\n"
                + "Pressione 4 para finalizar o programa.\n");
        escolha = input.nextInt();
        while (escolha != 4) {
            switch (escolha) {
                case 1:
                    escolha = 1;
                    System.out.println("Álcool selecionado.");
                    contadorAlcool = contadorAlcool + 1;
                    break;
                case 2:
                    escolha = 2;
                    System.out.println("Gasolina selecionada.");
                    contadorGasolina = contadorGasolina + 1;
                    break;
                case 3:
                    escolha = 3;
                    System.out.println("Diesel selecionado.");
                    contadorDiesel = contadorDiesel + 1;
                    break;
                default:
                    System.out.println("Selecione um número válido.");
                    break;
            }

            System.out.println("Deseja repetir a operação? Se nao, digite 4 para finalizar o programa.");
            System.out.println("Digite um número de 1 a 3 para selecionar sua preferência de combústivel, sendo: \n"
                    + "1: Álcool.\n"
                    + "2: Gasolina.\n"
                    + "3: Diesel.\n"
                    + "Pressione 4 para finalizar o programa.\n");
            escolha = input.nextInt();

        }
        System.out.println("Muito obrigado!");
        System.out.println("Escolheram Álcool: " + contadorAlcool);
        System.out.println("Escolheram Gasolina: " + contadorGasolina);
        System.out.println("Escolheram Diesel: " + contadorDiesel);
        input.close();
    }
}
