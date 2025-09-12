/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p67.poo;

/**
 *
 * @author morti
 */
public class Pelicula {
    
    private String nombre;
    private int duracion;
    private String fecha;
    //Genero genero;
    
    boolean esCorto(){
        var retorno=false;
        if(this.duracion<=15)
            return true;
        return retorno;
    }
    
    int obtenerLimiteEdad(){
        var retorno=18;
        return retorno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
