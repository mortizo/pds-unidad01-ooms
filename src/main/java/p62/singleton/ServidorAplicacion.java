/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p62.singleton;

/**
 *
 * @author morti
 */
public class ServidorAplicacion {
    
    public String cargarMensaje(String er){
        String retorno ="";
        RegistroLog reg = RegistroLog.getInstance();
        reg.setMensaje(reg.getMensaje()+" | "+er);
        return retorno;
    }
    
}
