/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p67.poo;

/**
 *
 * @author morti
 */
public class PeliculaDocumental extends Pelicula{
    private int duracionEntrevistas;
 
    @Override
    public int obtenerLimiteEdad() {
        return 0;
    }
    
    public int getDuracionEntrevistas() {
        return duracionEntrevistas;
    }

    public void setDuracionEntrevistas(int duracionEntrevistas) {
        this.duracionEntrevistas = duracionEntrevistas;
    }

   
    
    
}
