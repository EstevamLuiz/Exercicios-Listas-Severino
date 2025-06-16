package lista5ex3;
import java.util.*;

public class Lista5Ex3 {

    public static void contador_de_tempo(int segundos_totais, int resultado_tempo[]){
        resultado_tempo[0]=segundos_totais/3600;
        resultado_tempo[1]=(segundos_totais%3600) / 60;
        resultado_tempo[2]=segundos_totais%60;
    }
    
    public static void main(String[] args) {
    Random que_horas_sao = new Random();
    int segundos = que_horas_sao.nextInt(1000000000);
    
    int tempo[]=new int[3];
    
    contador_de_tempo(segundos, tempo);
    
    System.out.println("Total de segundos: " + segundos);
        System.out.println("Segundos totais em joras: " + tempo[0]);
        System.out.println("Segundos totais em minutos: " + tempo[1]);
        System.out.println("Segundos: " + tempo[2]);
    
        
        
    }
    
}
