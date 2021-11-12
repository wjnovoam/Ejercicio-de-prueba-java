package com.wjnnovoa.almacen;

public class AguaMineral extends Bebida {

    private Origen origen;

    public AguaMineral(double litros, double precio, String marca, Origen origen) {
        super(litros, precio, marca);
        this.origen = origen;
    }

    public Origen getOrigen() {
        return origen;
    }

    public void setOrigen(Origen origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return super.toString() +
                " origen='" + origen + '\''+" -> Agua Mineral";
    }
}
