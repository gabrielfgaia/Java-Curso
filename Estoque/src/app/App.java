package app;
import entidades.Produto;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();
    
        System.out.println("Digite o nome do produto: ");
        produto.nome = sc.nextLine();

        System.out.println("Digite o preço do produto");
        produto.preco = sc.nextDouble();
    
        System.out.println("Digite a quantidade do produto: ");
        produto.quantidade = sc.nextInt();

        System.out.println("\n\nDados iniciais" + produto.toString());
    
        // Adicionar produtos ao estoque
        System.out.println("Quantidade que desejar adicionar: ");
        int quantidadeAdd = sc.nextInt();
        produto.adicionarProdutos(quantidadeAdd);
        System.out.println("\n\nAtualizado: " + produto.toString());

        
        // Remover produtos do estoque se necessário
        System.out.println("Quantidade que deseja remover do estoque: ");
        int quantidadeRem = sc.nextInt();
        produto.removerProdutos(quantidadeRem);
        System.out.println("\n\nAtualizado: " + produto.toString());

    
        sc.close();
    }
}
