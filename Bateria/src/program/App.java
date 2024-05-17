package program;
import util.Celula;

public class App {
    public static void main(String[] args) {
        // Criando três células
        Celula celula1 = new Celula();
        Celula celula2 = new Celula();
        Celula celula3 = new Celula();

        // Consumindo carga das células 1 e 2
        celula1.consumir();
        celula2.consumir();
        
        // Adicionar carga da celula 3
        celula3.consumir();    

        // Imprimindo a carga total da bateria
        System.out.println("Carga total da bateria: " + Celula.getCargaBateria());
    }
}
