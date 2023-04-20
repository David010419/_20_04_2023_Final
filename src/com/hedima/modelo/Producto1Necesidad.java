package com.hedima.modelo;

public class Producto1Necesidad extends Producto {

    private String tipo;

    @Override
    public double calcularIVA() {
        return pvp*0.04;
    }

    public Producto1Necesidad() {
    }

    public Producto1Necesidad(String nombre, double pvp, String tipo) {
        super(nombre, pvp);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
