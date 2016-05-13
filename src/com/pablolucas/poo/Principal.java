package com.pablolucas.poo;

/**
 * Created by paul on 13/05/16.
 */
public class Principal {

    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo();
        miVehiculo.marca = "hyundai";
        miVehiculo.modelo = "i10";
        miVehiculo.anio = 2015;

        miVehiculo.arrancar();
        miVehiculo.frenar();
        miVehiculo.reversa();
    }
}
