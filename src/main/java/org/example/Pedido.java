package org.example;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;



public class Pedido {
    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private Estado estado;
    private TipoDeEnvio tipoDeEnvio;
    private FormaPago formaPago;
    private LocalDate FechaPedido;
    private HashSet<DetallePedido> detallePedidos;
    private Sucursal sucursal;
    private Domicilio domicilio;
    private Factura factura;

    public Sucursal getSucursal() {
        return sucursal;
    }

    public Pedido(LocalTime horaEstimadaFinalizacion, Double total, Double totalCosto, Estado estado, TipoDeEnvio tipoDeEnvio, FormaPago formaPago, LocalDate fechaPedido, Sucursal sucursal, Domicilio domicilio, Factura factura) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
        this.total = total;
        this.totalCosto = totalCosto;
        this.estado = estado;
        this.tipoDeEnvio = tipoDeEnvio;
        this.formaPago = formaPago;
        FechaPedido = fechaPedido;
        this.sucursal = sucursal;
        this.domicilio = domicilio;
        this.factura = factura;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Pedido() {

    }

    public Pedido(LocalTime horaEstimadaFinalizacion, double total, double totalCosto, Estado estado, TipoDeEnvio tipoDeEnvio, FormaPago formaPago, LocalDate fechaPedido) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
        this.total = total;
        this.totalCosto = totalCosto;
        this.estado = estado;
        this.tipoDeEnvio = tipoDeEnvio;
        this.formaPago = formaPago;
        FechaPedido = fechaPedido;
    }

    public void addDetallesPedido(DetallePedido detallePedido) {
        if (detallePedidos == null) {
            detallePedidos = new HashSet<>();
        }
        detallePedidos.add(detallePedido);
    }

    public void removeDetallesPedido(DetallePedido detallePedido) {
        detallePedidos.remove(detallePedido);
    }



    public LocalTime getHoraEstimadaFinalizacion() {
        return horaEstimadaFinalizacion;
    }

    public void setHoraEstimadaFinalizacion(LocalTime horaEstimadaFinalizacion) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalCosto() {
        return totalCosto;
    }

    public void setTotalCosto(double totalCosto) {
        this.totalCosto = totalCosto;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public TipoDeEnvio getTipoDeEnvio() {
        return tipoDeEnvio;
    }

    public void setTipoDeEnvio(TipoDeEnvio tipoDeEnvio) {
        this.tipoDeEnvio = tipoDeEnvio;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public LocalDate getFechaPedido() {
        return FechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        FechaPedido = fechaPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "horaEstimadaFinalizacion=" + horaEstimadaFinalizacion +
                ", total=" + total +
                ", totalCosto=" + totalCosto +
                ", estado=" + estado +
                ", tipoDeEnvio=" + tipoDeEnvio +
                ", formaPago=" + formaPago +
                ", FechaPedido=" + FechaPedido +
                ", detallePedidos=" + detallePedidos +
                ", sucursal=" + sucursal +
                ", domicilio=" + domicilio +
                ", factura=" + factura +
                '}';
    }
}