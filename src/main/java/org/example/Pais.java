package org.example;
public class Pais {
    private String nombre;

    public Pais(String pais) {
        this.nombre = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String pais) {
        this.nombre = pais;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}