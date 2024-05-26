package interfaces;

import entities.Conta;

public interface IConta {

    void depositar(double valor);
    void sacar(double valor);
    void transferir(double valo, Conta contaDestino);
}
