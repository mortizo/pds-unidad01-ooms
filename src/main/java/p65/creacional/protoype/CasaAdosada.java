/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p65.creacional.protoype;

/**
 *
 * @author morti
 */
public class CasaAdosada extends CasaModelo{

    @Override
    public CasaModelo clonar() {
        var casa = new CasaAdosada();
        casa.setDireccion("Paris y Oslo");
        casa.setNumeroHabitaciones(3);
        return casa;
    }
    
    
    
}
