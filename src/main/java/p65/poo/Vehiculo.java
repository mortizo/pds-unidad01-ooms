/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p65.poo;

/**
 *
 * @author morti
 */
public class Vehiculo {
    
    private String marca;
    private String modelo;
    private int year;
    
    public int calcularEdad(int yearActual){
        return yearActual-this.year;
    }
    
    public String obtenerInformacion(){
        return this.toString();
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
