package org.example;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

public class Empresa {


    @Getter
    @Setter
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


    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", cuil=" + cuil +
                ", sucursales=" + sucursales +
                '}';
    }
}