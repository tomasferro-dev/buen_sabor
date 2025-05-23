package org.example;
import java.awt.geom.Area;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Promocion {

    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private double precioDescuento;
    private double precioPromonocional;
    private TipoPromocion tipoPromocion;
    private Set<Imagen> imagenes;
    private Set<Articulo> articulos;

    public Promocion(String denominacion, LocalDate fechaDesde, LocalDate fechaHasta, LocalTime horaDesde, LocalTime horaHasta, double precioDescuento, double precioPromonocional, TipoPromocion tipoPromocion) {
        this.denominacion = denominacion;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.horaDesde = horaDesde;
        this.horaHasta = horaHasta;
        this.precioDescuento = precioDescuento;
        this.precioPromonocional = precioPromonocional;
        this.tipoPromocion = tipoPromocion;
    }

    public void addImagenes(Imagen imagen) {
        if (imagenes == null) {
            imagenes = new HashSet<>();
        }
        imagenes.add(imagen);
    }

    public void removeImagen(Imagen imagen) {
        imagenes.remove(imagen);
    }

    public void addArticulos(Articulo articulo) {
        if (articulos == null) {
            articulos = new HashSet<>();
        }
        articulos.add(articulo);
    }

    public void removeArticulo(Articulo articulo) {
        articulos.remove(articulo);
    }



    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public LocalDate getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(LocalDate fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public LocalTime getHoraDesde() {
        return horaDesde;
    }

    public void setHoraDesde(LocalTime horaDesde) {
        this.horaDesde = horaDesde;
    }

    public LocalTime getHoraHasta() {
        return horaHasta;
    }

    public void setHoraHasta(LocalTime horaHasta) {
        this.horaHasta = horaHasta;
    }

    public double getPrecioDescuento() {
        return precioDescuento;
    }

    public void setPrecioDescuento(double precioDescuento) {
        this.precioDescuento = precioDescuento;
    }

    public double getPrecioPromonocional() {
        return precioPromonocional;
    }

    public void setPrecioPromonocional(double precioPromonocional) {
        this.precioPromonocional = precioPromonocional;
    }

    public TipoPromocion getTipoPromocion() {
        return tipoPromocion;
    }

    public void setTipoPromocion(TipoPromocion tipoPromocion) {
        this.tipoPromocion = tipoPromocion;
    }

    @Override
    public String toString() {
        return "Promocion{" +
                "denominacion='" + denominacion + '\'' +
                ", fechaDesde=" + fechaDesde +
                ", fechaHasta=" + fechaHasta +
                ", horaDesde=" + horaDesde +
                ", horaHasta=" + horaHasta +
                ", precioDescuento=" + precioDescuento +
                ", precioPromonocional=" + precioPromonocional +
                ", tipoPromocion=" + tipoPromocion +
                ", imagenes=" + imagenes +
                ", articulos=" + articulos +
                '}';
    }
}