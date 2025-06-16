package lista5ex14;
import java.util.*;

public class Lista5Ex14 {

    public static int somadora_matriz(int[][] matriz){
        int soma_matriz = 0;
        for (int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz[i].length;j++){
                soma_matriz = soma_matriz+matriz[i][j];
            }
        }
    return soma_matriz;
    }
    
    public static void main(String[] args) {
        Random seila = new Random();
        int[][] matriz_A = new int[5][5];
        
        System.out.println("Matriz: ");
        for (int i = 0; i<matriz_A.length;i++){
            for (int j = 0; j<matriz_A[i].length;j++){
                matriz_A[i][j]=seila.nextInt(11);
                System.out.println(matriz_A[i][j]);
            }
        }
    int resultado_soma_matriz = somadora_matriz(matriz_A);
        System.out.println("A soma dos números da matriz é de: "+resultado_soma_matriz);
    }
    
}
