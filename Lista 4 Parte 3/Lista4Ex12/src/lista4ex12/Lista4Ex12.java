package lista4ex12;
import java.util.*;
public class Lista4Ex12 {
    public static void main(String[] args) {
       Random aleatorio = new Random();

        String[] nomes = {
            "Ana", "Bruno", "Carla", "Diego", "Janaina","Severino", "Gabriela", "Henrique", "Isabela", "João"};
        double[] nota_aluno = new double[10];
        double soma = 0;
        System.out.println("Notas dos alunos: ");
        for (int i = 0; i < nota_aluno.length; i++) {
            nota_aluno[i] = aleatorio.nextInt(11);
            soma += nota_aluno[i];
            System.out.println(nomes[i] + ": " + nota_aluno[i]);
        }
        double media = soma / nota_aluno.length;
        System.out.println("Média da turma: " +media);
        System.out.println("Alunos com nota abaixo da média: ");
        for (int i = 0; i < nota_aluno.length; i++) {
            if (nota_aluno[i] < media) {
                System.out.println(nomes[i] + "Nota: " + nota_aluno[i]);
            }
        }
        System.out.println("Alunos com nota igual ou acima da média: ");
        for (int i = 0; i < nota_aluno.length; i++) {
            if (nota_aluno[i] >= media) {
                System.out.println(nomes[i] + "Nota: " + nota_aluno[i]);
            }
        }
    }
}