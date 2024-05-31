package entities;

public class ContaBanco {

    
    private int numero;
    private String titular;
    private double saldo;
    
    //construtor
    public ContaBanco(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public ContaBanco(int numero, String titular, double depositoInicial) {
        this.numero = numero;
        this.titular = titular;
        depositar(depositoInicial);
    }

    //gets
    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }


    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }
    
    public void sacar(double valor) {
        saldo -= valor + 5;
        if (saldo < 0){
            System.out.println("Valor do saque é muito alto.");  
            saldo += valor + 5;          
        }
        saldo -= valor + 5.0;
    }
    
    @Override
    public String toString() {
        return "Conta "
                + numero
                + ", Titular: "
                + titular
                + ", Saldo: $ "
                + String.format("%.2f", saldo);
    }

    
}
