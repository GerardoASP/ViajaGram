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
public class Turista {
    //Atributos de la clase
    public String nombreTurista;
    private String contrasenaTurista;
    public String correoElectronico;
    public char sexoTurista;
    public Date fechaNacimiento;
    public String ciudad;
    public String pais;
    public ArrayList<Album> listadoAlbumes;
    
    //Constructor por defecto
    public Turista(){
        listadoAlbumes = new ArrayList<>();
    }
    
    //Constructor Parametrizado

    public Turista(String nombreTurista, String contrasenaTurista, String correoElectronico, char sexoTurista, Date fechaNacimiento, String ciudad, String pais) {
        this.nombreTurista = nombreTurista;
        this.contrasenaTurista = contrasenaTurista;
        this.correoElectronico = correoElectronico;
        this.sexoTurista = sexoTurista;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudad = ciudad;
        this.pais = pais;
        listadoAlbumes = new ArrayList<>();
    }

    //Getters And Setters Clase Turista
    
    public String getNombreTurista() {
        return nombreTurista;
    }

    public void setNombreTurista(String nombreTurista) {
        this.nombreTurista = nombreTurista;
    }

    public String getContrasenaTurista() {
        return contrasenaTurista;
    }

    public void setContrasenaTurista(String contrasenaTurista) {
        this.contrasenaTurista = contrasenaTurista;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public char getSexoTurista() {
        return sexoTurista;
    }

    public void setSexoTurista(char sexoTurista) {
        this.sexoTurista = sexoTurista;
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
