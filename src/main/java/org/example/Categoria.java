package org.example;
import java.util.HashSet;
import java.util.Set;


public class Categoria {
    private String denominacion;
    private Set<Articulo> articulos;
    private Set<Categoria> subcategorias;
    private Categoria categoriaPadre = null;

    public Categoria(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void agregarArticulo(Articulo articulo) {
        if (this.articulos == null) {
            this.articulos = new HashSet<>();
        }
        this.articulos.add(articulo);
    }

    public Set<Categoria> getSubcategorias() {
        return subcategorias;
    }

    public void agregarSubcategoria(Categoria subcategoria) {
        if (this.subcategorias == null) {
            this.subcategorias = new HashSet<>();
        }
        subcategoria.setCategoriaPadre(this);
        this.subcategorias.add(subcategoria);
    }

    public Categoria getCategoriaPadre() {
        return categoriaPadre;
    }

    public void setCategoriaPadre(Categoria categoriaPadre) {
        this.categoriaPadre = categoriaPadre;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "denominacion='" + denominacion + '\'' +
                ", articulos=" + articulos +
                ", subcategorias=" + subcategorias +

                '}';
    }
}