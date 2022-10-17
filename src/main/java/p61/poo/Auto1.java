/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.poo;

/**
 *
 * @author Mauricio Ortiz
 */
public abstract class Auto1 {
    
    private Marca objMarca;
    private String modelo;
    private int year;
    private String color;
    private int cilindraje;
    private double costo;
    
    private int calcularEdad(int yearActual){
        return this.year-yearActual;
    }

    public Marca getObjMarca() {
        return objMarca;
    }

    public void setObjMarca(Marca objMarca) {
        this.objMarca = objMarca;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    public abstract String mostrarInfo();

    public Auto1(Marca objMarca, String modelo, int year, String color, int cilindraje, double costo) {
        this.objMarca = objMarca;
        this.modelo = modelo;
        this.year = year;
        this.color = color;
        this.cilindraje = cilindraje;
        this.costo = costo;
    }
    
    
    
    
}
