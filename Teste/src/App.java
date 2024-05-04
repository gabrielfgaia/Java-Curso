import java.util.Scanner;

public class App {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float n1,n2,media;

        System.out.println("Inserir Nota1"); 

        n1 = sc.nextFloat();

        System.out.println("Inserir Nota2");
        n2 = sc.nextFloat();

        media = (n1 + n2)/2;
        System.out.printf("Sua média é de: %.2f", media);


        
        sc.close();


    }
}
