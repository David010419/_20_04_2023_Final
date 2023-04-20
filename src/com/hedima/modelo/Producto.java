package com.hedima.modelo;

public abstract class Producto {

    //Atributos
    protected String nombre;

    protected double pvp;

    //Metodos

    public abstract double calcularIVA();

    public Producto() {
    }

    public Producto(String nombre, double pvp) {
        this.nombre = nombre;
        this.pvp = pvp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }
}
