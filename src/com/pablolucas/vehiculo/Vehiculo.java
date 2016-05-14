package com.pablolucas.vehiculo;

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

    public Vehiculo(String matricula, String marca, String modelo, int anio) {
        super();
        setMatricula(matricula);
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    /*Getters and Setters*/

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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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
