package model;

public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        return "{ 'name':" + name + ", price:" + price + ", stock:" + stock + "}";
    }

    public boolean isOutOfStock() {
        return stock <= 0;
    }
    public boolean isPriceGreaterThan(double value) {
        return price > value;
    }
    public boolean isPriceLessThanOrEqualTo(double value) {
        return price <= value;
    }
    public boolean doesNameContain(String keyword) {
        return name.toLowerCase().contains(keyword.toLowerCase());
    }

    public static void main(String[] args) {
        Product product = new Product("Papas Super Ricas Todo Rico BBQ", 5.900, 5);

        System.out.println("Nombre del producto: " + product.getName());
        System.out.println("Precio del producto: " + product.getPrice());
        System.out.println("Stock del producto: " + product.getStock());
        System.out.println("Inventario agotado: " + product.isOutOfStock());
        System.out.println("Precio mayor que $6.100: " + product.isPriceGreaterThan(6.100));
        System.out.println("Precio menor o igual a $7.500: " + product.isPriceLessThanOrEqualTo(7.500));
        System.out.println("Nombre contiene 'lap': " + product.doesNameContain("lap"));
    }
}
