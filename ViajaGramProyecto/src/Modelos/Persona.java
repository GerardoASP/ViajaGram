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
public class Persona extends Usuario{
    //Atributos de la clase
    public String nombrePersona;
    public String correoElectronico;
    public char sexoPersona;
    public Date fechaNacimiento;
    public String ciudad;
    public String pais;
    public ArrayList<Album> listadoAlbumes;
    
    //Constructor por defecto
    public Persona(){
        super();
        listadoAlbumes = new ArrayList<>();
    }
    
    //Constructor Parametrizado
    public Persona(String nombrePersona, String correoElectronico, char sexoPersona, Date fechaNacimiento, String ciudad, String pais, String nombreUsuario, String contrasenaUsuario, String tipoUsuario) {    
        super(nombreUsuario, contrasenaUsuario, tipoUsuario);
        this.nombrePersona = nombrePersona;
        this.correoElectronico = correoElectronico;
        this.sexoPersona = sexoPersona;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudad = ciudad;
        this.pais = pais;
        listadoAlbumes = new ArrayList<>();
    }

    //Getters And Setters Clase Persona
    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public char getSexoPersona() {
        return sexoPersona;
    }

    public void setSexoPersona(char sexoPersona) {
        this.sexoPersona = sexoPersona;
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
