package programa;
import classes.Triangle;
import java.util.Scanner;

public class Teste {

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //Criação da instancia do objeto da classe Triangle
        Triangle x,y;
        x = new Triangle();
        y = new Triangle();
        
        
        System.out.println("Digite as medidas do triângulo X: ");
        System.out.println("Lado 1: ");
        x.l1= sc.nextDouble(); //Entrada dos dados do objeto

        System.out.println("Lado 2: ");
        x.l2= sc.nextDouble();//Entrada dos dados do objeto

        System.out.println("Lado 3: ");
        x.l3= sc.nextDouble();//Entrada dos dados do objeto



        System.out.println("Digite as medidas do triângulo Y: ");
        System.out.println("Lado 1: ");
        y.l1 = sc.nextDouble();//Entrada dos dados do objeto

        System.out.println("Lado 2:");
        y.l2 = sc.nextDouble();//Entrada dos dados do objeto

        System.out.println("Lado 3:");
        y.l3 = sc.nextDouble();//Entrada dos dados do objeto

        
        
        System.out.printf("A área do triangulo x é de %.2f",x.calculateArea());
        System.out.printf("\nA área do triangulo y é de %.2f",y.calculateArea());

        
        sc.close();

            


        }

}
