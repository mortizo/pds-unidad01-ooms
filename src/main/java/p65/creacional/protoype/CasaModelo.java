/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p65.creacional.protoype;

/**
 *
 * @author morti
 */
public abstract class CasaModelo {
    private String direccion;
    private int numeroHabitaciones;
    private String color;

    public abstract CasaModelo clonar();
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "CasaModelo{" + "direccion=" + direccion + ", numeroHabitaciones=" + numeroHabitaciones + ", color=" + color + '}';
    }
    
    
    
    
    
}
