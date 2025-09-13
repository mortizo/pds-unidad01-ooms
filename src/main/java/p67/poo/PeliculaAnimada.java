/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p67.poo;

/**
 *
 * @author morti
 */
public class PeliculaAnimada extends Pelicula{
    
    private int duracionCreditos;



    public int getDuracionCreditos() {
        return duracionCreditos;
    }

    public void setDuracionCreditos(int duracionCreditos) {
        this.duracionCreditos = duracionCreditos;
    }

    @Override
    public int obtenerLimiteEdad() {
        return 6;
    }
    
    
    
}
