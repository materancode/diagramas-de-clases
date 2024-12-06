package es.ies.puerto.hotel;

import java.util.Objects;

/**
 * @author materancode
 * @version 1.0.0
 */

public class Reserva {
    private String fechaEntrada;
    private String fechaSalida;
    private Cliente cliente;
    private Habitacion habitacion;
    private boolean confirmacion;

    /**
     * Constructor por defecto.
     */
    public Reserva() {}

    /**
     * Constructor general.
     * @param fechaEntrada
     * @param fechaSalida
     * @param cliente
     * @param habitacion
     * @param confirmacion
     */
    public Reserva(String fechaEntrada, String fechaSalida, Cliente cliente, Habitacion habitacion, boolean confirmacion) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.confirmacion = confirmacion;
    }

    public String getFechaEntrada() {
        return this.fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return this.fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return this.habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public boolean isConfirmacion() {
        return this.confirmacion;
    }

    public boolean getConfirmacion() {
        return this.confirmacion;
    }

    public void setConfirmacion(boolean confirmacion) {
        this.confirmacion = confirmacion;
    }

    /**
     * Función para calcular el costo de una reserva.
     * @return
     */
    public float calcularCostoTotal() {
        return 0.0f;
    }

    /**
     * Función para confirmar una reserva.
     * @return
     */
    public boolean confirmarReserva() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Reserva)) return false;
        Reserva reserva = (Reserva) o;
        return Objects.equals(fechaEntrada, reserva.fechaEntrada) &&
               Objects.equals(fechaSalida, reserva.fechaSalida) &&
               Objects.equals(cliente, reserva.cliente) &&
               Objects.equals(habitacion, reserva.habitacion) &&
               Objects.equals(confirmacion, reserva.confirmacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaEntrada, fechaSalida, cliente, habitacion, confirmacion);
    }

    @Override
    public String toString() {
        return "{" +
            " fechaEntrada='" + getFechaEntrada() + "'" +
            ", fechaSalida='" + getFechaSalida() + "'" +
            ", cliente='" + getCliente() + "'" +
            ", habitacion='" + getHabitacion() + "'" +
            ", confirmacion='" + isConfirmacion() + "'" +
            "}";
    }
    
}
