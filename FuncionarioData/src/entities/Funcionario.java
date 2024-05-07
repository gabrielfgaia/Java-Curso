package entities;

public class Funcionario {
    
    public String nome;
    public double salBruto;
    public double taxa;

    public double salLiquido(){

        return salBruto - taxa;

    }

    public void porcentagemAlmento(double porcentagem){

        this.salBruto += (salBruto * (porcentagem/100));

    }

    @Override
    public String toString(){

        return "Funcionário: " + nome
        + "\nValor imposto: "+ taxa
        + "\nValor salário líquido: " + salLiquido();
    
    }
}
