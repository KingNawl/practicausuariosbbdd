package conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class CConexionbbdd {
    Connection conectar;
    
    String usuario="root";
    String contrasenia="1234";
    String bd="practicaUsuarios";
    String ip="127.0.0.1";
    String puerto="3306";
    
    String cadena= "jdbc:mysql://"+ip+":"+puerto+"/"+bd;

    
    
    /**
     * Establece la conexion a la base de datos
     */
    
    public Connection estableceConexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
            JOptionPane.showMessageDialog(null, "Se conectó correctamente a la BASE DE DATOS");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Problemas en la conexion "+e.toString());
        }
        return conectar;
    }
    
    /**
     * Cierra la base de datos
     */
    public void close(){
        try {
            conectar.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(), "Error al cerrar la conexion con la base de datos",JOptionPane.ERROR_MESSAGE);
        }
    }

}
