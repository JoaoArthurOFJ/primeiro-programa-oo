// EXCEÇÃO CUSTOMIZADA:
// Classe própria criada para dar um nome mais claro ao problema,
// em vez de usar uma exceção genérica como IllegalArgumentException.
class SaldoInsuficienteException extends RuntimeException {
    // EXCEÇÃO UNCHECKED:
    // Estende RuntimeException, então continua sendo unchecked —
    // o compilador não obriga tratar nem declarar "throws".
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
 
class ContaBancaria {
    protected double saldo;
 
    public void depositar(double valor) {
        saldo += valor;
    }
 
    public void sacar(double valor) {
        if (valor > saldo) {
            // THROW:
            // Lança a exceção customizada em vez de uma genérica.
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        saldo -= valor;
    }
}
 
public class Exemplo02 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100.00);
 
        // TRY/CATCH:
        // Captura especificamente o tipo customizado
        // SaldoInsuficienteException, deixando o código mais legível
        // e explícito sobre qual erro está sendo tratado.
        try {
            conta.sacar(500.00);
        } catch (SaldoInsuficienteException excecao) {
            System.out.println("Erro: " + excecao.getMessage());
        }
 
        System.out.println("Saldo final: " + conta.saldo);
    }
}