package org.example.model;
import java.util.List;

public class Sale {
    private int id;
    private String fecha;
    private List<Product> productos;

    public Sale(int id, String fecha, List<Product> productos) {
        this.id = id;
        this.fecha = fecha;
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Fecha: " + fecha +
                ", Productos: " + productos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<Product> getProductos() {
        return productos;
    }

    public void setProductos(List<Product> productos) {
        this.productos = productos;
    }
}

