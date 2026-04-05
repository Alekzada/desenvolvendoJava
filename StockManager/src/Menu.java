import java.util.Scanner;


public class Menu {
    private static final byte REGISTRY = 1;
    private static final byte SEARCH = 2;
    private static final byte HELP = 3;

    public void MainMenu(Scanner scanner) {
        boolean programStillRunning = true;
        byte currentOption = -1;

        while (programStillRunning) {
            System.out.println("1: Registre");
            System.out.println("2: Procure");
            // System.out.println(": Liste todos"); -> acessar a partir de Procure
            // System.out.println(": Remova");      -> acessar a partir de Procure
            System.out.println("5: Ajuda");

            currentOption = scanner.nextByte();

            switch(currentOption) {
                case REGISTRY:
                    this.registryMenu(scanner);
                    break;
                case SEARCH:
                    this.searchMenu(scanner);
                    break;
                case HELP:
                    this.helpMenu(scanner);
                    break;
            }
        }
    }

    private void helpMenu(Scanner scanner) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'helpMenu'");
    }

    private void searchMenu(Scanner scanner) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'searchMenu'");
    }

    private void registryMenu(Scanner scanner) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registryMenu'");
    }

    public Product getProductData(Scanner scanner) {
        String name, brand, category;
        float weight, price;

        System.out.println("Insira os dados do novo produto: ");
        System.out.print("Nome: ");
        name = scanner.nextLine();

        System.out.print("Marca: ");
        brand = scanner.nextLine();

        System.out.print("Categoria: ");
        category = scanner.nextLine();

        System.out.print("Peso: ");
        weight = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Preço: ");
        price = scanner.nextFloat();
        scanner.nextLine();

        return new Product(name, brand, category, weight, price);
    }

    public void printProductInformation(Product product) {
        System.out.printf(
            "Nome -> %s\nMarca -> %s\nCategoria -> %s\nPeso -> %f\nPreço -> R$%.2f\n",
            product.name,
            product.brand,
            product.category,
            product.weight,
            product.price
        );
    }
}
