/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p65.poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author morti
 */
public class Coche extends Vehiculo{

    
    
    private int numeroPuertas;
    private int capacidadTanque;
    private int tipoCombustible;
    private List llantaList;

    public Coche() {
        this.llantaList= new ArrayList();
    }
    
    public void addLlanta(String m, int l){
        this.llantaList.add(new Llanta(m,l));
    }

    
    
    
    public int calcularEdad(int yearActual) {
        return yearActual-this.getYear();
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public int getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(int tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String obtenerInformacion(){
        return super.obtenerInformacion()+
                this.capacidadTanque+" "+this.numeroPuertas+" "+
                this.tipoCombustible;
    }
    
    
    
    
}
