package org.example;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString

public class Empresa {
    
    private String nombre;
    private String razonSocial;
    private Integer cuil;
    private Set<Sucursal> sucursales = new HashSet<>();

    public Empresa (String nombre, String razonSocial, int Cuil) {

        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuil = Cuil;
    }

    public void addSucursal(Sucursal sucursal){
        this.sucursales.add(sucursal);

    }

    public void removerSucursal(Sucursal sucursal){
        this.sucursales.remove(sucursal);
    }


}