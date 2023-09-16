/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p62.poo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author morti
 */
public class Casa extends Edificacion implements IDatos{
    
    private int numeroHabitaciones;
    private List<Habitacion> habitacionList;

    public Casa(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
        this.habitacionList= new ArrayList();
    }

    
    
    private boolean nuevaHabitacion(int metrosCloset){
        boolean retorno=false;
        var habitacion= new Habitacion();
        habitacion.setMetrosCloset(metrosCloset);
        this.habitacionList.add(habitacion);
        return retorno;
        
    }
    
    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    @Override
    public String verInfo() {
        return "La info de la edificación es: "+this.getCodigo()+" "+this.getMetrosTerreno()+" "+this.numeroHabitaciones;
    }

    @Override
    public String into() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int dato() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
