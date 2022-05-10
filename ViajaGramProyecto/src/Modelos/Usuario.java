/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author GERARDO SANCHEZ
 */
public class Usuario {
    //Atributos de la clase
    public String nombreUsuario;
    private String contrasenaUsuario;
    public String correoElectronico;
    public char sexoUsuario;
    public Date fechaNacimiento;
    public String ciudad;
    public String pais;
    public ArrayList<Album> listadoAlbumes;
    
    //Constructor por defecto
    public Usuario(){
        listadoAlbumes = new ArrayList<>();
    }
    
    //Constructor Parametrizado
    public Usuario(String nombreUsuario,String contrasenaUsuario,String correoElectronico,char sexoUsuario,Date fechaNacimiento,String ciudad,String pais){
        this.nombreUsuario = nombreUsuario;
        this.contrasenaUsuario = contrasenaUsuario;
        this.correoElectronico = correoElectronico;
        this.sexoUsuario = sexoUsuario;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudad = ciudad;
        this.pais = pais;
        listadoAlbumes = new ArrayList<>();
    }
    
    //Getters And Setters Clase Usuario

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

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public char getSexoUsuario() {
        return sexoUsuario;
    }

    public void setSexoUsuario(char sexoUsuario) {
        this.sexoUsuario = sexoUsuario;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    //Metodos de la clase
}
