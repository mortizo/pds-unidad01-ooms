/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.abstractFactory;

/**
 *
 * @author morti
 */
public class Principal {
    
    
    public static void main(String[] args) {
        var fijoFactory = new FijoFactory();
        System.out.println(fijoFactory.crearMedico().calcularSueldo());
        var temporalFactory = new TemporalFactory();
        var aux=temporalFactory.crearColaborador();
        System.out.println(aux.calcularSueldo());
        
    }


}
