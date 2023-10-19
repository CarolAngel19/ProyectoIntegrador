package org.example;
import java.util.Scanner;

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