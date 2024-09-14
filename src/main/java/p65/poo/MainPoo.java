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
      
        var p = new Propietario();
        p.setCedula("0103");
        p.setNombre("Mauricio");
        var c = new Coche();
        c.setMarca("Cherolet");
        c.setModelo("Yaris");
        c.setYear(2021);
        c.setNumeroPuertas(5);
        c.setTipoCombustible(1);
        c.setCapacidadTanque(10);
        c.setPropietario(p);
        System.out.println(c.obtenerInformacion());
        System.out.println("Ingrese el tipo de vehiculo a crear....");      
        var c2 = new Coche();
        
        
    }
    
}
