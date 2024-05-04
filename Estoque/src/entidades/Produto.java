package entidades; // Correct package declaration

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;


    public double valorTotalEmEstoque() {
        return preco * quantidade;
    }

    public void adicionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return nome + ", $ " + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: $ "
                + String.format("%.2f", valorTotalEmEstoque());
    }

}
