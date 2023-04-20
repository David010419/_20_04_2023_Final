package com.hedima.presentación;

import com.hedima.modelo.Producto;
import com.hedima.modelo.Producto1Necesidad;
import com.hedima.modelo.PLujo;

public class ProbarProducto {

    public static void main(String[] args) {
//        Producto p1 = new Producto("Cocacola", 0.60); No se puede instanciar por que es una clase abstracta
          Producto1Necesidad p2 = new Producto1Necesidad();
          p2.setNombre("Leche");
          p2.setPvp(1.2);
          p2.setTipo("Lacteo");

          Producto1Necesidad p3 = new Producto1Necesidad("Queso", 5, "Lacteo");
          Producto p4 = new Producto1Necesidad("Mantequilla", 3,"Lacteo");

          PLujo p5 = new PLujo();
          p5.setNombre("Ordenador");
          p5.setMaterial("Electronico");
          p5.setPvp(1000);

          PLujo p6 = new PLujo("Raton",20,"Electronico");

          Producto p7 = new PLujo("Teclado",20,"Electronico");

          Producto[] productos = new Producto[6];
          productos[0] = p2;
          productos[1] = p3;
          productos[2] = p4;
          productos[3] = p5;
          productos[4] = p6;
          productos[5] = p7;

        for (Producto elemento:productos) {
            System.out.println(elemento.calcularIVA());

        }
    }
}