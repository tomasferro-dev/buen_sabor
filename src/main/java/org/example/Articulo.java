package org.example;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@SuperBuilder

public abstract class Articulo {
    protected String denominacion;
    protected double precioVenta;
    private UnidadMedida unidadMedida;
    private HashSet<Imagen> imagenes;

}