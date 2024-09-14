/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p65.creacional.factory;

/**
 *
 * @author morti
 */
public class MainFactory {
    
    public static void main(String[] args) {
        var car1= new Grado();
        System.out.println(car1.director());
        var car2= new Posgrado();
        System.out.println(car2.director());
        
        var car3=new CarreraFactory().crear(3);
        System.out.println(car3.director());

    }
    
}
