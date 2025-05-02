public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 22.0;

        if (valorSolicitado < saldo){ 
            saldo = saldo - valorSolicitado;

            System.out.println("Novo saldo " + saldo);
        
        } else    
            System.out.println("Saldo insuficiente!");
        
        
        // System.out.println("novo saldo " + saldo);
        // Aqui você pode adicionar mais funcionalidades para o caixa eletrônico

    }
}
