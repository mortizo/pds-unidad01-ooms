/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p62.prototype;

/**
 *
 * @author morti
 */
public abstract class Animal {
    
    private String especie;
    private String dieta;
    private int edad;
    
    public abstract Animal clonar();

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Animal{" + "especie=" + especie + ", dieta=" + dieta + ", edad=" + edad +" ";
    }
    
    
    
    
}
