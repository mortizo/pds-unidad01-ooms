/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.prototype;

/**
 *
 * @author Mauricio Ortiz Ochoa
 */
public abstract class Jugador {
    
    private String nombre;
    private String nacionalidad;
    private int numero;
    private String colorCamiseta;

 
    public abstract Jugador clonar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColorCamiseta() {
        return colorCamiseta;
    }

    public void setColorCamiseta(String colorCamiseta) {
        this.colorCamiseta = colorCamiseta;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre 
                + ", nacionalidad=" + nacionalidad + ", numero=" + numero 
                + ", colorCamiseta=" + colorCamiseta + '}';
    }
    
    
}
