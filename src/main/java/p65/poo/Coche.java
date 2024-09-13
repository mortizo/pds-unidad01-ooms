/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p65.poo;

/**
 *
 * @author morti
 */
public class Coche extends Vehiculo{
    
    private int numeroPuertas;
    private int capacidadTanque;
    private int tipoCombustible;
   // private Vehiculo vehiculo;

   /* public Coche(int numeroPuertas, int capacidadTanque, int tipoCombustible, Vehiculo vehiculo) {
        this.numeroPuertas = numeroPuertas;
        this.capacidadTanque = capacidadTanque;
        this.tipoCombustible = tipoCombustible;
        this.vehiculo = vehiculo;
    }*/

    public Coche(int numeroPuertas, int capacidadTanque, int tipoCombustible) {
        this.numeroPuertas = numeroPuertas;
        this.capacidadTanque = capacidadTanque;
        this.tipoCombustible = tipoCombustible;
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

    
    
    
    
}
