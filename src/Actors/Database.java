/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Actors;

/**
 *
 * @author Luis Agudelo
 */
public class Database {
    String BaseDatos = "";
    String User = "";
    String Pass = "";
    final String DerbyDriver = "org.apache.derby.jdbc.ClientDriver";
    final String MySQLDriver = "com.mysql.jdbc.Driver";

    public Database(String basedatos, String user, String pass) {        
        BaseDatos = basedatos;
        User = user;
        Pass = pass;
    }

    public String getBaseDatos() {
        return BaseDatos;
    }

    public String getUser() {
        return User;
    }

    public String getPass() {
        return Pass;
    }

    public String getDriver() {
        return DerbyDriver;
    }

    public String getDerbyDriver() {
        return DerbyDriver;
    }

    public String getMySQLDriver() {
        return MySQLDriver;
    }    

    public void setBaseDatos(String BaseDatos) {
        this.BaseDatos = BaseDatos;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }
     
}
