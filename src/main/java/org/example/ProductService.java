package org.example;
import org.example.model.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductService implements ProductServiceI {
    private List<Product> inventory = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        inventory.add(product);
    }

    @Override
    public void deleteProduct(int productId) {
        inventory.removeIf(product -> product.getId() == productId);
    }

    @Override
    public void updateProduct(Product product) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).getId() == product.getId()) {
                inventory.set(i, product);
                break;
            }
        }
    }

    @Override
    public Product findById(int productId) {
        for (Product product : inventory) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> viewAllProducts() {
        return new ArrayList<>(inventory);
    }
}
