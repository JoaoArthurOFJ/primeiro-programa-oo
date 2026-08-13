// INTERFACE: define um contrato que as classes devem seguir
interface MeioDePagamento {
    void pagar(double valor);
}

// CLASSE: Pix é uma classe
class Pix implements MeioDePagamento {

    // SOBRESCRITA: implementação do método definido na interface
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via Pix.");
    }
}

// CLASSE: Cartao é uma classe
class Cartao implements MeioDePagamento {

    // SOBRESCRITA: implementação do método definido na interface
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com cartão.");
    }
}

// CLASSE: Boleto é uma classe
class Boleto implements MeioDePagamento {

    // SOBRESCRITA: implementação do método definido na interface
    @Override
    public void pagar(double valor) {
        System.out.println("Boleto de R$ " + valor + " gerado.");
    }
}

// CLASSE: Main é a classe principal do programa
public class Main {
    public static void main(String[] args) {

        // POLIMORFISMO: variável do tipo MeioDePagamento recebe um objeto Pix
        // CRIAÇÃO DE OBJETO: new Pix() cria um objeto da classe Pix
        MeioDePagamento pagamento = new Pix();

        pagamento.pagar(100.00);

        // POLIMORFISMO: a mesma variável agora recebe um objeto Cartao
        // CRIAÇÃO DE OBJETO: new Cartao() cria um objeto da classe Cartao
        pagamento = new Cartao();

        pagamento.pagar(250.00);

        // POLIMORFISMO: variável da interface recebe um objeto Boleto
        // CRIAÇÃO DE OBJETO: new Boleto() cria um objeto da classe Boleto
        MeioDePagamento boleto = new Boleto();

        boleto.pagar(80.00);
    }
}