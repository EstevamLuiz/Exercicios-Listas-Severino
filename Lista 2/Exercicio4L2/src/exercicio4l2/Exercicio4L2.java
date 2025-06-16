package exercicio4l2;
import java.util.Scanner;

public class Exercicio4L2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        double massaInicial,massa,massaFinal;
        int tempo,segundos,minutos,horas,restoTempo;
        
        System.out.println("Digite o valor da massa inicial do material em gramas.");
        massaInicial = input.nextDouble();
        
        tempo = 0;
        massa=massaInicial;
                
        while (massaInicial>0.5){
            massaInicial = massaInicial/2;
            System.out.println("A massa final do material em gramas é de: " +massaInicial);
            tempo = tempo+50;
        }
        
        horas = tempo/3600;
        restoTempo = tempo % 3600;
        minutos = restoTempo/60;
        segundos = restoTempo%60;
        
        System.out.println("A massa inicial era de: " +massa);
        System.out.println("A conversão foi feita aproximadamente em: " +horas+ " horas," +minutos+ " minutos, e " +segundos+ "segundos.");
        
    }
    
}
