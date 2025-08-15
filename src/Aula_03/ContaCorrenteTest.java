package Aula_03;

public class ContaCorrenteTest {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Teste");
        contaCorrente.setNumeroConta("1234-5");
        contaCorrente.setSaldo("R$34.000,00");
        contaCorrente.mostrarInfo();
        contaCorrente.emitirSaldo();
        contaCorrente.sacar();
        contaCorrente.depositar();

    }

}
    