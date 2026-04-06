package condicoes;

/**
 *
 * @author block
 */

public class CondicoesSwitchCase {
    public static void main(String[] args) {
        String mesAtual = "Abril";

        switch (mesAtual) {
            case "Janeiro" -> System.out.println("Janeiro");
            case "Fevereiro" -> System.out.println("Fevereiro");
            case "Março" -> System.out.println("Março");
            case "Abril" -> System.out.println("Abril");
            case "Maio" -> System.out.println("Maio");
            case "Junho" -> System.out.println("Junho");
            case "Julho" -> System.out.println("Julho");
            case "Agosto" -> System.out.println("Agosto");
            case "Setembro" -> System.out.println("Setembro");
            case "Outubro" -> System.out.println("Outubro");
            case "Novembro" -> System.out.println("Novembro");
            case "Dezembro" -> System.out.println("Dezembro");
            default -> System.out.println("Mês inválido");
        }
    }
}
