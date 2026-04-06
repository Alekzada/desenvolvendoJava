import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        var header  = "+------+-------+-----------+------+-------+";
        var header1 = "| Nome | Marca | Categoria | Peso | Preço |";
        var header2 = "+------+-------+-----------+------+-------+";

        System.out.println(header);
        System.out.println(header1);
        System.out.println(header2);
        // var stock = new Stock(new String[]{"Alimentos", "Limpeza"});
        // var menu = new Menu();

        // Product candida = menu.getProductData(scanner);
        // Product trakinas = menu.getProductData(scanner);
        // stock.productRegistry(candida);
        // stock.productRegistry(trakinas);
        
        // menu.printProductInformation(trakinas);
        // menu.printProductInformation(candida );

        scanner.close();
    }
}
