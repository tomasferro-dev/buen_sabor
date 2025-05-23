package org.example;
import java.util.HashSet;
import java.util.Set;

public class ArticuloManufacturado extends Articulo {

        private String descripcion;
        private int tiempoEstimadoMinutos;
        private String preparacion;
        private Set<ArticuloManufacturadoDetalle> detallesDeArticulo;

        public ArticuloManufacturado(String descripcion, int tiempoEstimadoMinutos, String preparacion, String denominacion) {
            this.descripcion = descripcion;
            this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
            this.preparacion = preparacion;
            this.denominacion = denominacion;
        }
    public void addDetalle (ArticuloManufacturadoDetalle articuloManufacturadoDetalle) {
        if (articuloManufacturadoDetalle != null) {
            detallesDeArticulo = new HashSet<>();
        }
        detallesDeArticulo.add(articuloManufacturadoDetalle);
    }

    public void removeDetalle (ArticuloManufacturadoDetalle articuloManufacturadoDetalle) {
        detallesDeArticulo.remove(articuloManufacturadoDetalle);
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempoEstimadoMinutos() {
        return tiempoEstimadoMinutos;
    }

    public void setTiempoEstimadoMinutos(int tiempoEstimadoMinutos) {
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }


    @Override
    public String toString() {
        return "ArticuloManufacturado{" +
                "descripcion='" + descripcion + '\'' +
                ", tiempoEstimadoMinutos=" + tiempoEstimadoMinutos +
                ", preparacion='" + preparacion + '\'' +
                ", detallesDeArticulo=" + detallesDeArticulo +
                ", denominacion='" + denominacion + '\'' +
                ", precioVenta=" + precioVenta +
                '}';
    }
}


