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
    
    String nombre;
    int duracion;
    String fecha;
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
    
    
    
}
