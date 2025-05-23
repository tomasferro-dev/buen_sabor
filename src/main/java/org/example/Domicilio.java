package org.example;
import java.time.LocalDate;

public class Domicilio {
    private String nombre;
    private int numero;
    private int cp;
    private Localidad localidad;

//    public Domicilio() {
//    }

    public Domicilio(String nombre, int numero, int cp, Localidad localidad) {
        this.nombre = nombre;
        this.numero = numero;
        this.cp = cp;
        this.localidad = localidad;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "Domicilio: " +
                "nombre= " + nombre + '\'' +
                ", numero=" + numero +
                ", cp=" + cp;
    }
}