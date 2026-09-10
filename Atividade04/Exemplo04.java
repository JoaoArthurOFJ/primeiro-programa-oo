package Atividade04;

// SUBCLASSE CONCRETA: Boleto implementa o método abstrato pagar()
class Boleto extends MeioDePagamento {

    // CONSTRUTOR CHAMANDO super(valor)
    public Boleto(double valor) {
        super(valor);
    }

    @Override
    public void pagar() {
        System.out.println("Boleto de R$ " + valor + " gerado.");
    }
}

public class Exemplo04 {
    public static void main(String[] args) {
        Boleto boleto = new Boleto(80.00);
        boleto.pagar();
    }
}