/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USUARIO
 */
public class ConexionBD {

    private static String URL = "jdbc:mysql://localhost/reservacion_habitaciones";
    private static String Usuario = "jhonatan";
    private static String Contraseña = "manuscritokilo12";

    public static Connection conectar() {

        Connection conexion = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, Usuario, Contraseña);
            System.out.println("Conexion establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e);

        }

        return conexion;
    }
}
