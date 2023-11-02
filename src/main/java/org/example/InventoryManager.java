package org.example;
import java.util.Date;
import java.util.Scanner;
import org.example.model.*;
import java.util.ArrayList;
import java.util.List;

class InventoryManager {
    private List<Product> inventory = new ArrayList<>();
    private List<Sale> sales = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private void handleUserChoice(int choice) {
        switch (choice) {
            case 1 -> addProduct();
            case 2 -> deleteProduct();
            case 3 -> updateProduct();
            case 4 -> viewAllProducts();
            case 5 -> findById();
            case 6 -> viewStockProduct();
            case 7 -> addSale();
            case 8 -> System.out.println("Saliendo...");
            default -> System.out.println("Opción invalida. Por favor intenta de nuevo.");
        }
    }
    private void displayMenu() {
        System.out.println("±-----------------------------------±");
        System.out.println("| Administrador Mi Tienda de Barrio |");
        System.out.println("±-----------------------------------±");
        System.out.println("|           Inventario              |");
        System.out.println("±-----------------------------------±");
        System.out.println("1. Agregar producto                 |");
        System.out.println("2. Eliminar producto                |");
        System.out.println("3. Actualizar producto              |");
        System.out.println("4. Ver todos los productos          |");
        System.out.println("5. Buscar productos                 |");
        System.out.println("6. Ver stock de producto            |");
        System.out.println("±-----------------------------------±");
        System.out.println("|            Ventas                 |");
        System.out.println("±-----------------------------------±");
        System.out.println("7. Agregar Venta                    |");
        System.out.println("±-----------------------------------±");
        System.out.println("8. Salir                            |");
        System.out.println("±------------------------------------");
        System.out.print("\nIngresa tu opción (1 - 8) : ");
    }
    public void runMenu() {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            handleUserChoice(choice);
        } while (choice != 8);
    }

    //Funciones
    private void addProduct() {
        System.out.println("Ingrese el nombre del producto: ");
        String name = scanner.nextLine();

        System.out.println("Ingrese el precio del producto: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese el Stock del producto: ");
        int stock = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese la categoria del producto: ");
        String category = scanner.nextLine();

        System.out.println("Ingrese la Descripcion del producto: ");
        String description = scanner.nextLine();

        System.out.println("Ingrese la etiqueta del producto: ");
        String label = scanner.nextLine();

        System.out.println("Ingrese la photo del producto: ");
        String photo = scanner.nextLine();

        //ID autoincremental
        int productId = inventory.size() + 1;

        Product product = new Product(productId, name, price, stock, category, description, label, photo);
        inventory.add(product);
        System.out.println("\n Producto agregado con éxito.");
        System.out.println("------------------------------------------------------");
    }
    private void deleteProduct() {
        System.out.print("Ingrese el ID del producto que desea eliminar: ");
        int productId = scanner.nextInt();
        scanner.nextLine();

        // Busca el producto en el inventario y elimínalo
        for (Product product : inventory) {
            if (product.getId() == productId) {
                inventory.remove(product);
                System.out.println("\nProducto eliminado con éxito. \n");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }
    private void updateProduct() {
        System.out.print("Ingrese el ID del producto que desea actualizar: \n");
        int productId = scanner.nextInt();
        scanner.nextLine();

        // Busca el producto en el inventario
        for (Product product : inventory) {
            if (product.getId() == productId) {

                System.out.println("Ingrese el nombre del producto: ");
                String name = scanner.nextLine();

                System.out.println("Ingrese el precio del producto: ");
                double price = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Ingrese el Stock del producto: ");
                int stock = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingrese la categoria del producto: ");
                String category = scanner.nextLine();

                System.out.println("Ingrese la Descripcion del producto: ");
                String description = scanner.nextLine();

                System.out.println("Ingrese la etiqueta del producto: ");
                String label = scanner.nextLine();

                System.out.println("Ingrese la photo del producto: ");
                String photo = scanner.nextLine();

                // Actualiza los atributos del producto
                product.setName(name);
                product.setPrice(price);
                product.setStock(stock);
                product.setCategory(category);
                product.setDescription(category);
                product.setLabel(label);
                product.setPhoto(photo);
                System.out.println("\n Producto actualizado con éxito.");
                System.out.println("------------------------------------------------------");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }
    private void viewAllProducts() {
        System.out.println("Productos en el inventario: \n");
        for (Product product : inventory) {
            System.out.println("ID: " + product.getId());
            System.out.println("Nombre: " + product.getName());
            System.out.println("Precio: " + product.getPrice());
            System.out.println("Categoría: " + product.getCategory());
            System.out.println("--------------------------------- \n");
        }
    }
    private void findById() {
        System.out.print("Ingrese el nombre o ID del producto a buscar: \n");
        String searchTerm = scanner.nextLine();

        System.out.println("Resultados de la búsqueda: ");
        for (Product product : inventory) {
            if (product.getName().equalsIgnoreCase(searchTerm) || String.valueOf(product.getId()).equals(searchTerm)) {
                System.out.println("ID: " + product.getId());
                System.out.println("Nombre: " + product.getName());
                System.out.println("Precio: " + product.getPrice());
                System.out.println("Stock: " + product.getStock());
                System.out.println("Categoría: " + product.getCategory());
                System.out.println("Description: " + product.getDescription());
                System.out.println("Etiqueta: " + product.getLabel());
                System.out.println("Foto: " + product.getPhoto());
                System.out.println("---------------------------------");
            }
        }
    }
    private void viewStockProduct() {
        System.out.print("Ingrese el ID del producto para ver su stock: ");
        int productId = scanner.nextInt();
        scanner.nextLine();

        for (Product product : inventory) {
            if (product.getId() == productId) {
                System.out.println("Stock del producto " + product.getName() + ": " + product.getStock());
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }
    private void addSale() {
        Date currentDate = new Date();

        System.out.println("Productos disponibles para la venta:");
        viewAllProducts();

        // List product vendidos en la venta
        List<Product> productosVendidos = new ArrayList<>();

        // Permitir al usuario seleccionar productos para la venta
        boolean continuarAgregando = true;
        while (continuarAgregando) {
            System.out.print("Ingrese el ID del producto que desea vender (0 para salir): ");
            int productId = scanner.nextInt();
            scanner.nextLine();

            if (productId == 0) {
                continuarAgregando = false;
            } else {
                // Buscar el producto en el inventario
                Product selectedProduct = findProductById(productId);
                if (selectedProduct != null && selectedProduct.getStock() > 0) {
                    productosVendidos.add(selectedProduct);
                    selectedProduct.setStock(selectedProduct.getStock() - 1); // Reducir el stock del producto
                    System.out.println("Producto agregado a la venta.");
                } else {
                    System.out.println("Producto no encontrado o fuera de stock.");
                }
            }
        }

        // Crear la venta y agregarla a la lista de ventas
        int saleId = sales.size() + 1;
        Sale sale = new Sale(saleId, currentDate, productosVendidos);
        sales.add(sale);
        System.out.println("Venta registrada con éxito.");
    }

    // Busca un producto por su ID en la lista de inventario.
    private Product findProductById(int productId) {
        for (Product product : inventory) {
            if (product.getId() == productId) {
                return product;
            }
        }
        return null;
    }

}

