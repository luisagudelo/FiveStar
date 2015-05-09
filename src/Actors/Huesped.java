/*
 * FiveStar - Sistema de información Hotelero.
 * v1.0
 * 2015
 */
package Actors;

/**
 *Crea un objeto "Huesped" con la información necesaria para operaciones en bases de
 * datos (Registro, consulta y eliminación).
 * @author Luis Agudelo
 */
public class Huesped {
    String Id = "";
    String Nombre = "";
    String Apellido = "";
    String Celular = "";
    String Email = "";
    String Reserva = "";
    String CheckIn = "";
    String Habitacion = "";
    
    
    /**
     * Crea una nueva instancia de la clase cliente con los parámetros solicitados.
     * Dichos datos solicitados se usarán para la operaciones relacionadas a bases de datos (Registro,
     * Consulta y eliminación.
     * @param id Numero de identificación del huésped.
     * @param nombre Nombre del huésped correctamente escrito (Mayúscula inicial)
     * @param apellido Apellido del huésped correctamente escrito.
     * @param celular Número celular del huésped.
     * @param email Dirección de correo electrónico del huésped.
     * @param reserva Código de reserva del cliente.
     * @param checkin Estadía del huésped en el hotel.
     * @param habitacion Número de habitación asignado al huésped.
     */
    public Huesped(String id,String nombre, String apellido, String celular, String email,
            String reserva, String checkin, String habitacion)
    {
        Id = id;
        Nombre = nombre;
        Apellido = apellido;
        Celular = celular;
        Email = email;
        Reserva = reserva;
        CheckIn = checkin;
        Habitacion = habitacion;
    }   

    /**
     * Retorna el número de identificación del huésped.
     * @return Número de identificación.
     */
    public String getId() {
        return Id;
    }    
    
    /**
     * 
     * @return Retorna el nombre del huésped. 
     */
    public String getNombre() {
        return Nombre;
    }
    
    /**
     * 
     * @return Retorna el apellido del huésped. 
     */
    public String getApellido() {
        return Apellido;
    }
    
    /**
     * 
     * @return Retorna el número celular del huésped. 
     */
    public String getCelular() {
        return Celular;
    }
    
    /**
     * 
     * @return Retorna la dirección de correo electrónico del huésped. 
     */
    public String getEmail() {
        return Email;
    }
    
    /**
     * 
     * @return Retorna el código de reserva del cliente, en caso de que exista. 
     */
    public String getReserva() {
        if(Reserva.equals(""))
        {
            Reserva = "Sin reserva.";
        }
        return Reserva;
    }
    
    /**
     * 
     * @return Retorna si el huésped se encuentra en el hotel. 
     */
    public String isCheckIn() {        
        return CheckIn;
    }
    
    /**
     * 
     * @return Retorna el número de la habitación en donde se encuentra el cliente. 
     */
    public String getHabitacion() {
        if(Habitacion.equals(""))
        {
            Habitacion = "Ninguna.";
        }
        return Habitacion;
    }

    /**
     * Asigna un número de identificación al huésped.
     * @param Id Número de identificación del huésped.
     */
    public void setId(String Id) {
        this.Id = Id;
    }    
    
    /**
     * Determina el nombre del huésped.
     * @param Nombre: El nombre del huesped. Escrito correctamente (Mayúscula inicial). 
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    /**
     * Determina el apellido del huésped.
     * @param Apellido: El apellido del huésped. Escrito correctamente (Mayúscula inicial.)
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

       /**
        * Determina el número de teléfono celular del huésped.
        * @param Celular: El número de celular del huésped. No mayor a 10 
        * carácteres.
        */
    public void setCelular(String Celular) {
        this.Celular = Celular;
    }
    
    /**
     * Especifíca la dirección de correo electrónico del huésped.
     * @param Email: Dirección de correo electrónico del huésped. 
     */
    public void setEmail(String Email) {
        if(Email.equals(""))
        {
            Email = "Sin correo electrónico.";
        }
        this.Email = Email;
    }
    
    /**
     * Especifica el código de reserva del huésped.
     * @param Reserva: Código de reserva, conformado por la fecha de reserva y 
     * el número de habitación.
     */
    public void setReserva(String Reserva) {
        this.Reserva = Reserva;
    }
    
    /**
     * Indica si el huésped se encuentra en el hotel.
     * @param CheckIn 
     */
    public void setCheckIn(String CheckIn) {
        this.CheckIn = CheckIn;
    }
    
    /**
     * Indica el número de habitación en la que se encuentra el huésped.
     * @param Habitacion: Número de habitación a la que se dirige o se encuentra
     * el huésped.
     */
    public void setHabitacion(String Habitacion) {
        this.Habitacion = Habitacion;
    }    
}
