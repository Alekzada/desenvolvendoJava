package lacos_de_repeticao;

/**
 *
 * @author Block
 */
public class LacosDeRepeticao {
    public static void main(String[] args) {

        System.out.println("===For===");
        // For | Para -> o valor for verdadeiro vai ser executado
        for (int i = 0; i < 10; i++) {
            System.out.println("Elemento i = " + i);
        }

        System.out.println("\n===While===");
        // While | Em quanto -> o valor for verdadeiro vai ser executado
        int i = 0;
        while (i < 10) {
            System.out.println("Elemento i = " + i);
            i++;
        }

        // Esse laço de repetição você nunca vai precisar usar
        do {
            System.out.println("\n===Do-While===\n" + i);
            i++;
        } while (i == 292939);
    }
}
