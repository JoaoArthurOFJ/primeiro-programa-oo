package Atividade04;

// CLASSE ABSTRATA: MeioDePagamento não pode ser instanciada diretamente,
// serve como modelo para as formas de pagamento concretas
abstract class MeioDePagamento {
    protected double valor;

    public MeioDePagamento(double valor) {
        this.valor = valor;
    }

    // MÉTODO ABSTRATO: não tem corpo aqui; cada subclasse concreta
    // é obrigada a implementar sua própria versão de pagar()
    public abstract void pagar();
}

public class Exemplo01 {
    public static void main(String[] args) {
        System.out.println("Teste");
    }
}