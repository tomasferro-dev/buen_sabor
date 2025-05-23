package org.example;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Sucursal {

    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Set<Promocion> promociones = new HashSet<>();
    private Set<Categoria> categorias;
    private Domicilio domicilio;

    public Sucursal (String nombre, LocalTime horarioApertura, LocalTime horarioCierre) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public void addCategoria(Categoria categoria) {
        if (categorias == null) {
            categorias = new HashSet<>();
        }
        categorias.add(categoria);
    }

    public void removeCategoria(Categoria categoria) {
        categorias.remove(categoria);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(LocalTime horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public LocalTime getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(LocalTime horarioCierre) {
        this.horarioCierre = horarioCierre;
    }



    public void addPromocion (Promocion promocion){
        this.promociones.add(promocion);
    }




    @Override
    public String toString() {
        return "Sucursal{" +
                "nombre='" + nombre + '\'' +
                ", horarioApertura=" + horarioApertura +
                ", horarioCierre=" + horarioCierre +

                ", promociones=" + promociones +

                ", categorias=" + categorias +
                ", domicilio=" + domicilio +
                '}';
    }
}