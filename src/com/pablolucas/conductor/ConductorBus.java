package com.pablolucas.conductor;

import com.pablolucas.vehiculo.Bus;

/**
 * Created by paul on 13/05/16.
 */
public class ConductorBus extends Conductor {

    private Bus bus;

    /**
     * @param nombre
     * @param licencia
     * @param bus
     */
    public ConductorBus(String nombre, String licencia, Bus bus) {
        super(nombre, licencia);
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    @Override
    public void mostrarVehiculo() {
        super.mostrarVehiculo();
        System.out.println(getBus().getMarca());
    }
}
