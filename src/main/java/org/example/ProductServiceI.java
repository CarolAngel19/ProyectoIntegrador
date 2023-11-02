package org.example;
import org.example.model.Product;
import java.util.List;

public interface ProductServiceI {
    void addProduct(Product product);
    void deleteProduct(int productId);
    void updateProduct(Product product);
    Product findById(int productId);
    List<Product> viewAllProducts();
}
