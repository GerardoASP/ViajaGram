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
public class Album {
    //Atributos de la clase
    public String nombreAlbum;
    public Date fechaCreacion;
    public ArrayList<Foto> listadoFotos;
    
    //Constructor por defecto
    public Album() {
        listadoFotos = new ArrayList<>();
    }
    
    //Constructor Parametrizado
    public Album(String nombreAlbum, Date fechaCreacion) {
        this.nombreAlbum = nombreAlbum;
        this.fechaCreacion = fechaCreacion;
        listadoFotos = new ArrayList<>();
    }
    
    //Getters And Setters Clase Album
    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
}
