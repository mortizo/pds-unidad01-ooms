/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p65.creacionales.singleton;

/**
 *
 * @author morti
 */
public class Movil {
    
    private Configuracion config;

    public Movil() {
        this.config = Configuracion.getInstance();
        config.setColor("amarillo");
        config.setTamanio("12px");
        config.setTexto("Texto a probar");
    }
    
    
    
}
