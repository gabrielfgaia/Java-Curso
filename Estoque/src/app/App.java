package app;
import entidades.Produto;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        
        Produto produto1 = new Produto("", 0, 0);

        System.out.println("Digite o nome do produto: ");
        String nome = sc.next();
        produto1.setNome(nome);

        System.out.println("Digite o preço do produto");
        double preco = sc.nextDouble();
        produto1.setPreco(preco);
        
        System.out.println("Digite a quantidade do produto: ");
        int quantidade = sc.nextInt();
        produto1.setQuantidade(quantidade);


        System.out.println("\n\nDados iniciais" + produto1.toString());
    
        // Adicionar produtos ao estoque
        System.out.println("Quantidade que desejar adicionar: ");
        int quantidadeAdd = sc.nextInt();
        produto1.adicionarProdutos(quantidadeAdd);
        System.out.println("\n\nAtualizado: " + produto1.toString());

        
        // Remover produtos do estoque se necessário
        System.out.println("Quantidade que deseja remover do estoque: ");
        int quantidadeRem = sc.nextInt();
        produto1.removerProdutos(quantidadeRem);
        System.out.println("\n\nAtualizado: " + produto1.toString());

        System.out.println(produto1);
        
        sc.close();
    }
}
