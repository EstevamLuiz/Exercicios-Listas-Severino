package lista5ex8;
import java.util.*;

public class Lista5Ex8 {
    
    public static double calculandoS (int numero){
        double S = 1.0;
        int fatorial = 1;

    for (int i = 1; i <= numero; i++){
        fatorial = fatorial * i;
        S = S + 1.0/fatorial;
    }
    return S;
    }
    
    public static void main(String[] args) {
        Scanner oi = new Scanner(System.in);
        System.out.println("Digite um número inteiro e positivo para realizar o cálculo.");
        int n = oi.nextInt();
        
        if (n<=0){
            System.out.println("Entrada inválida! Digite um número inteiro positivo maior do que 1.");
            return;
        }
        
        double resultadoS = calculandoS(n);
        System.out.println("O valor de S para n = "+n+ " é: " +resultadoS);
        
    }
    
}
