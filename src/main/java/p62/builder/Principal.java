/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p62.builder;

/**
 *
 * @author morti
 */
public class Principal {
    
    public static void main(String[] args) {
        
        System.out.println(new PersonaBuilder().addCedula("0103").addApellido("Ortiz").build().toString());
        
        
    }
    
}
