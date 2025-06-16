package lista5ex11;

public class Lista5Ex11 {

public static int[] achador_de_numeros_perfeitos(){
    int numeros_perfeitos[] = new int[3];
    int contador = 0;
    int n = 2;
    
    while (contador<3){
        int soma = 0;
        
        for (int i = 1; i < n; i++){
            if (n % i == 0){
                soma = soma + i;
            }
        }
    
        if (soma==n){
            numeros_perfeitos[contador] = n;
            contador = contador + 1;
        }
    
        n = n + 1;
        
    }
    return numeros_perfeitos;
}
    
    public static void main(String[] args) {
        
        int[] resultado_numeros_perfeitos = achador_de_numeros_perfeitos();
        
        System.out.println("Os primeiros três números perfeitos são: ");
    
        for (int i = 0; i < resultado_numeros_perfeitos.length; i++) {
            System.out.println(resultado_numeros_perfeitos[i]);
        }
    }
    
}
