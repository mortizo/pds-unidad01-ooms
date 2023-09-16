/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p62.factory;

/**
 *
 * @author morti
 */
public class Principal {
    
    public static void main(String[] args) {
        
        var paqueteFactory = new PaqueteFactory();
        System.out.println(paqueteFactory.crearPaquete(0).calcularCosto());
        System.out.println(paqueteFactory.crearPaquete(1).calcularCosto());
        
        
    }
    
}
