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
      
        var propietario = new Propietario();
        propietario.setCedula("0103");
        propietario.setNombre("Juan");
        
        
        var casa = new Casa(4);
        casa.setCodigo(1);
        casa.setMetrosTerreno(140);
        casa.nuevaHabitacion(9);
        casa.nuevaHabitacion(11);
        casa.nuevaHabitacion(8);
        casa.agregaPropietario(propietario);
        

        System.out.println(casa.verInfo()+" numero de habitaciones: "+
                casa.getHabitacionList().size()+
                " numero propietarios: "+casa.getPropietarioList().size());
        
    }
    
}
