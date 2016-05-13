package com.pablolucas.poo;

/**
 * Created by paul on 13/05/16.
 */
public class Principal {

    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo();

        miVehiculo.arrancar();
        miVehiculo.frenar();
        miVehiculo.reversa();

        miVehiculo.setMatricula("A90AA");
        System.out.println(miVehiculo.getMatricula());
    }
}
