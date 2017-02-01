/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author SENA
 */
public class pelicula extends items implements IVisualizable {
    
    private int año;
    
    public pelicula(){
        super();
        this.año=1900;
    }
    
    public pelicula(String titulo, String creador){
        super(titulo,creador);
        this.año=1990;
    }
    
    public pelicula(String titulo, String genero, String creador, int año, int duracion){
        super(titulo,genero,creador,duracion);
        this.año = año;
    }
    
    public int getAño(){
        return año;
    }
    
    public void setAño(int año) {
        this.año = año;
    }
    
    @Override
    public String toString() {
        return super.toString() + ",\nAño: " + año;
    }
}
