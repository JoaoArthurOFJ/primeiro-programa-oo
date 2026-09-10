package Atividade03;

class ContaBancaria {

    private String titular;

    public ContaBancaria(String titular) {
        this.titular = titular;
    }

    public void alterarTitular(String novoTitular) {
        this.titular = novoTitular;
    }
}

public class Exemplo01 {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Maria");

        conta.alterarTitular("Joao");
    }
}