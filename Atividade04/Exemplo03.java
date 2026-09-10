package Atividade04;

// SUBCLASSE CONCRETA: Cartao implementa o método abstrato pagar()
class Cartao extends MeioDePagamento {

    // CONSTRUTOR CHAMANDO super(valor)
    public Cartao(double valor) {
        super(valor);
    }

    @Override
    public void pagar() {
        System.out.println("Pagamento de R$ " + valor + " realizado com cartão.");
    }
}

public class Exemplo03 {
    public static void main(String[] args) {
        Cartao cartao = new Cartao(250.00);
        cartao.pagar();
    }
}