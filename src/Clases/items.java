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
public class items implements IVisualizable {
    private String titulo;
    private String genero;
    private String creador;
    private int duracion;
    private boolean visto;
    private String tvisto = "00m 00s";
    
    public items(){
        this.titulo="";
        this.genero="";
        this.creador="";
        this.duracion=0;
        this.visto=false;
        this.tvisto = "00m 00s";
    }
    
    public items(String titulo, String creador){
        this.titulo=titulo;
        this.creador=creador;
        this.genero="";
        this.duracion=0;
        this.visto=false;
        this.tvisto = "00m 00s";
    }
    
    public items(String titulo, String genero, String creador, int duracion){
        this.titulo=titulo;
        this.genero=genero;
        this.creador=creador;
        this.duracion=duracion;
        this.visto=false;
        this.tvisto = "00m 00s";
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public  void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getCreador() {
        return creador;
    }
    
    public void setCreador(String creador) {
        this.creador = creador;
    }
    
    public int getDuracion() {
        return duracion;
    }
    
    public void setDuracion(int duracion){
        this.duracion = duracion;
    }
    
    @Override
    public String toString() {
        return "Titulo: " + titulo + ",\nGenero: " + genero + ",\nCreador: " + creador + ",\nDuracion: " + duracion + ",\nVisto: " + visto ;
    }
    
    @Override
    public void marcarVisto(String tvisualizado) {
        this.visto = true;
        this.tvisto = "Visualizando hasta el tiempo: " + tvisualizado;
    }
    
    @Override
    public boolean esVisto() {
        return this.visto;
    }
    
    @Override
    public String tiempoVisto() {
        return this.tvisto;
    }
}
