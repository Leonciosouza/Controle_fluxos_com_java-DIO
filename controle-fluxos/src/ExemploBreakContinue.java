
public class ExemploBreakContinue {
    public static void main(String[] args) {
        // Uso do Break e Continue no corpo do For, em estrutura de repetição.
        // O Break interrompe o loop e sai do bloco de código, enquanto o Continue pula para a próxima iteração.
        for(int numero = 1; numero <= 5; numero++) {
            if(numero == 3)
            //    break;
                continue;
            System.out.println(numero);

            
        }
    }
}