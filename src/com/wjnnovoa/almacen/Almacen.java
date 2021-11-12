package com.wjnnovoa.almacen;

import java.io.*;

public class Almacen {

    private Bebida[][] estanteria;

    public Almacen() {
        estanteria = new Bebida[5][5];
    }

    public void agregarBebida(Bebida bebida){
        boolean campoEstanteria = false;

        for (int i = 0; i < estanteria.length && !campoEstanteria; i++) {
            for (int j = 0; j < estanteria[0].length && !campoEstanteria; j++) {
                if(estanteria[i][j] == null){
                    estanteria[i][j] = bebida;
                    campoEstanteria = true;
                }
            }
        }

        if(campoEstanteria){
            System.out.println("Bebida agregada con exito");
        }else{
            System.out.println("No se ha podido añadir la bebida");
        }
    }

    public void eliminarBebida(int id){
        boolean busquedaEstanteria = false;

        for (int i = 0; i < estanteria.length && !busquedaEstanteria; i++) {
            for (int j = 0; j < estanteria[0].length && !busquedaEstanteria; j++) {
                if((estanteria[i][j] != null) && (estanteria[i][j].getId() == id)){
                    estanteria[i][j] = null;
                    busquedaEstanteria = true;
                }
            }
        }

        if(busquedaEstanteria){
            System.out.println("Bebida eliminada con exito");
        }else{
            System.out.println("No existe la bebida");
        }
    }

    public void mostrarBebidas(){
        StringBuilder informacion = new StringBuilder();

        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if(estanteria[i][j] != null){
                    informacion.append("Bebida: ").append(estanteria[i][j].toString()).append("\n");
                }
            }
        }
        System.out.println(informacion);
        guardarInformacionArchivoTxt(informacion);
    }


    public double calcularPrecioTotalBebidas(){

        double precioTotal = 0;
        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if(estanteria[i][j] != null){
                    precioTotal += estanteria[i][j].getPrecio();
                }
            }
        }

        return precioTotal;
    }

    public double calcularPrecioTotalMarcaBebidas(String marca){

        double precioTotal = 0;
        for(int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[0].length; j++) {
                if((estanteria[i][j] != null) && (estanteria[i][j].getMarca().equalsIgnoreCase(marca))){ //Ignora si es mayuscula o minuscula
                    precioTotal += estanteria[i][j].getPrecio();
                }
            }
        }
        return precioTotal;
    }


    public double calcularPrecioTotalBebidasPorEstanteria(int columnaEstanteria){

        double precioTotal = 0;
        if(!(columnaEstanteria >=0 && columnaEstanteria < estanteria[0].length)){
            System.out.println("La estanteria no existe, debe estar entre 0 y "+(estanteria[0].length-1));
            return 0;
        }

        for (int i = 0; i < estanteria.length; i++) {
            if((estanteria[i][columnaEstanteria] != null)){
                System.out.println("Estanteria: "+columnaEstanteria+ " Fila: "+i+" Bebida: "+ estanteria[i][columnaEstanteria].toString());
                precioTotal += estanteria[i][columnaEstanteria].getPrecio();
            }
        }
        return precioTotal;
    }

    public void guardarInformacionArchivoTxt(StringBuilder info){
        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;

        try{
            f = new File("informacion.txt");
            w = new FileWriter(f);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);

            wr.write(String.valueOf(info));

            wr.close();
            bw.close();

        }catch (Exception e){
            System.err.println("Ha sucedido un error "+e);
        }
    }

}
