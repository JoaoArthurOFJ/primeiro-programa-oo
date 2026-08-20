
class ContaBancaria {
    protected double saldo;
 
    public void depositar(double valor) {
        saldo += valor;
    }
 
    public void sacar(double valor) {
        if (valor > saldo) {
            // EXCEÇÃO UNCHECKED:
            // IllegalArgumentException estende RuntimeException.
            // O compilador NÃO obriga a tratar (não precisa de try/catch
            // nem de "throws" na assinatura do método).
            // THROW: aqui a exceção é lançada manualmente.
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo -= valor;
    }
}
 
public class Exemplo01 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100.00);
 
        // TRY/CATCH:
        // Mesmo sendo unchecked (não obrigatório), aqui optamos
        // por tratar a exceção para o programa não "quebrar".
        try {
            conta.sacar(500.00);
        } catch (IllegalArgumentException excecao) {
            System.out.println("Erro: " + excecao.getMessage());
        }
 
        System.out.println("Saldo final: " + conta.saldo);
    }
}
 