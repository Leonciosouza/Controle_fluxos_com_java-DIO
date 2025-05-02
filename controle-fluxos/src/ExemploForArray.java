public class ExemploForArray {
    public static void main(String[] args) {
        
        // Em array o índice de elementos inicia em ZERO.
        // O último índice é sempre o tamanho do array - 1. 
        /* 
        String alunos [] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
    
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no índice x= " + x + " é " + alunos[x]);

        }
        */
        // Exemplo de uso do For Each como fluxo de controle para contagem de eleementos.
        // O For Each é um loop que percorre todos os elementos de uma coleção ou array.
        String alunos [] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
