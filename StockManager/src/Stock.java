import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Stock {
    private Map<String, List<Product>> products = new HashMap<>();

    Stock(String[] categories) {
        for (String category: categories) {
            addProductCategory(category);
        }
    }

    private void addProductCategory(String category) {
        if (!products.containsKey(category)) {
            products.put(
                category,
                new ArrayList<Product>()
            );
        }
    }

    public void productRegistry(Product newProduct) {

        products
            .get(newProduct.category)
            .add(newProduct);
    }

    public List<Product> getProductsByCategory(String category) {
        return products.get(category);
    }

    public Product getProductByName(
        String category,
        String name
    ) {
        for (Product product: products.get(category)){
            if (product
                    .category
                    .contentEquals(name)) {

                return product;
            }
        }

        return null;
    }
}
