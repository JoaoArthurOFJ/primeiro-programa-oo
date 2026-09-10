package Atividade02;

import java.io.FileReader;
import java.io.IOException;
 
public class ExemploChecked {
    public static void main(final String[] args) {
 
        // TRY/CATCH:
        // Aqui o try/catch é OBRIGATÓRIO (ou seria preciso declarar
        // "throws FileNotFoundException" na assinatura do main).
        // Sem isso, o código nem compila.
        try (FileReader arquivo = new FileReader("dados.txt")) {
            // EXCEÇÃO CHECKED:
            // FileNotFoundException é uma checked exception.
            // O compilador VERIFICA e EXIGE tratamento, porque é um
            // problema fora do controle do programa (o arquivo pode
            // não existir no sistema de arquivos).
            System.out.println("Arquivo aberto com sucesso.");
        } catch (final IOException e) {
            System.out.println("Não foi possível abrir o arquivo.");
        }
    }
}
 
// Diferença observada ao compilar:
// - No exemplo SEM try/catch, o javac RECUSA compilar e mostra o erro
//   "unreported exception FileNotFoundException; must be caught or
//   declared to be thrown" — porque FileNotFoundException é checked.
// - No Exemplo01 (unchecked), o javac compila normalmente mesmo sem
//   nenhum try/catch, porque exceções unchecked não são verificadas
//   pelo compilador.