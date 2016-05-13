package com.pablolucas.poo;

/**
 * Created by paul on 13/05/16.
 */
public class Principal {

    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo("A90A90", "Hyundai");

        miVehiculo.arrancar();
        miVehiculo.frenar();
        miVehiculo.reversa();

        System.out.println(miVehiculo.getMatricula());
    }
}
