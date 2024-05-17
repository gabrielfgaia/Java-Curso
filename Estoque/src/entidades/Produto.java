package entidades; // Correct package declaration


public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;

    }

    //metodos get e set do atributo nome
    public void setNome(String nome){
        this.nome = nome;

    }

    public String getNome(){
        return nome;

    }

    //metodos get e set do atributo preço
    public void setPreco(double preco){
        this.preco = preco;

    }

    public double getPreco(){
        return preco;

    }

    //metodos get e set do atributo quantidade
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;

    }

    public double getQuantidade(){
        return quantidade;

    }


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
        return "\n~~~~~~~~~~~~~~~~~~~~\n"
        + getNome()
        + ", $ " 
        + String.format("%.2f", getPreco()) 
        + ", " 
        + getQuantidade() 
        + " unidades \nTotal: $ "
        + String.format("%.2f", valorTotalEmEstoque())
        + "\n~~~~~~~~~~~~~~~~~~~~\n";
        
    }


}
