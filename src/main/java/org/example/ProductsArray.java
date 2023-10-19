package org.example;
import java.util.Arrays;
public class ProductsArray {
    private String[] products;
    public ProductsArray() {
        products = new String[20];

        products[0] = "Leche Entera Alpina";
        products[1] = "Pasta Spaguetti  Doria ";
        products[2] = "Yogurt Alpina Fresa";
        products[3] = "Coffe Delight";
        products[4] = "Papas Super Ricas Todo Rico BBQ";
        products[5] = "Arequipe Alqueria";
        products[6] = "Doritos Margarita ";
        products[7] = "Trocipollo Chefrito ";
        products[8] = "Mortadela Zenu";
        products[9] = "Jamon Zenu";
        products[10] = "Huevos Tipo A";
        products[11] = "External Hard Drive";
        products[12] = "Queso Alpina Campesino ";
        products[13] = "Mantequilla La Fina";
        products[14] = "Crema de Leche Alqueria";
        products[15] = "Alpinito Alpina Mora ";
        products[16] = "Chocolatina Jet ";
        products[17] = "Agua Cristal ";
        products[18] = "Jugo del Valle Mora";
        products[19] = "Helado Popsy Vainilla ";
    }

    public void showProductsStartingWith() {
        System.out.println("Productos que comienzan con 'C': ");
        for (String product : products) {
            if (product.startsWith("C")) {
                System.out.println(product);
            }
        }
    }

    public void showAlphabeticalOrder() {
        Arrays.sort(products);
        System.out.println("\nProductos en orden alfabético:");
        for (String product : products) {
            System.out.println(product);
        }
    }
    public static void main(String[] args) {
        /*ProductsArray productList = new ProductsArray();
        productList.showProductsStartingWith();
        productList.showAlphabeticalOrder();
         */
    }
}