package lista5ex12;
import java.util.*;
public class Lista5Ex12 {

     public static void lerCaracteristicas(String[] sexo, String[] cor_olhos, String[] cor_cabelos, int[] idade) {
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Habitante " + (i + 1) + ":");
            
            System.out.print("Sexo (M) para másculino ou (F) para feminino: ");
            sexo[i] = input.next();  

            System.out.print("Cor dos olhos (A) para azuis ou (C) para castanhos): ");
            cor_olhos[i] = input.next(); 

            System.out.print("Cor dos cabelos (L) para louros, (P) para preto ou (C) para castanhos): ");
            cor_cabelos[i] = input.next(); 

            System.out.print("Idade: ");
            idade[i] = input.nextInt();
        }
    }
       public static double mediaIdade_OlhosCastanhos_CabelosPretos(String[] olhos, String[] cabelos, int[] idades) {
            int soma = 0;
            int contador = 0;

            for (int i = 0; i < 5; i++) {
            if (olhos[i].equals("C") && cabelos[i].equals("P")) {
                soma += idades[i];
                contador++;
            }
            }

            if (contador > 0) {
            return (double) soma / contador;
        } else {
            return 0.0;
        }
    }

    public static int maior_idade(int[] idades) {
        int maior = idades[0];

        for (int i = 1; i < 5; i++) {
            if (idades[i] > maior) {
                maior = idades[i];
            }
        }

        return maior;
    }

    public static int contadorMulheresJovens_OlhosAzuis_CabelosLouros(String[] sexo, String[] olhos, String[] cabelos, int[] idades) {
        int contador = 0;

        for (int i = 0; i < 5; i++) {
            if (sexo[i].equals("F") &&
                idades[i] >= 18 && idades[i] <= 35 &&
                olhos[i].equals("A") &&
                cabelos[i].equals("L")) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        String[] sexo = new String[5];
        String[] olhos = new String[5];
        String[] cabelos = new String[5];
        int[] idades = new int[5];

          lerCaracteristicas(sexo, olhos, cabelos, idades);

        
        double media = mediaIdade_OlhosCastanhos_CabelosPretos(olhos, cabelos, idades);
        int maior = maior_idade(idades);
        int mulheresEspecificas = contadorMulheresJovens_OlhosAzuis_CabelosLouros(sexo, olhos, cabelos, idades);

       
        System.out.println("\nResultados:");
        System.out.printf("Média de idade (olhos castanhos e cabelos pretos): %.2f\n", media);
        System.out.println("Maior idade entre os habitantes: " + maior);
        System.out.println("Número de mulheres com idade entre 18 e 35 anos, olhos azuis e cabelos louros: " + mulheresEspecificas);
     
    
        
    }
    
}
