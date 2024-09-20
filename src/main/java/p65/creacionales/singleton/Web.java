/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p65.creacionales.singleton;

/**
 *
 * @author morti
 */
public class Web {
    
    private String color;

    public Web() {
        this.color=Configuracion.getInstance().getColor();
    }
    
    
    
}
