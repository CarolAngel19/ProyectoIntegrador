package org.example.model;

public class Bill {
    private int id;
    private Sale venta;
    private double total;

    public Bill(int id, Sale venta, double total) {
        this.id = id;
        this.venta = venta;
        this.total = total;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Venta: " + venta +
                ", Total: " + total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sale getVenta() {
        return venta;
    }

    public void setVenta(Sale venta) {
        this.venta = venta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
