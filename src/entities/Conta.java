package entities;


import interfaces.IConta;

public abstract class Conta implements IConta {

    private Cliente cliente;

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(valor <= this.saldo) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return  "Titular= " + cliente.getNome() + "\n"+
                "agencia= " + agencia + "\n"+
                "numero= " + numero +"\n"+
                "saldo= " + saldo;
    }
}
