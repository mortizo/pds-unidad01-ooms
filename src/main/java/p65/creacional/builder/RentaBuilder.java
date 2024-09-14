/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p65.creacional.builder;

/**
 *
 * @author morti
 */
public class RentaBuilder {
    
    private Renta renta;

    public RentaBuilder() {
        renta= new Renta();
    }
    
    public RentaBuilder agua(double a){
        this.renta.setAgua(a);
        return this;
    }
    
    public RentaBuilder luz(double a){
        this.renta.setLuz(a);
        return this;
    }
    public RentaBuilder internet(double a){
        this.renta.setInternet(a);
        return this;
    }
    /*
    public RentaBuilder codigo(int c){
        this.renta.setCodigo(c);
        return this;
    }
    
    */
    
    
    public Renta construir(){
        return this.renta;
    }
    
    
    
    
}
