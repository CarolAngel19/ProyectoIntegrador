package org.example;
public class Main {
    public static void main(String[] args) {
        /*

        // Crear instancias de las clases
        Product product1 = new Product(1, "Leche", 3.000, 10, "Lacteos", "Bolsa x 1.100 ml", "Leches", "photo1.jpg");
        Product product2 = new Product(2, "Papas", 2.500, 5, "Pasabocas", "Bolsa 100 gr", "Papas", "photo2.jpg");

        Stock stock1 = new Stock(1, 20);
        Stock stock2 = new Stock(2, 15);

        Sale sale1 = new Sale(1, "2023-10-20", List.of(product1, product2));
        Sale sale2 = new Sale(2, "2023-10-21", List.of(product2));

        Bill bill1 = new Bill(1, sale1, 3.000);
        Bill bill2 = new Bill(2, sale2, 2.500);

        // Imprimir las instancias por consola
        System.out.println("Producto 1: " + product1.toString());
        System.out.println("Producto 2: " + product2.toString());
        System.out.println("Stock 1: " + stock1.toString());
        System.out.println("Stock 2: " + stock2.toString());
        System.out.println("Venta 1: " + sale1.toString());
        System.out.println("Venta 2: " + sale2.toString());
        System.out.println("Factura 1: " + bill1.toString());
        System.out.println("Factura 2: " + bill2.toString());

        ProductsArray productList = new ProductsArray();
        productList.showProductsStartingWith();
        productList.showAlphabeticalOrder();

       */
        InventoryManager inventoryManager = new InventoryManager();
        inventoryManager.runMenu();
    }
}

