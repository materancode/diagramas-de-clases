package es.ies.puerto.hotel;
/**
 * @author materancode
 * @version 1.0.0
 */

import java.util.List;
import java.util.Objects;

public class Cliente {
       private String nombre;
    private int numeroContacto;
    private String email;
    private List<Reserva> reservas;

    /**
     * Constructor por defecto.
     */
    public Cliente() {}

    /**
     * Constructor general.
     * @param nombre
     * @param numeroContacto
     * @param email
     * @param reservas
     */
    public Cliente(String nombre, int numeroContacto, String email, List<Reserva> resrvas) {
        this.nombre = nombre;
        this.numeroContacto = numeroContacto;
        this.email = email;
        this.reservas = resrvas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroContacto() {
        return this.numeroContacto;
    }

    public void setNumeroContacto(int numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getemail() {
        return this.email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public List<Reserva> getReservas() {
        return this.reservas;
    }

    public void setReservas(List<Reserva> resrvas) {
        this.reservas = resrvas;
    }

    /**
     * Funcíon para registrar un cliente.
     * @return
     */
    public boolean registrarCliente() {
        return false;
    }

    /**
     * Función para obtener información.
     * @return
     */
    public String obtenerInformacion() {
        return "";
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + nombre + "'" +
            ", numeroContacto='" + numeroContacto + "'" +
            ", email='" + email + "'" +
            ", reservas='" + reservas + "'" +
            "}";
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cliente)) {
            return false;
        }
        Cliente cliente = (Cliente) o;
        return Objects.equals(nombre, cliente.nombre) && numeroContacto == cliente.numeroContacto && Objects.equals(email, cliente.email) && Objects.equals(reservas, cliente.reservas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numeroContacto, email, reservas);
    }
    
}
