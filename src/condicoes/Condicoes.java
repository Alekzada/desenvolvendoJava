package condicoes;

/**
 *
 * @author Block
 */

public class Condicoes {
    public static void main(String[] args) {

        /*
         * if | Se
         * else if | senão se
         * else | Senão
         */

        int numero1 = 2;
        // Verifica se o valor do numero1 é igual a 2: se for verdade executar o println
        if (numero1 == 2) {
            System.out.println("Numero1 é igual a 2");
        }

        int numero2 = 3;
        // Verifica se o valor do numero2 é maior que 3: Se for verdade executa o
        // println, caso o contrario o else é ativado
        if (numero2 > 3) {
            System.out.println("Numero2 é maior que 3");
        } else {
            System.out.println("Numero2 não é maior que 3");
        }

    }
}
