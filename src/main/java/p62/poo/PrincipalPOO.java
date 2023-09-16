package p62.poo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author morti
 */
public class PrincipalPOO {
    
    public static void main(String[] args) {
      
        var casa = new Casa(15);
        casa.setCodigo(1);
        casa.setMetrosTerreno(140);
        casa.setNumeroHabitaciones(4);
        
        System.out.println(casa.verInfo());
        
    }
    
}
