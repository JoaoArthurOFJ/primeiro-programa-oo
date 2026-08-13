// CLASSE: ContaBancaria é uma classe
class ContaBancaria {

    // ATRIBUTO: saldo é uma característica da conta
    // ENCAPSULAMENTO: protected controla o acesso ao atributo,
    // permitindo acesso pela própria classe e pelas classes filhas
    protected double saldo;

    // MÉTODO: realiza um depósito
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado. Saldo: R$ " + saldo);
    }
}

// HERANÇA: ContaPoupanca herda de ContaBancaria
class ContaPoupanca extends ContaBancaria {
}

// HERANÇA: ContaCorrente herda de ContaBancaria
class ContaCorrente extends ContaBancaria {

    // SOBRESCRITA: ContaCorrente modifica o comportamento
    // do método depositar() herdado da classe ContaBancaria
    @Override
    public void depositar(double valor) {

        // SUPER: chama o método depositar() da classe pai
        super.depositar(valor - 1.00);

        System.out.println("Foi descontada uma taxa de R$ 1,00.");
    }
}

// CLASSE: Main é a classe principal
public class Main {
    public static void main(String[] args) {

        // CRIAÇÃO DE OBJETO: new ContaCorrente()
        // cria um objeto da classe ContaCorrente
        ContaCorrente corrente = new ContaCorrente();

        // Chamada do método sobrescrito
        corrente.depositar(100.00);
    }
}