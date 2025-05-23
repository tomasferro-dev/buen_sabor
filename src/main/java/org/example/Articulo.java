package org.example;
import java.util.HashSet;

public abstract class Articulo {
    protected String denominacion;
    protected double precioVenta;
    private UnidadMedida unidadMedida;
    private HashSet<Imagen> imagenes;



    public Articulo(String denominacion, double precioVenta) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;

    }

    public Articulo() {

    }

    public void addImagen(Imagen imagen) {
        if (imagenes == null) {
            imagenes = new HashSet<>();
        }
        imagenes.add(imagen);
    }

    public void removeImagen (Imagen imagen) {
        imagenes.remove(imagen);
    }



    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public HashSet<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(HashSet<Imagen> imagenes) {
        this.imagenes = imagenes;
    }


}