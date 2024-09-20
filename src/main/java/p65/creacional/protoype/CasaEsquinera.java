/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p65.creacional.protoype;

/**
 *
 * @author morti
 */
public class CasaEsquinera extends CasaModelo {

    @Override
    public CasaModelo clonar() {
        var casa = new CasaEsquinera();
        casa.setDireccion("Paris y Oslo");
        casa.setColor("blanco");
        return casa;
    }
    
}
