
package manipulacao_strings;

public class ManipulacaoStrings {
    public static void main(String[] args) {

        String frase1 = "     hoje eh sabado e amanha eh domingo     ";
        String frase2 = "     a branca de neve da disney nao eh branca     ";
        String frase3 = "";

        System.out.println("---Metodos de Strings--\n");

        var txt1 = frase1.strip();
        var txt2 = frase2.isEmpty();
        var txt3 = frase3.isEmpty();
        var txt4 = frase2.indexOf("branca");
        var txt5 = frase2.lastIndexOf("branca");
        var txt6 = frase2.strip().indexOf("branca");

        System.out.println("strip (Remove espaços): " + txt1 + "|FIM");
        System.out.println("Empty (Vazio | False): " + txt2);
        System.out.println("Empty (Vazio | True): " + txt3);
        System.out.println("indexOf (Primeira posição do elemento): " + txt4);
        System.out.println("lastIndexOf (Ultima posição do elemento): " + txt5);
        System.out.println("strip e indexOf:" + txt6);
        
    }
}
