/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.abstractFactory02;

/**
 *
 * @author Mauricio Ortiz Ochoa
 */
public class AutoFactory implements VehiculoAbstractFactory{

        
    private String motor;
    private String chasis;
    private String placa;

    public AutoFactory(String motor, String chasis, String placa) {
        this.motor = motor;
        this.chasis = chasis;
        this.placa = placa;
    }
    
    @Override
    public Vehiculo createVehiculo() {
        return new Auto(this.motor, this.chasis, this.placa);
    }
    
}
