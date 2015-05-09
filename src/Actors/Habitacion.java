/*
 * FiveStar - Sistema de informacion hotelero.
 * v1.0
 * 2015
 */
package Actors;

/**
 * Crea un objeto "Habitación" con la información necesaria para operaciones de bases 
 * de datos (Registro, consulta y eliminación)
 * @author Luis Agudelo
 */
public class Habitacion {
    String Numero = "";
    String Tipo = "";
    String Estado = "";
    String Reserva = "";
    String Huesped = "";

    /**
     * Crea una nueva instancia de la clase Habitación con los parámetros solicitados.
     * La información solicitada será utilizada en las operaciones de bases de datos 
     * (Registro, consulta y eliminación). 
     * @param numero Número de habitación. Se recomienda que se asigne automaticamente
     * a través del método "asignarHabitación()" de la clase "Db" del paquete "Metodos".
     * @param tipo Tipo de habitación.
     * @param estado Estado actual de la habitación.
     * @param reserva Código de Reserva relacionado a la habitación.
     * @param huesped Huésped asignado a la habitación.
     */
    public Habitacion(String numero, String tipo, String estado, String reserva, 
            String huesped)
    {
        this.Numero = numero;
        this.Tipo = tipo;
        this.Estado = estado;
        this.Reserva = reserva;
        this.Huesped = huesped;
    }

    /**
     * Permite obtener el número de habitación.
     * @return Número de habitación.
     */
    public String getNumero() {
        return Numero;
    }
    
    /**
     * Retorna el Tipo de habitación asignado.
     * @return Tipo de habitación (Sencilla, Doble o Suite)
     */
    public String getTipo() {
        return Tipo;
    }
    
    /**
     * Permite conocer el Estado actual de la habitación.
     * @return Estado actual de la habitación (Disponible, Ocupada, No disponible).
     */
    public String getEstado() {
        return Estado;
    }
    
    /**
     * Retorna el código de Reserva asignado a la habitación, o un "No." en caso
 de que no se haya asignado alguno.
     * @return Código de Reserva.
     */
    public String getReserva() {
        if(Reserva.equals(""))
        {
            Reserva = "No.";
        }
        return Reserva;
    }
    
    /**
     * Retorna la identificación del huésped alojado en la habitación, o un "No."
     * si no se encuentra ninguno.
     * @return Identificación del huésped que se encuentra en la habitación.
     */
    public String getHuesped() {
        if(Huesped.equals(""))
        {
            Huesped = "No.";
        }
        return Huesped;
    }
    
    /**
     * Cambia o asigna un número de identificación a la habitación.
     * @param numero Número de habitación. Por lo general este número es asignado 
     * automáticamente por el método "asignarHabitacion" de la clase "Db" del paquete
     * "Metodos".
     */
    public void setNumero(String numero) {
        this.Numero = numero;
    }
    
    /**
     * Asigna un Tipo de habitación.
     * @param tipo Tipo de habitación (Sencilla, doble o suite)
     */
    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }
    
    /**
     * Permite cambiar el Estado de una habitación según su disponibilidad.
     * @param estado Estado de la habitación (Disponible, ocupada o no disponible).
     */
    public void setEstado(String estado) {
        this.Estado = estado;
    }
    
    /**
     * Permite ingresar un código de Reserva asignado a la habitación. 
     * @param reserva Código de Reserva.
     */
    public void setReserva(String reserva) {
        this.Reserva = reserva;
    }

    /**
     * Permite ingresar el documento de identidad correspondiente al huésped asignado
     * a la habitación.
     * @param huesped Documento de identidad del huésped asignado a la habitación.
     */
    public void setHuesped(String huesped) {
        this.Huesped = huesped;
    }   
}
