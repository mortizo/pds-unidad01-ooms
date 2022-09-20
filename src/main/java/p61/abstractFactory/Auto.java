/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.abstractFactory;



/**
 *
 * @author Mauricio Ortiz Ochoa
 */
public class Auto extends Vehiculo{
    
    private String motor;
    private String chasis;
    private String placa;

    public Auto(String motor, String chasis, String placa) {
        this.motor = motor;
        this.chasis = chasis;
        this.placa = placa;
    }
   
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
