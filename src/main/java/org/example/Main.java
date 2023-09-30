package org.example;
import java.util.Scanner;

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

        InventoryManager inventoryManager = new InventoryManager();
        inventoryManager.runMenu();
    }
}

class InventoryManager {
    private Scanner scanner = new Scanner(System.in);
    private void handleUserChoice(int choice) {
        switch (choice) {
            case 1 -> addProduct();
            case 2 -> removeProduct();
            case 3 -> updateProduct();
            case 4 -> viewAllProducts();
            case 5 -> searchProduct();
            case 6 -> viewQuantityProduct();
            case 7 -> viewCategoryProduct();
            case 8 -> System.out.println("Saliendo...");
            default -> System.out.println("Opción invalida. Por favor intenta de nuevo.");
        }
    }

    private void displayMenu() {
        System.out.println("±----------------------------------------±");
        System.out.println("|   Administrador Mi Tienda de Barrio    |");
        System.out.println("±----------------------------------------±");
        System.out.println("1. Agregar producto                      |");
        System.out.println("2. Eliminar producto                     |");
        System.out.println("3. Actualizar producto                   |");
        System.out.println("4. Ver todos los productos               |");
        System.out.println("5. Buscar productos                      |");
        System.out.println("6. Ver cantidad del los productos        |");
        System.out.println("7. Ver categorías de los productos       |");
        System.out.println("8. Salir                                 |");
        System.out.println("±----------------------------------------±");
        System.out.print("\nIngresa tu opción (1 - 8) : ");
    }

    public void runMenu() {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            handleUserChoice(choice);
        } while (choice != 8);
    }
    private void addProduct() {
        System.out.println("Agregando un producto...");
    }
    private void removeProduct() {
        System.out.println("Eliminando un producto...");
    }
    private void updateProduct() {
        System.out.println("Actualizando un producto...");
    }
    private void viewAllProducts() {
        System.out.println("Viendo todos los productos...");
    }
    private void searchProduct() {
        System.out.println("Buscando el producto...");
    }
    private void viewQuantityProduct() {
        System.out.println("Viendo la cantidad de los productos...");
    }
    private void viewCategoryProduct() {
        System.out.println("Viendo las categorias de los productos...");
    }
}