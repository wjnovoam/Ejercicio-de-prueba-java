package com.wjnnovoa.almacen;

public class BebidaAzucarada extends Bebida{

    private double porcentajeAzucar;
    private Promocion promocion;

    public BebidaAzucarada(double litros, double precio, String marca, double porcentajeAzucar, Promocion promocion) {
        super(litros, precio, marca);
        this.porcentajeAzucar = porcentajeAzucar;
        this.promocion = promocion;
    }

    public double getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    public void setPorcentajeAzucar(double porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

    @Override
    public double getPrecio(){
        if(getPromocion() == Promocion.SI){
            double valorDescuento = super.getPrecio() * 0.1;
            return super.getPrecio() - valorDescuento;
        }else{
            return super.getPrecio();
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                " porcentajeAzucar=" + porcentajeAzucar + " %"+
                ", promocion=" + promocion + ((promocion == Promocion.SI)?", precio con promocion: "+ this.getPrecio() : "")  + " -> Bebida azucarada";
    }

}
