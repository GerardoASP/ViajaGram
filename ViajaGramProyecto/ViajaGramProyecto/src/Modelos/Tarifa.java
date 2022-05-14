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
public class Tarifa {
    //Atributos de la clase
    public String nombreTarifa;
    public String jornadaTarifa;
    public float precio;
    public int cantidadPersonas;
    
    //Constructor por defecto
    public Tarifa() {
    }
    
    //Constructor parametrizado
    public Tarifa(String nombreTarifa, String jornadaTarifa, float precio, int cantidadPersonas) {
        this.nombreTarifa = nombreTarifa;
        this.jornadaTarifa = jornadaTarifa;
        this.precio = precio;
        this.cantidadPersonas = cantidadPersonas;
    }
    
    //Getters and Setters Clase Tarifa
    public String getNombreTarifa() {
        return nombreTarifa;
    }

    public void setNombreTarifa(String nombreTarifa) {
        this.nombreTarifa = nombreTarifa;
    }

    public String getJornadaTarifa() {
        return jornadaTarifa;
    }

    public void setJornadaTarifa(String jornadaTarifa) {
        this.jornadaTarifa = jornadaTarifa;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }
    
}
