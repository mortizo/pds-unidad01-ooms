/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p65.creacional.builder;

/**
 *
 * @author morti
 */
public class MainBuilder {
    
    public static void main(String[] args) {
        
        var rentaDepar= new RentaBuilder();
        var rentaTerreno= new RentaBuilder();
        var rentaCasa= new RentaBuilder();
        
        System.out.println(rentaDepar.agua(18.63).luz(26.36).internet(29.99).construir().toString());
        System.out.println(rentaTerreno.agua(18.63).construir().toString());
        System.out.println(rentaCasa.internet(29.99).agua(18.63).construir().toString());
        
    }
    
}
