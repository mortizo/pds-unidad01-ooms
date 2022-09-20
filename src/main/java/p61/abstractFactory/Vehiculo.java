/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.abstractFactory;

/**
 *https://www.digitalocean.com/community/tutorials/abstract-factory-design-pattern-in-java
 * @author Mauricio Ortiz Ochoa
 * https://www.youtube.com/watch?v=xNsPGA7zrVQ&ab_channel=Programaci%C3%B3nym%C3%A1s
 */
public abstract class Vehiculo {
     
    public abstract String getMotor();
    public abstract String getPlaca();
    public abstract String getChasis();
     
    public String info(){
        return this.getPlaca()+" "+this.getMotor()+" "+this.getChasis();
    }
}