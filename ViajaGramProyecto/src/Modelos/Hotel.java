/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.ArrayList;

/**
 *
 * @author GERARDO SANCHEZ
 */
public class Hotel {
    //Atributos de la clase
    public String nombreHotel;
    public int categoriaHotel;
    public String localidad;
    public String direccionHotel;
    public String numeroTelefono;
    public String descripcion;
    public ArrayList<Habitacion> listadoHabitaciones;
    
    //Constructor por defecto
    public Hotel() {
        listadoHabitaciones = new ArrayList<>();
    }
    
    //Constructor Parametrizado
    public Hotel(String nombreHotel, int categoriaHotel, String localidad, String direccionHotel, String numeroTelefono, String descripcion) {
        this.nombreHotel = nombreHotel;
        this.categoriaHotel = categoriaHotel;
        this.localidad = localidad;
        this.direccionHotel = direccionHotel;
        this.numeroTelefono = numeroTelefono;
        this.descripcion = descripcion;
        listadoHabitaciones = new ArrayList<>();
    }
    
    //Getters And Setters Clase Hotel
    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public int getCategoriaHotel() {
        return categoriaHotel;
    }

    public void setCategoriaHotel(int categoriaHotel) {
        this.categoriaHotel = categoriaHotel;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDireccionHotel() {
        return direccionHotel;
    }

    public void setDireccionHotel(String direccionHotel) {
        this.direccionHotel = direccionHotel;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
