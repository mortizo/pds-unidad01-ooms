/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.abstractFactory;

/**
 *
 * @author Mauricio Ortiz Ochoa
 */
public class VehiculoFactory {
    
    	public static Vehiculo getComputer(VehiculoAbstractFactory factory){
		return factory.createVehiculo();
	}

}
