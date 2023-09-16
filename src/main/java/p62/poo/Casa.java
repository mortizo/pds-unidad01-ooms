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
    private List<Propietario> propietarioList;
    
    
    public Casa(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
        this.habitacionList= new ArrayList();
    }

    public boolean nuevaHabitacion(int metrosCloset){
        boolean retorno=false;
        var habitacion= new Habitacion();
        habitacion.setMetrosCloset(metrosCloset);
        this.habitacionList.add(habitacion);
        retorno=true;
        return retorno;
        
    }
    
    public boolean agregaPropietario(Propietario propietario){
        boolean retorno=false;
        this.propietarioList.add(propietario);
        return retorno;
    }
    
    
    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public List<Habitacion> getHabitacionList() {
        return habitacionList;
    }

    public void setHabitacionList(List<Habitacion> habitacionList) {
        this.habitacionList = habitacionList;
    }

    public List<Propietario> getPropietarioList() {
        return propietarioList;
    }

    public void setPropietarioList(List<Propietario> propietarioList) {
        this.propietarioList = propietarioList;
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
