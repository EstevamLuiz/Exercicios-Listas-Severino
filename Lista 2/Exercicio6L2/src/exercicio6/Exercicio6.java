package exercicio6;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
      
      Scanner input = new Scanner (System.in);
     
      double peso,altura,IMC;
      
        System.out.println("Para cálcular o seu IMC, digite primeiro seu peso.");
        
        peso = input.nextDouble();
        
        System.out.println("Agora, digite sua altura.");
        
        altura = input.nextDouble();
        
        IMC = peso/altura*altura;
        
        if (IMC<20){
            System.out.println("Abaixo do peso.");
        } else if (IMC>=20 || IMC <25){
            System.out.println("Peso normal.");
        } else if (IMC>=25 || IMC<=30){
            System.out.println("Sobre peso.");
        } else if (IMC>30 && IMC<=40){
            System.out.println("Obeso.");
        } else
            System.out.println("Obesidade mórbida.");
      
    }
    
}
