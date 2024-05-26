import entities.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Criar um Cliente
        Cliente jhonny = new Cliente("Jhonny Azevedo");
        Cliente mylena = new Cliente("Mylena Moraes");

        // Criar contas
        Conta contaCorrente = new ContaCorrente(jhonny);
        Conta poupanca = new ContaPoupanca(jhonny);
        Conta contaCorrente2 = new ContaCorrente(mylena);
        Conta poupanca2 = new ContaPoupanca(mylena);

        // Depositar nas contas
        contaCorrente.depositar(500);
        poupanca.depositar(1500);

        // Fazer Tranferência entre contas
        poupanca.transferir(600, contaCorrente);

        // Imprimir extrato
        System.out.println("==== Extrato Conta Corrente ====");
        System.out.println(contaCorrente);

        System.out.println();

        System.out.println("==== Extrato Conta Poupança");
        System.out.println(poupanca);

        // Criar o Banco
        Banco santander = new Banco("Santander");
        santander.addConta(poupanca);
        santander.addConta(contaCorrente);
        santander.addConta(contaCorrente2);
        santander.addConta(poupanca2);

        System.out.println();

        // imprimir Nome dos Clientes
        System.out.println("=== Nome dos Titulares ===");
        santander.imprimirNomesClientes();



    }
}