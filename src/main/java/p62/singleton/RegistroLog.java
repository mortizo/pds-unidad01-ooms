/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p62.singleton;

/**
 *
 * @author morti
 */
public class RegistroLog {
    
   private static  RegistroLog instance;
   private String mensaje;
   

    public static RegistroLog getInstance() {
        if(instance==null){
            instance=new RegistroLog();
        }
        return instance;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
   
   
   
    
}
