package entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contaList;

    public Banco(String nome) {
        this.nome = nome;
        this.contaList = new ArrayList<>();
    }

    public void addConta(Conta conta) {
        this.contaList.add(conta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContaList() {
        return contaList;
    }

    public void imprimirNomesClientes() {
        this.contaList.stream().forEach(conta -> System.out.println("Cliente: "+ conta.getCliente().getNome()));
    }

}
