/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p62.prototype;

/**
 *
 * @author morti
 */
public class Principal {
    
    public static void main(String[] args) {
        Perro blue;
        Perro luna;
        Perro sancho;
        Perro tristan;
        
        blue = new Perro();
       // luna =(Perro)blue.clonar();
        luna =(Perro)blue.clonar();
        luna.setDuenio("Juana Moreno");
        luna.setEdad(6);
        
        System.out.println(luna.toString());
   
    }
    
}
