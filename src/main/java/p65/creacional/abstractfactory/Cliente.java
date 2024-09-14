/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p65.creacional.abstractfactory;

/**
 *
 * @author morti
 */
public class Cliente {
    
    public static void main(String[] args) {
        var ef= new EconomicaFactory();
        System.out.println(ef.crearTame().costoPasaje());
    }
    
}
