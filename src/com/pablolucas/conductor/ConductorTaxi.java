package com.pablolucas.conductor;

import com.pablolucas.vehiculo.Taxi;

/**
 * Created by paul on 13/05/16.
 */
public class ConductorTaxi extends Conductor{

    private Taxi taxi;



    /**
     * @param nombre
     * @param licencia
     * @param taxi
     */
    public ConductorTaxi(String nombre, String licencia, Taxi taxi) {
        super(nombre, licencia);
        this.taxi = taxi;
    }

    public Taxi getTaxi() {
        return taxi;
    }

    public void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }

    @Override
    public void mostrarVehiculo() {
        super.mostrarVehiculo();
        System.out.println(getTaxi().getMatricula());
    }
}
