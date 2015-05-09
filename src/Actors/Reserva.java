/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actors;

/**
 *Crea un objeto "Reserva" con la información necesaria para operaciones con bases 
 * de datos (Registro, consulta y eliminación)
 * @author Luis Agudelo
 */
public class Reserva {
    String Reserva = "";
    String Fecha = "";
    String Huesped = "";
    String Habitacion = "";
    
    public Reserva(String reserva, String fecha, String huesped, String habitacion)
    {
        Reserva = reserva;
        Fecha = fecha;
        Huesped = huesped;
        Habitacion = habitacion;
    }

    public String getReserva() {
        return Reserva;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getHuesped() {
        return Huesped;
    }

    public String getHabitacion() {
        return Habitacion;
    }

    public void setReserva(String Reserva) {
        this.Reserva = Reserva;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setHuesped(String Huesped) {
        this.Huesped = Huesped;
    }

    public void setHabitacion(String Habitacion) {
        this.Habitacion = Habitacion;
    }   
    
}
