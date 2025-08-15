package Aula_03;

public class ContaCorrente {

    private String titular;
    public ContaCorrente(String titular) {
        this.titular = titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void mostrarInfo() {
        System.out.println("Titular: " + getTitular());
        System.out.println("Número da conta: " + getNumeroConta());
    }

    private String numeroConta;
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String saldo;
    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public void emitirSaldo() {
        System.out.println("Saldo: " + getSaldo());
    }

    public void sacar() {
        System.out.println("Saque realizado.");
    }

    public void depositar() {
        System.out.println("Depósito realizado.");
    }
    
}
