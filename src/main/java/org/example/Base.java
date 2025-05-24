package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public abstract class Base {
    protected Long id;
    protected String nombre;
    protected boolean eliminado = false;

    public Base() {}

    public Base(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public abstract String getInfo();
}