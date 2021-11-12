package com.wjnnovoa.almacen;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Almacen almacen = new Almacen();
        List<Bebida> bebidasNuevas = new ArrayList<>();
        bebidasNuevas.add(new AguaMineral(5.3, 3000,"Evian", Origen.MANANTIAL));
        bebidasNuevas.add(new AguaMineral(4, 8000,"Postobon", Origen.OASIS));
        bebidasNuevas.add(new AguaMineral(1.2, 1200,"Aquafina", Origen.RESERVA));
        bebidasNuevas.add(new AguaMineral(1, 1000,"Dasani", Origen.RESERVA));
        bebidasNuevas.add(new AguaMineral(1.5, 1100,"Cristal", Origen.OASIS));
        bebidasNuevas.add(new AguaMineral(1.8, 1000,"Gota", Origen.OASIS));
        bebidasNuevas.add(new AguaMineral(2.1, 1300,"Epura", Origen.MANANTIAL));
        bebidasNuevas.add(new BebidaAzucarada(2, 4000,"Coca cola", 60, Promocion.SI));
        bebidasNuevas.add(new BebidaAzucarada(2.5, 3000,"Hipinto", 30, Promocion.NO));
        bebidasNuevas.add(new BebidaAzucarada(3, 6000,"Postobon", 30, Promocion.SI));
        bebidasNuevas.add(new BebidaAzucarada(3.5, 7000,"Coca cola", 80, Promocion.NO));
        bebidasNuevas.add(new BebidaAzucarada(1.7, 2500,"Glacial", 20, Promocion.NO));
        bebidasNuevas.add(new BebidaAzucarada(1, 4000,"Zabiloe", 10, Promocion.SI));
        bebidasNuevas.add(new BebidaAzucarada(2.3, 3000,"Ponimalta", 70, Promocion.SI));

        bebidasNuevas.add(new AguaMineral(1.5, 1100,"Cristal", Origen.OASIS));
        bebidasNuevas.add(new AguaMineral(1.8, 1000,"Gota", Origen.OASIS));
        bebidasNuevas.add(new AguaMineral(2.1, 1300,"Epura", Origen.MANANTIAL));
        bebidasNuevas.add(new BebidaAzucarada(2, 4000,"Coca cola", 60, Promocion.SI));
        bebidasNuevas.add(new BebidaAzucarada(2.5, 3000,"Hipinto", 30, Promocion.NO));
        bebidasNuevas.add(new BebidaAzucarada(3, 6000,"Postobon", 30, Promocion.SI));
        bebidasNuevas.add(new BebidaAzucarada(3.5, 7000,"Coca cola", 80, Promocion.NO));
        bebidasNuevas.add(new BebidaAzucarada(1.7, 2500,"Glacial", 20, Promocion.NO));
        bebidasNuevas.add(new BebidaAzucarada(1, 4000,"Zabiloe", 10, Promocion.SI));
        bebidasNuevas.add(new BebidaAzucarada(2.3, 3000,"Ponimalta", 70, Promocion.SI));
        bebidasNuevas.add(new BebidaAzucarada(1.7, 2500,"Glacial", 20, Promocion.NO));
        bebidasNuevas.add(new BebidaAzucarada(1, 4000,"Zabiloe", 10, Promocion.SI));
        bebidasNuevas.add(new BebidaAzucarada(2.3, 3000,"Ponimalta", 70, Promocion.SI));

        for (Bebida b : bebidasNuevas){
            almacen.agregarBebida(b);
        }
        almacen.mostrarBebidas();


        System.out.println("Precio total de bebidas por estanteria: "+almacen.calcularPrecioTotalBebidasPorEstanteria(4));

        System.out.println("Precio total de todas las bebidas: "+ almacen.calcularPrecioTotalBebidas());

        System.out.println("Precio total de bebidas de una marca "+ almacen.calcularPrecioTotalMarcaBebidas("Glacial"));

        almacen.eliminarBebida(10);
        almacen.mostrarBebidas();
    }
}
