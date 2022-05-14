/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author GERARDO SANCHEZ
 */
public class Usuario {
    //Atributos de la clase
    public String nombreUsuario;
    private String contrasenaUsuario;
    public String tipoUsuario;
    
    //Constructor por defecto
    public Usuario() {
        
    }
    
    //Constructor Parametrizado
    public Usuario(String nombreUsuario, String contrasenaUsuario, String tipoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenaUsuario = contrasenaUsuario;
        this.tipoUsuario = tipoUsuario;
    }
    
    //Getters and Setters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }

    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    //Metodos de la clase
    
}
