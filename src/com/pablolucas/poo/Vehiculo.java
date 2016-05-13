package com.pablolucas.poo;

/**
 * Created by paul on 13/05/16.
 */
public class Vehiculo {

    //Attributes
    String matricula;
    String marca;
    String modelo;
    int anio;

    //Methods
    public void arrancar(){
        System.out.println("El vehiculo arrancó");
    }

    public void frenar(){
        System.out.println("EL vehiculo frenó");
    }

    public void reversa(){
        System.out.println("El vehiculo esta en reversa ");
    }

}
