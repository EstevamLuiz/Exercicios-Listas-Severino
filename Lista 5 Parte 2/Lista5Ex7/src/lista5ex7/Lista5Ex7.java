package lista5ex7;
import java.util.*;
public class Lista5Ex7 {
    
    public static int tempo_jogo (int hora_inicio, int hora_fim, int minuto_inicio, int minuto_fim){
        
        int minutosInicio = hora_inicio * 60 + minuto_inicio;
        int minutosFim = hora_fim * 60 + minuto_fim;
        
        int duracao = minutosFim - minutosInicio;
        if (minutosFim<minutosInicio){
                duracao = 1440 - minutosInicio + minutosFim;
        }
        
        return duracao;
    }
    
    public static void main(String[] args) {
        Scanner seila = new Scanner(System.in);
        
        System.out.println("Digite em que horas o jogo começou");
        int hora_inicio = seila.nextInt();
        
        System.out.println("Digite em qual(is) minuto(s) o jogo começou.");
        int minuto_inicio = seila.nextInt();
        
        System.out.println("Digite em que horas o jogo terminou");
        int hora_fim = seila.nextInt();
        
        System.out.println("Digite em qual(is) minuto(s) o jogo terminou.");
        int minuto_fim = seila.nextInt();
        
        int duracao_total = tempo_jogo (hora_inicio, hora_fim, minuto_inicio, minuto_fim);
        int horas = duracao_total/60;
        int minutos = duracao_total % 60;
        
        System.out.println("O jogo durou "+horas+" horas e "+minutos+" minutos.");
    }
    
}
