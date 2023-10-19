package org.example;

public class Main {
    public static void main(String[] args) {
        /*
        String productName = "Papas Super Ricas Todo Rico BBQ";
        float productPrice = 5.900f;
        int quantityStock = 10;
        boolean isAvailable = true;
        String category = "Pasabocas";
        String tags = "Papas Fritas y Paquetes";
        String description = "Bolsa x 250 gr";

        System.out.println("Mi Tienda de Barrio App");

        System.out.println("Nombre del producto: " + productName);
        System.out.println("Precio del producto: " + productPrice);
        System.out.println("Cantidad del producto: " + quantityStock);
        System.out.println("Disponible: " + isAvailable);
        System.out.println("Categoria del producto: " + category);
        System.out.println("Etiquetas del producto: " + tags);
        System.out.println("Descripcion del producto: " + description);
         */

        ProductsArray productList = new ProductsArray();
        productList.showProductsStartingWith();
        productList.showAlphabeticalOrder();

        InventoryManager inventoryManager = new InventoryManager();
        inventoryManager.runMenu();
    }
}

