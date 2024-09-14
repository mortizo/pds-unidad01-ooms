/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p65.poo;

/**
 *
 * @author morti
 */
public abstract class Vehiculo {
    
    private String marca;
    private String modelo;
    private int year;
    private Propietario propietario;

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
    
    public abstract int calcularEdad(int yearActual);
    
    
    public String obtenerInformacion(){
        return "Vehiculo{" + "marca=" + this.marca + ", modelo=" + this.modelo +
                ", year=" + this.year + '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

  

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

  
    
    
}
