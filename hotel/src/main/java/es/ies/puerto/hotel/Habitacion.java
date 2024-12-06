package es.ies.puerto.hotel;
/**
 * @author materancode
 * @version 1.0.0
 */

import java.util.List;
import java.util.Objects;

public class Habitacion {
        private int numHabitacion;
    private String tipoHabitacion;
    private float precioPorNoche;
    private List<Reserva> reservas;
    private boolean disponibilidad;

    /**
     * Constructor vacio.
     */
    public Habitacion() {}

    /**
     * Constructor general.
     * @param numHabitacion
     * @param tipoHabitacion
     * @param precioPorNoche
     * @param reservas
     * @param disponibilidad
     */
    public Habitacion(int numHabitacion, String tipoHabitacion, float precioPorNoche, List<Reserva> reservas, boolean disponibilidad) {
        this.numHabitacion = numHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.precioPorNoche = precioPorNoche;
        this.reservas = reservas;
        this.disponibilidad = disponibilidad;
    }

    public int getnumHabitacion() {
        return this.numHabitacion;
    }

    public void setnumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public String getTipoHabitacion() {
        return this.tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public float getprecioPorNoche() {
        return this.precioPorNoche;
    }

    public void setprecioPorNoche(float precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public List<Reserva> getReservas() {
        return this.reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public boolean getDisponibilidad() {
        return this.disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    /**
     * Función para comprobar la disponibilidad.
     * @return
     */
    public boolean comprobarDisponobilidad() {
        return false;
    }

    /**
     * Función para cambiar el estado.
     * @return
     */
    public boolean cambiarEstado() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Habitacion)) return false;
        Habitacion habitacion = (Habitacion) o;
        return numHabitacion == habitacion.numHabitacion && 
        Objects.equals(tipoHabitacion, habitacion.tipoHabitacion) && 
                       precioPorNoche == habitacion.precioPorNoche && 
        Objects.equals(reservas, habitacion.reservas) && 
                       disponibilidad == habitacion.disponibilidad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numHabitacion, tipoHabitacion, precioPorNoche, reservas, disponibilidad);
    }

    @Override
    public String toString() {
        return "{" +
            " numHabitacion='" + getnumHabitacion() + "'" +
            ", tipoHabitacion='" + getTipoHabitacion() + "'" +
            ", precioPorNoche='" + getprecioPorNoche() + "'" +
            ", reservas='" + getReservas() + "'" +
            ", disponibilidad='" + getDisponibilidad() + "'" +
            "}";
    }
}
