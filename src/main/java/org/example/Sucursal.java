package org.example;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@SuperBuilder
@ToString

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

    public void addPromocion (Promocion promocion){
        this.promociones.add(promocion);
    }

    public void removePromocion(Promocion promocion) {
        promociones.remove(promocion);
    }
}