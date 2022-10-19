/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.prototype;

/**
 *
 * @author Mauricio Ortiz Ochoa
 */
public class JugadorEcuador extends Jugador {

    public JugadorEcuador(String nombre, int numero) {
        this.setNombre(nombre);
        this.setNumero(numero);
        this.setNacionalidad("Ecuatoriano");
        this.setColorCamiseta("Amarillo");
    }

    @Override
    public Jugador clonar() {
        return new JugadorEcuador(this.getNombre(),this.getNumero());
    }
    
}
