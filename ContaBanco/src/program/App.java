import entities.ContaBanco;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        ContaBanco c1 = new ContaBanco(8532, "Alex Green",0);

        String nome;
        int conta;
        double saldo;

        System.out.println("Entre com seu numero de conta: ");
        conta = sc.nextInt();
        c1.setNumConta(conta);

        System.out.println("Entre com seu nome: ");
        nome = sc.next();
        c1.setNome(nome);

        System.out.println("Quer fazer um depósito em sua conta? s/n");
        String depositoDecisao = sc.next().toLowerCase();

        System.out.println(c1);

        if (depositoDecisao == "y"){

            System.out.println("Digite o valor do depósito: ");
            saldo = sc.nextDouble();
            c1.setSaldo(saldo);


        } else {
            System.out.println(c1);
        }



    }
}
