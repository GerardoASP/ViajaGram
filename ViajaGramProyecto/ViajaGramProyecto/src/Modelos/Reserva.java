/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.Date;

/**
 *
 * @author GERARDO SANCHEZ
 */
public class Reserva {
    //Atributos de la clase
    private Date fechaEntrada;
    private int numeroNoches;
    private boolean estadoReserva;
    private float importe;
    private Date fechaSalida;
    private Hotel hotel;
    private Persona usu;
    
    //Constructor Por Defecto
    public Reserva(){
        
    }
    
    //Constructor Parametrizado

    public Reserva(Date fechaEntrada, int numeroNoches, boolean estadoReserva, float importe, Date fechaSalida, Hotel hotel, Persona usu) {
        this.fechaEntrada = fechaEntrada;
        this.numeroNoches = numeroNoches;
        this.estadoReserva = estadoReserva;
        this.importe = importe;
        this.fechaSalida = fechaSalida;
        this.hotel = hotel;
        this.usu = usu;
    }
    
    
    //Getters And Setters Clase Reserva

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public int getNumeroNoches() {
        return numeroNoches;
    }

    public void setNumeroNoches(int numeroNoches) {
        this.numeroNoches = numeroNoches;
    }

    public boolean isEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(boolean estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Persona getUsu() {
        return usu;
    }

    public void setUsu(Persona usu) {
        this.usu = usu;
    }
    
    
}
