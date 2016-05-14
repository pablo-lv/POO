package com.pablolucas.vehiculo;

import java.util.ArrayList;

/**
 * Created by paul on 13/05/16.
 */
public class Bus extends Vehiculo {

    private ArrayList<String> estaciones;

    /**
     * @param matricula
     * @param marca
     * @param modelo
     * @param anio
     */
    public Bus(String matricula, String marca, String modelo, int anio) {
        super(matricula, marca, modelo, anio);
    }
}
