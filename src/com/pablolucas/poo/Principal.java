package com.pablolucas.poo;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by paul on 13/05/16.
 */
public class Principal {

    public static void main(String[] args) {
        Vehiculo miVehiculo = new Vehiculo("A90A90", "Hyundai");

        miVehiculo.arrancar();
        miVehiculo.frenar();
        miVehiculo.reversa();

        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        vehiculos.add(new Vehiculo("BB09BB","Ford "));
        vehiculos.add(new Vehiculo("CC23CC", "Mercedez Benz", "S10", 2014));

        for (Vehiculo vehiculo : vehiculos ) {
            System.out.println(vehiculo.getMatricula());
            System.out.println(vehiculo.getMarca());
            System.out.println(vehiculo.getModelo());
            System.out.println(vehiculo.getAnio());
        }
    }
}
