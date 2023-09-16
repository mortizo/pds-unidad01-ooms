/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.factoryMethod;

/**
 *
 * @author morti
 */
public class Principal {
    
    public static void main(String[] args) {
        var contratoFactory = new ContratoFactory();
        System.out.println(contratoFactory.crearContratoFactory(TipoContrato.FIJO).calcularSueldo());
        
    }
    
}
