import java.util.Random;

public class ExemploDoWhile {
    
    public static void main(String[] args) {
        System.out.println("Discando...");
        // O loop do while executa o bloco de código enquanto a condição for verdadeira.
        // O loop do while é semelhante ao while, mas a condição é verificada após a execução do bloco de código.
        do {
            System.out.println("Telefone tocando...");
            // O método tocando() retorna true se o telefone não atender.
        } while (tocando());
        // O loop do while executa o bloco de código pelo menos uma vez, mesmo que a condição seja falsa.
        System.out.println("Alô!!!");
       
    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)== 1;
        System.out.println("Atendeu? " + atendeu);
        // Negando o ato de continuar tocando.
        return ! atendeu;
    // O método tocando() retorna true se o telefone não atender.
    }
}
