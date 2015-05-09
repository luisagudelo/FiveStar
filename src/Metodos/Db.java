/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Metodos;

import java.sql.*;
import Actors.*;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
/**
 *
 * @author Luis Agudelo
 */
public class Db {
    Database datos = new Database("jdbc:derby://localhost:1527/FiveStarDB","GERENTE","gerente");
    Connection con = null;
    Statement stat = null;
    ResultSet rs = null;
    
    public void conectar()
    {
        try
        {
            Class.forName(datos.getDerbyDriver());
            con = DriverManager.getConnection(datos.getBaseDatos(),datos.getUser(),datos.getPass());
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error: "+e+"\nNo se pudo conectar.");
        }
    }
    public void registrarHuesped(Huesped huesped)
    {
        try
        {            
            String update = "INSERT INTO HUESPEDES VALUES("
                    +"'"+huesped.getNombre()+"',"
                    +"'"+huesped.getApellido()+"',"
                    +"'"+huesped.getCelular()+"',"
                    +"'"+huesped.getEmail()+"',"
                    +"'"+huesped.getReserva()+"',"
                    +"'"+huesped.isCheckIn()+"',"
                    +"'"+huesped.getHabitacion()+"')";
            conectar();
            stat = con.createStatement();
            stat.executeUpdate(update);
            JOptionPane.showMessageDialog(null, "Registrado exitosamente.", "Registro de huespedes.",
                    JOptionPane.INFORMATION_MESSAGE);
            con.close();
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, "Error: "+e+"\nNo se pudo conectar."
                    , "Error de conexión", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Huesped consultarHuesped(String id)
    {
        Huesped huesped = null;
        try
        {
            String query = "SELECT * FROM HUESPEDES WHERE IDHUESPED = '"+id+"'";
            conectar();
            stat = con.createStatement();
            rs = stat.executeQuery(query);
            huesped.setId(rs.getString(1));
            huesped.setNombre(rs.getString(2));
            huesped.setApellido(rs.getString(3));
            huesped.setCelular(rs.getString(4));
            huesped.setEmail(rs.getString(5));
            huesped.setReserva(rs.getString(6));
            huesped.setCheckIn(rs.getString(7));
            huesped.setCheckIn(rs.getString(8));
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error: "+e+"\nNo se encontraron"
                    + "coincidencias","Consulta de huéspedes", JOptionPane.WARNING_MESSAGE);
        }
    return huesped;
    }
    
    public void actualizarHuesped(Huesped huespedOld, Huesped huespedNew)
    {
        try
        {
            String update = "UPDATE HUESPEDES SET"
                    + "IDHUESPED = '"+huespedNew.getId()+"',"
                    + "NOMBREHUESPED = '"+huespedNew.getNombre()+"',"
                    + "APELLIDOHUESPED = '"+huespedNew.getApellido()+"',"
                    + "EMAILHUESPED = '"+huespedNew.getEmail()+"',"
                    + "RESERVAHUESPED = '"+huespedNew.getReserva()+"',"
                    + "HABITACIONHUESPED = '"+huespedNew.getHabitacion()+"',"
                    + "CHECKIN = '"+huespedNew.isCheckIn()+"'"
                    + "WHERE IDHUESPED = "+huespedOld.getId();
            conectar();
            stat = con.createStatement();
            stat.executeUpdate(update);
            JOptionPane.showMessageDialog(null,"Actualizado con éxito.","Actualización"
                    + "de huéspedes",JOptionPane.INFORMATION_MESSAGE);
            con.close();
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null,"Error: "+e+".\n"
                    + "No se finalizó la operación", "Actualización de huéspedes",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eliminarHuesped(String id)
    {
        try
        {
            conectar();
            String update = "DELETE * FROM HUESPEDES WHERE IDHUESPED = '"+id+"'";
            stat = con.createStatement();
            stat.executeUpdate(update);
            JOptionPane.showMessageDialog(null,"Operación realizada con éxito.",
            "Eliminación de huéspedes.", JOptionPane.INFORMATION_MESSAGE);
            con.close();
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, "Error: "+e+"No se pudo finalizar"
                    + "la operación","Eliminar huésped", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    //--------------------------------------------------------------------------------------
    
    public void registrarHabitacion(Habitacion habitacion)
    {
        try
        {
            String update = "INSERT INTO HABITACIONES VALUES('"
                    +habitacion.getNumero()+"',"
                    +habitacion.getTipo()+"',"
                    +habitacion.getEstado()+"',"
                    +habitacion.getReserva()+"',"
                    +habitacion.getHuesped()+"')";
            conectar();
            stat = con.createStatement();
            stat.executeUpdate(update);
            JOptionPane.showMessageDialog(null,"Registrado exitosamente.", 
                    "Registro de habitaciones", JOptionPane.INFORMATION_MESSAGE);
            con.close();
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, "Error: "+e+ "\nNo se pudo registrar",
            "Registro de habitaciones", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Habitacion consultarHabitacion(String id)
    {
        Habitacion habitacion = null;
        try
        {
            String query = "SELECT * FROM HABITACIONES = '"+id+"'";
            conectar();
            stat = con.createStatement();
            rs = stat.executeQuery(query);
            habitacion.setNumero(rs.getString(1));
            habitacion.setTipo(rs.getString(2));
            habitacion.setEstado(rs.getString(3));
            habitacion.setReserva(rs.getString(4));
            habitacion.setHuesped(rs.getString(5));            
            con.close();
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null,"Error: "+e+"\nNo se pudo consultar.",
            "Consulta de habitaciones",JOptionPane.ERROR_MESSAGE);
        }
        return habitacion;
    }
    
    public void eliminarHabitacion(String id)            
    {
        try
        {
            String update = "DELETE * FROM HABITACIONES WHERE IDHABITACION = '"+id+"'";
            conectar();
            stat = con.createStatement();
            stat.executeUpdate(update);
            con.close();
            JOptionPane.showMessageDialog(null,"Habitación eliminada.","Eliminación de"
                    + "habitaciones", JOptionPane.INFORMATION_MESSAGE);
            con.close();
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null, "Error: "+e+"\nNo se pudo finalizar"
                    + "la operación","Eliminacion de habitaciones",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //--------------------------------------------------------------------------------------------------
    
    public void registrarReserva(Reserva reserva)
    {
        try
        {
            String update = "INSERT INTO RESERVAS VALUES('"
                    +reserva.getReserva()+"',"
                    +reserva.getFecha()+"',"
                    +reserva.getHuesped()+"',"
                    +reserva.getHabitacion()+"')";
            conectar();
            stat = con.createStatement();
            stat.executeUpdate(update);
            con.close();
            JOptionPane.showMessageDialog(null, "Registrado exitósamente.",
                    "Registro de reservas",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null,"Error: "+e+"\nNo se pudo registrar",
                    "Registro de Reservas",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Reserva consultarReserva(String codigo)
    {
        Reserva reserva = null;
        try
        {
            String query = "SELECT * FROM RESERVAS WHERE IDRESERVA = '"+codigo+"'";
            conectar();
            stat = con.createStatement();
            rs = stat.executeQuery(query);
            reserva.setReserva(rs.getString(1));
            reserva.setFecha(rs.getString(2));
            reserva.setHuesped(rs.getString(3));
            reserva.setHabitacion(rs.getString(4));
            con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error: "+e+"\nNo se pudo finalizar"
                    + "la operación.","Eliminación de reservas.", JOptionPane.ERROR_MESSAGE);
        }
        return reserva;
    }
    
    public void cancelarReserva(String codigo)
    {
        try
        {
            String query = "DELETE * FROM RESERVAS WHERE IDRESERVA = '"+codigo+"'";
            conectar();
            stat = con.createStatement();
            stat.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Operación realizada con éxito.",
            "Cancelación de reservas", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException | HeadlessException e)
        {
            JOptionPane.showMessageDialog(null,"Error: "+e+".\nNo se pudo realizar"
                    + "la operación", "Cancelación de reservas", JOptionPane.ERROR_MESSAGE);
        }
    }
}
