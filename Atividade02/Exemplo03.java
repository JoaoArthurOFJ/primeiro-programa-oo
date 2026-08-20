// TRY-WITH-RESOURCES / AUTOCLOSEABLE:
// A classe implementa AutoCloseable, o que permite que instâncias
// dela sejam usadas dentro de um try(...) e sejam fechadas
// automaticamente ao final do bloco, mesmo se ocorrer um erro.
class ConexaoSimulada implements AutoCloseable {
 
    public ConexaoSimulada() {
        System.out.println("Conexão aberta.");
    }
 
    public void executar() {
        System.out.println("Executando operação...");
    }
 
    @Override
    public void close() {
        // Este método é chamado AUTOMATICAMENTE pelo Java
        // ao sair do try-with-resources — ninguém precisa
        // chamar conexao.close() manualmente.
        System.out.println("Conexão fechada.");
    }
}
 
public class Exemplo03 {
    public static void main(String[] args) {
        // TRY-WITH-RESOURCES:
        // O recurso "conexao" é declarado dentro dos parênteses do try.
        // Ao final do bloco (com ou sem exceção), o Java chama
        // conexao.close() sozinho.
        try (ConexaoSimulada conexao = new ConexaoSimulada()) {
            conexao.executar();
        }
        // Não há catch aqui porque nenhum método lança exceção checked
        // neste exemplo — o foco é mostrar o fechamento automático.
    }
}