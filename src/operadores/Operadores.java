package operadores;

/**
 *
 * @author Block
 */

public class Operadores {
    public static void main(String[] args) {
        int soma = 1 + 5;
        int subtracao = 3 - 1;
        int multiplicacao = 10 * 5;
        double divisao = 10 / 2;
        double restoDivisao = 5 % 3;
        System.out.println("===Operadores principais do Java===\nSOMA: " + soma + "\nSUBTRACAO: " + subtracao
                + "\nMULTIPLICACAO: " + multiplicacao + "\nDIVISÃO: " + divisao + "\nRESTO DA DIVISAO: "
                + restoDivisao);

        System.out.println(
                "\n===Operadores lógicos===\nMAIOR: >\nMENOR: <\nMAIOR OU IGUAL: >=\nMENOR OU IGUAL: <=\nIGUAL: ==\nDIFERENTE: !=\nOPERADOR NOT: !\nOPERADOR OU: ||\nOPERADOR E: &&");
    }
}
