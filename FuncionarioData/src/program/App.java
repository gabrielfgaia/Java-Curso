package program;
import entities.Funcionario;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Digite o nome do funcionário: ");
        funcionario.nome = sc.next();
        
        System.out.println("Digite o salario bruto do funcionario: ");
        funcionario.salBruto = sc.nextDouble();

        System.out.println("Digite a taxa do imposto do funcionario: ");
        funcionario.taxa = sc.nextDouble();

        System.out.println(funcionario);

        System.out.println("Valor do aumento em porcentagem: ");
        double porcentagem = sc.nextDouble();
        
        funcionario.porcentagemAlmento(porcentagem);

        System.out.println("Atualizado com aumento" + funcionario);
        
        sc.close();

    }
}
