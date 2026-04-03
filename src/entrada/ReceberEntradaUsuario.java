
package entrada;

import java.util.Scanner;

/**
 *
 * @author Block
 */

public class ReceberEntradaUsuario {

    public static void main(String[] args) {

        // Scanner -> Recebe o valor digitado no terminal
        Scanner leituraTerminal = new Scanner(System.in);

        System.out.print("Digite seu nome e pressione [ENTER] logo em seguida: ");
        String nome = leituraTerminal.nextLine();

        System.out.print("Digite sua idade e pressione [ENTER] logo em seguida: ");
        int idade = leituraTerminal.nextInt();

        System.out.printf("Seu nome é %s e você tem %d anos de idade.", nome, idade);
    
        leituraTerminal.close();
    }
}
