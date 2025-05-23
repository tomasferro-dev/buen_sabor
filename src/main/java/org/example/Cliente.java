package org.example;
import java.time.LocalDate;
import java.util.HashSet;


public class Cliente {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;
    private Imagen imagen;

    private HashSet<Pedido> pedidos;
    private HashSet<Domicilio> domicilios;
    private Usuario usuario;

    public Cliente(String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Cliente(String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento, Imagen imagen, Usuario usuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.imagen = imagen;
        this.usuario = usuario;
    }

    public Cliente() {}

    public void addPedidos(Pedido pedido) {
        if (pedidos == null) {
            pedidos = new HashSet<>();
        }
        pedidos.add(pedido);
    }
    public void removePedidos(Pedido pedido) {
        pedidos.remove(pedido);
    }
    public void addDomicilios(Domicilio domicilio) {
        if (domicilios == null) {
           domicilios = new HashSet<>();
        }
        domicilios.add(domicilio);
        }
        public void removeDomicilios(Domicilio domicilio) {
        domicilios.remove(domicilio);
        }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", imagen=" + imagen +
                ", pedidos=" + pedidos +
                ", domicilios=" + domicilios +
                ", usuario=" + usuario +
                '}';
    }
}