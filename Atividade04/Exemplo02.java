package Atividade04;

// SUBCLASSE CONCRETA: Pix implementa (dá corpo) ao método abstrato pagar()
class Pix extends MeioDePagamento {

    // CONSTRUTOR CHAMANDO super(valor): repassa o valor recebido
    // para o construtor da classe abstrata MeioDePagamento
    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void pagar() {
        System.out.println("Pagamento de R$ " + valor + " realizado via Pix.");
    }
}

public class Exemplo02 {
    public static void main(String[] args) {
        MeioDePagamento pagamento = new Pix(100.00);
        pagamento.pagar();
    }
}