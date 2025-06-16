package lista4ex1;
import java.util.*;

public class Lista4Ex1 {
    public static void main(String[] args) {
        Random valor_aleatorio = new Random();
        
        int valor[]=new int[15];
        int maior=valor[0];
        int menor=valor[0];
        int posicao_maior=0;
        int posicao_menor=0;
        
        for (int i=0; i<15; i++){
        valor[i]=valor_aleatorio.nextInt(100);
        }
        
       for (int i = 1;i<valor.length;i++){
           if (valor[i]>maior){
               maior = valor[i];
               posicao_maior=i;
           }
           if (valor[i]<menor){
               menor = valor[i];
               posicao_menor=i;
           }
       }
        
        for (int i=0; i<15; i++){
            System.out.println("Valor[" +i+ "] = " +valor[i]);
            if (i==posicao_maior){
                System.out.print(" (Posição do maior vetor) ");
            }
            if (i==posicao_menor){
                System.out.print(" (Posição do menor vetor) ");
            }
            System.out.println();
        }
    
        System.out.println("O maior valor é: " +maior+ " Na posição: " +posicao_maior);
        System.out.println("O menor valor é: " +menor+ " Na posição: " +posicao_menor);
    } 
    }
   
