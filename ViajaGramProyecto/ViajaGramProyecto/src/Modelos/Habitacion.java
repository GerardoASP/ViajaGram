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
public class Habitacion {
    //Atributos de la clase
    public String tipoHabitacion;
    public String descripcionHabitacion;
    public ArrayList<Tarifa> tarifas;
    
    //Constructor por defecto
    public Habitacion() {
        tarifas = new ArrayList<>();
    }
    
    //Constructor Parametrizado
    public Habitacion(String tipoHabitacion, String descripcionHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
        this.descripcionHabitacion = descripcionHabitacion;
        tarifas = new ArrayList<>();
    }
    
    //Getters and Setters Clase Habitacion

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getDescripcionHabitacion() {
        return descripcionHabitacion;
    }

    public void setDescripcionHabitacion(String descripcionHabitacion) {
        this.descripcionHabitacion = descripcionHabitacion;
    }
    
}

