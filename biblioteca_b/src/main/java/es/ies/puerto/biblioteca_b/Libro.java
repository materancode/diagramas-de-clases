package main.java.es.ies.puerto.biblioteca_b;

import java.util.Objects;

/**
 * @author materancode
 * @version 1.0.0
 */

public class Libro {
       private String titulo;
    private String autor;
    private int isbn;
    private Categoria categoria;
    private boolean disponibilidad;

    /**
     * Constructor por defecto.
     */
    public Libro() {}

    /**
     * Constructor solo con el isbn.
     * @param isbn
     */
    public Libro(int isbn) {
        this.isbn = isbn;
    }    

    /**
     * Constructor general.
     * @param titulo
     * @param autor
     * @param isbn
     * @param categoria
     * @param disponibilidad
     */
    public Libro(String titulo, String autor, int isbn, Categoria categoria, boolean disponibilidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.categoria = categoria;
        this.disponibilidad = disponibilidad;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return this.isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public boolean isDisponibilidad() {
        return this.disponibilidad;
    }

    public boolean getDisponibilidad() {
        return this.disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    /**
     * Función que verifica la disponibilidad.
     * @return
     */
    public boolean verificarDisponibilidad() {
        return false;
    }

    /**
     * Función que asigna a una categoria.
     * @return
     */
    public boolean asignarCategoria() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Libro)) return false;
        Libro libro = (Libro) o;
        return isbn == libro.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, isbn, categoria, disponibilidad);
    }

    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", autor='" + getAutor() + "'" +
            ", isbn='" + getIsbn() + "'" +
            ", categoria='" + getCategoria() + "'" +
            ", disponibilidad='" + isDisponibilidad() + "'" +
            "}";
    }
}
