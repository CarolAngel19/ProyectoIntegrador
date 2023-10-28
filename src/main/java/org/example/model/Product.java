package org.example.model;

public class Product {
    private int id;
    private String name;
    private double price;
    private int stock;
    private String category;
    private String description;
    private String label;
    private String photo;

    public Product(int id, String name, double price, int stock, String category, String description, String label ,String photo) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
        this.description = description;
        this.label = label;
        this.photo = photo;
    }
    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Price: " + price +
                ", Stock: " + stock +
                ", Category: " + category +
                ", Description: " + description +
                ", Label: " + label +
                ", Photo: " + photo;
    }
    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /*
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
        System.out.println("Nombre contiene 'Pap': " + product.doesNameContain("Pap"));
    }

     */
}
