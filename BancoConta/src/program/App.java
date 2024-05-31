package program;

import entities.ContaBanco;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        ContaBanco conta;

        String nome;
        double saldo;
        int numero;

        System.out.println("Entre com seu nome: ");
        nome = sc.next();
        
        System.out.println("Entre com o numero da conta: ");
        numero = sc.nextInt();

        System.out.println("Quer fazer um depósito em sua conta? s/n");
        String depositoDecisao = sc.next().toLowerCase();

        System.out.println();

        if (depositoDecisao.equals("s")){

            System.out.println("Digite o valor do primeiro depósito: ");
            saldo = sc.nextDouble();
            conta = new ContaBanco(numero,nome,saldo);
            System.out.println(conta);


            System.out.println("Entre com um valor de depósito: ");
            double deposito = sc.nextDouble();
            conta.depositar(deposito);

            System.out.println("Conta atualizada: " + conta);


            while (true) {
                System.out.println("Por favor, insira o valor a ser sacado:");
                double saque = sc.nextDouble();
                try {
                    conta.sacar(saque);
                    System.out.println("Saque realizado com sucesso!");
                    break; // Sai do loop se o saque for bem-sucedido
                }
                
                catch (Exception f) {
                    System.out.println(f.getMessage() + " Tente novamente.");
                }
            }

            System.out.println("Conta atualizada: " + conta);
        } else {

            conta = new ContaBanco(numero, nome);
            System.out.println(conta);

        }
    

    }
}

            
        
