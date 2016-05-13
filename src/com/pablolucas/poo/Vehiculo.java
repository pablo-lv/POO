package com.pablolucas.poo;

/**
 * Created by paul on 13/05/16.
 */
public class Vehiculo {

    //Attributes
    private String matricula;
    private String marca;
    private String modelo;
    private int anio;

    public Vehiculo(String matricula, String marca) {
        super();
        setMatricula(matricula);
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if ( matricula.length() == 6 ) {
            this.matricula = matricula;
        } else {
            System.out.println("La Matricula debe ser de 6 caracateres");
        }


    }

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
