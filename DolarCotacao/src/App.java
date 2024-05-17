import java.util.Scanner;
import util.CotacaoDol;

public class App {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            double valorDolar;
            double quantDolar;
            double valConvert;
            
            System.out.println("Insira o valor do dolar atual: ");
            valorDolar = sc.nextDouble();
            
            System.out.println("Insira a quantidade do dolar que quer comprar: ");
            quantDolar = sc.nextDouble();
            
            valConvert = CotacaoDol.realDolar(valorDolar,quantDolar);
            
            System.out.println(valConvert);
        }

    }
}
