/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.abstractFactory02;

/**
 *
 * @author Mauricio Ortiz Ochoa
 * 
 */
public abstract class Vehiculo {
     
    public abstract String getMotor();
    public abstract String getPlaca();
    public abstract String getChasis();
     
    public String info(){
        return this.getPlaca()+" "+this.getMotor()+" "+this.getChasis();
    }
}