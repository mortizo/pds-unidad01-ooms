/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.abstractFactory02;

/**
 *
 * @author Mauricio Ortiz Ochoa
 */
public class VehiculoFactory {
    
    	public static Vehiculo getVehiculo(VehiculoAbstractFactory factory){
		return factory.createVehiculo();
	}

}
