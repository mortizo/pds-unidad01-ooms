/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p62.singleton;

/**
 *
 * @author morti
 */
public class Principal {
    
    public static void main(String[] args) {
        var sA = new ServidorAplicacion();
        sA.cargarMensaje("Error en el despliegue");
        sA.cargarMensaje("Error en la carga");
        sA.cargarMensaje("Error 400");
        var sBD = new ServidorBase();
        sBD.cargarMensaje("Error puerto");
        sBD.cargarMensaje("Error encolado");
        
        
        
        System.out.println(RegistroLog.getInstance().getMensaje());
        
    }
    
}
