package lista3ex11;

public class Lista3Ex11 {

    
    public static void main(String[] args) {
        double population_brazundangas = 90000000;
        double population_uniao_milanos = 200000000;
        
        double taxa_crescimento_brazundangas = 3.0/100;
        double taxa_crescimento_uniao_milanos = 1.5/100;
        
        int anos =0;
        
        while (population_brazundangas<population_uniao_milanos){
            population_brazundangas = population_brazundangas + (population_brazundangas*taxa_crescimento_brazundangas);
            population_uniao_milanos = population_uniao_milanos + (population_uniao_milanos*taxa_crescimento_uniao_milanos);
            anos = anos+1;
        }
    
        System.out.println("Levara "+anos+" anos para a população dos brazundangas ultrapacar a população da união milanos.");
    
    }
    
}
