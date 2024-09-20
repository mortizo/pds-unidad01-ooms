/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p65.creacionales.singleton;

/**
 *
 * @author morti
 */
public class Principal {
    
    public static void main(String[] args) {
        var mov= new Movil();
        var web= new Web();
        System.out.println(Configuracion.getInstance().getColor());
    }
    
}
