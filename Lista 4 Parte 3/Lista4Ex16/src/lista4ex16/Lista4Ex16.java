package lista4ex16;
import java.util.*;

public class Lista4Ex16 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner input = new Scanner(System.in);

        int numeros_do_usuario[] = new int[6];
        int resultado_megasena[] = new int[6];
        int acerto = 0;

        System.out.println("Digite seis números para apostar na mega sena.");
        for (int i = 0; i < numeros_do_usuario.length; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            numeros_do_usuario[i] = input.nextInt();
        }

        System.out.println("Resultado da mega sena:");
        for (int i = 0; i < resultado_megasena.length; i++) {
            resultado_megasena[i] = aleatorio.nextInt(61);
            System.out.println("Resultado: [" + i + "] " + resultado_megasena[i]);
        }

        for (int i = 0; i < resultado_megasena.length; i++) {
            for (int j = 0; j < numeros_do_usuario.length; j++) {
                if (resultado_megasena[i] == numeros_do_usuario[j]) {
                    acerto++;
                    break;
                }
            }
        }

        System.out.println("Você acertou " + acerto + " número(s)!");
    }
}