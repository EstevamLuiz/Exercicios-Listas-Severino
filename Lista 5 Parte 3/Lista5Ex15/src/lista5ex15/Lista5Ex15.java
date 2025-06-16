package lista5ex15;

import java.util.*;

public class Lista5Ex15 {

    public static int numeros_primos(int x, int y) {
        int soma_primos = 0;

        for (int i = x; i <= y; i++) {
            if (i >= 2) {
                int divisores = 0;
                for (int n = 1; n <= i; n++) {
                    if (i % n == 0) {
                        divisores = divisores + 1;
                    }
                }
                if (divisores == 2) {
                    soma_primos = soma_primos + i;
                }
            }
        }
        return soma_primos;
    }

    public static void main(String[] args) {
        Scanner makoto = new Scanner(System.in);
        
        int x,y;
        
        do{
            System.out.println("Rodando o programa leitor de pares X e Y! Lembre-se usar apenas números inteiros e positivos, além de que x deve sempre ser menor do que y! Digite valores iguais para x e y para encerrar o programa.");
            System.out.println("Digite o valor de x");
            x = makoto.nextInt();
        
            System.out.println("Digite o valor de y");
            y = makoto.nextInt();
            
            if (x<0 || x>y || y<0){
                System.out.println("Inválido, lembre-se das condições de funcionamento do programa.");
                continue;
            }
            
            if (x==y){
                System.out.println("Programa encerrado.");
                break;
            }
            
            int soma = numeros_primos(x,y);
            System.out.println("Somatório: " +soma);
            
        } while (true);
        
    }

}
