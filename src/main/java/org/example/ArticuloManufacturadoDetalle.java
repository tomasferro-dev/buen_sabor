package org.example;

public class ArticuloManufacturadoDetalle {
    private Integer cantidad;
    private ArticuloInsumo articuloInsumo;


    public ArticuloManufacturadoDetalle(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public ArticuloInsumo getArticuloInsumo() {
        return articuloInsumo;
    }

    public void setArticuloInsumo(ArticuloInsumo articuloInsumo) {
        this.articuloInsumo = articuloInsumo;
    }



    @Override
    public String toString() {
        return "ArticuloManufacturadoDetalle{" +
                "cantidad=" + cantidad +
                ", articuloInsumo=" + articuloInsumo +
                '}';
    }
}