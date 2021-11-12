package com.wjnnovoa.almacen;

public class Bebida {
    private static int idNuevo = 1;

    private int id;
    private double litros;
    private double precio;
    private String marca;

    public Bebida(double litros, double precio, String marca) {
        this.id = idNuevo++;
        this.litros = litros;
        this.precio = precio;
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", litros=" + litros +
                ", precio=" + precio +
                ", marca='" + marca + '\'';
    }
}
