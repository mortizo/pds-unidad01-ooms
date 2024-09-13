/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p65.poo;

/**
 *
 * @author UPS
 */
public class MainPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo!");
        
        var vehiculo= new Vehiculo();
        vehiculo.setModelo("captiva");
        vehiculo.setMarca("Chevrolet");
        vehiculo.setYear(2022);
        
        //var coche = new Coche(5,10,1,vehiculo);
        //System.out.println(coche.getVehiculo().getMarca());
        
        var coche = new Coche(5,10,1);
        
        coche.setMarca("Chevrolet");
        System.out.println(coche.getMarca());
        
    }
    
}
