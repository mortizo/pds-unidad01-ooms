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
      
        var propietario1 = new Propietario("0103");
        
        propietario1.setNombre("Juan");
        var propietario2 = new Propietario("0103","Juan");
        
        var casa = new Casa(4);
        casa.setCodigo(1);
        casa.setMetrosTerreno(140);
        casa.nuevaHabitacion(9);
        casa.nuevaHabitacion(11);
        casa.nuevaHabitacion(8);
        casa.agregaPropietario(propietario1);
        

        System.out.println(casa.verInfo()+" numero de habitaciones: "+
                casa.getHabitacionList().size()+
                " numero propietarios: "+casa.getPropietarioList().size());
        
    }
    
}
