// Indica que este arquivo pertence à pasta chamada "tipos"
package tipos;

public class TiposBasicos {

    public static void main(String[] args) {
        // Inteiros --> Usados para números sem casas decimais.
        byte idade = 21; // Armazena até 127
        short ano = 2026; // Armazena até 32.767
        int quantidadePessoas = 200000; // O mais comum para números inteiros
        long distanciaEstrela = 9876543210L; // Para números gigantes, use o 'L' no final.

        // Ponto Flutuante --> Números com casas decimais.
        float altura = 1.75f; // Precisa do 'f' no final.
        double preco = 259.90; // Mais preciso que o float, padrão do Java.

        // Lógico e Caractere único --> Tipos simples.
        char inicialNome = 'A'; // Apenas um caractere, use aspas SIMPLES.
        boolean estaMatriculado = true; // Apenas true ou false.

        // Não-Primitivo (Classe) --> O String é um objeto que guarda textos.
        String mensagemBoasVindas = "Olá, bem-vindo ao curso de Java!";

        // Impressão Formatada (printf) --> O '%d' serve para números inteiros
        // (decimal).
        // %n ou \n --> Cria uma quebra de linha.
        System.out.printf("Idade: %d | Binário: %s%n", idade, Integer.toBinaryString(idade));
        System.out.printf("Ano: %d | Binário: %s%n", ano, Integer.toBinaryString(ano));
        System.out.printf("População: %d | Binário: %s%n", quantidadePessoas, Integer.toBinaryString(quantidadePessoas));
        System.out.printf("Distância Estelar: %d | Binário: %s%n", distanciaEstrela,
                Long.toBinaryString(distanciaEstrela));


        // Outros formatadores do printf --> %f (float), %c (char), %b (boolean), %s
        // (String).
        System.out.println("\n--- Outros formatadores do printf ---");
        System.out.printf("Altura: %.2f metros%n", altura); // '.2' limita a duas casas.
        System.out.printf("Preço: R$%.2f%n", preco);
        System.out.printf("Inicial do Nome: %c%n", inicialNome);
        System.out.printf("Status da Matrícula: %b%n", estaMatriculado);
        System.out.printf("Mensagem: %s%n", mensagemBoasVindas);
    }
}

