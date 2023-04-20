package com.hedima.modelo;

public class Factura {

    //ATRIBUTOS
    private int id;

    private final double IVA_ALIMENTOS=0.4;

    private double importe;

    //METODOS

    public final double calcularIva(int porcentaje){

        return importe * porcentaje;
    }
    //CONSTRUCTORES
    public Factura() {
    }

    public Factura(int id, double importe) {
        this.id = id;
        this.importe = importe;
    }
    //SETTERS Y GETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
}
