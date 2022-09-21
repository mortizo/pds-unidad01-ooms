/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.abstractFactory02;


//
/**
 *
 * @author Mauricio Ortiz Ochoa
 */
public class Camioneta extends Vehiculo{
    
    private String motor;
    private String chasis;
    private String placa;
    

    @Override
    public String getMotor() {
        return this.motor;
    }

    @Override
    public String getPlaca() {
        return this.placa;   
    }

    @Override
    public String getChasis() {
        return this.chasis;
    }
    
}
