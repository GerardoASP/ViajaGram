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
public class Foto {
    //Atributos de la clase 
    public String nombreFoto;
    public String lugarFoto;
    
    //Constructor por defecto
    public Foto() {
    }
    
    //Constructor Parametrizado
    public Foto(String nombreFoto, String lugarFoto) {    
        this.nombreFoto = nombreFoto;
        this.lugarFoto = lugarFoto;
    }

    //Getters And Setters Clase Foto
    public String getNombreFoto() {
        return nombreFoto;
    }

    public void setNombreFoto(String nombreFoto) {
        this.nombreFoto = nombreFoto;
    }

    public String getLugarFoto() {
        return lugarFoto;
    }

    public void setLugarFoto(String lugarFoto) {
        this.lugarFoto = lugarFoto;
    }
    
}
