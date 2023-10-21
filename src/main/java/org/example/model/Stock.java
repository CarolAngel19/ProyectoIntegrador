package org.example.model;

public class Stock {
    private int id;
    private int cantidad;

    public Stock(int id, int cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Cantidad: " + cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
