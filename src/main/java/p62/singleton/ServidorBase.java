/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p62.singleton;

/**
 *
 * @author morti
 */
public class ServidorBase {
    
    public String cargarMensaje(String m){
        String retorno="";
        RegistroLog.getInstance().setMensaje(RegistroLog.getInstance().getMensaje()+" | "+m);
        
        return retorno;
    }
    
}
