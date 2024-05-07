package program;

import entities.Retangulo;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Cria um metodo de entrada
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Digite a altura do retangulo");
        retangulo.altura = sc.nextDouble();

        System.out.println("Digite a largura do retangulo");
        retangulo.largura = sc.nextDouble();

        System.out.println(retangulo.toString());

    }
}
