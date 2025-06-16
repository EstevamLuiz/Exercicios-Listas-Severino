package lista5ex6;
import java.util.*;

public class Lista5Ex6 {

    public static double calculadora_medias(double nota1, double nota2, double nota3, String tipo_media){

        double media;
        if (tipo_media.equals("A")){
            media = (nota1+nota2+nota3)/3;
        } else if (tipo_media.equals("P")) {
            media = ((nota1*5+nota2*3+nota3*2)/10);
        } else {
            System.out.println("Entrada inválida, pressione (A) para cálcular a média aritimética ou (P) para cálcular a média ponderada.");
        return -1;
        }
        return media;
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite as três notas do aluno para calcular a média. "
                + "\nUtilize números de 0 a 10."
                + "\nPressione (A) para calcular a média aritimética e (P) para cálcular a média ponderada.  ");
    
        System.out.println("Aguardando a primeira nota...");    
        double n1 = input.nextDouble();
        System.out.println("Aguardando a segunda nota...");
        double n2 = input.nextDouble();
        System.out.println("Aguardando a terceira nota...");
        double n3 = input.nextDouble();
        
        System.out.println("Pressione (A) para cálcular a média aritimética ou (P) para cálcular a média ponderada.");
        String tipo_media = input.next();
        
        if (n1 < 0 || n1 > 10 || n2 < 0 || n2 > 10 || n3 < 0 || n3 > 10){
            System.out.println("Nota inválida, utilize números de 0 a 10.");
        return;
        }
        
         double resultado = calculadora_medias(n1, n2, n3, tipo_media);
        System.out.printf("A média do aluno foi: %.2f\n", resultado);
        }
}
