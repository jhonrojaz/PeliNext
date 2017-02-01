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
public class serie extends items implements IVisualizable {
    
    private int temporadas;
    
    public serie(){
        super();
        this.temporadas=1;
    }
    
    public serie(String titulo, String creador) {
        super(titulo, creador);
        this.temporadas=1;
    }
    
    public serie(String titulo, String genero, String creador, int duracion, int temporadas){
        super(titulo, genero, creador, duracion);
        this.temporadas=temporadas;
    }
    
    public int getTemporadas(){
        return temporadas;
    }
    
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    
    @Override
    public String toString(){
        return super.toString() + ",\nNumero de temporadas: " + temporadas;
    }
    
}
