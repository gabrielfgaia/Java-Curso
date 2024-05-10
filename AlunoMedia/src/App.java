//faça um programa com a aplicação do primeiro metodo da classe Aluno
// utilize o scanner para fazer a entrada dos dados manualmente
// e imprima o resultado na tela

import entities.Aluno;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        aluno.nome = sc.nextLine();

        System.out.println("Digite a primeira nota: ");
        aluno.nota1 = sc.nextDouble();
        
        while (aluno.nota1 > 30) {

            System.out.println("A nota deve ser menor ou igual a 30");
            aluno.nota1 = sc.nextDouble();

        }

        System.out.println("Digite a segunda nota: ");
        aluno.nota2 = sc.nextDouble();

        while (aluno.nota2 > 35) {

            System.out.println("A nota deve ser menor ou igual a 30");
            aluno.nota2 = sc.nextDouble();

        }

        System.out.println("Digite a terceira nota: ");
        aluno.nota3 = sc.nextDouble();

        while (aluno.nota3 > 35) {

            System.out.println("A nota deve ser menor ou igual a 30");
            aluno.nota3 = sc.nextDouble();

        }

        System.out.println(aluno.toString());


        sc.close();

    }
}