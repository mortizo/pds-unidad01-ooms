/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p65.creacionales.singleton;

/**
 *
 * @author morti
 */
public class Configuracion {
    
    private static Configuracion instance;
    private String texto;
    private String color;
    private String tamanio;

    public static Configuracion getInstance() {
        if(instance==null){
            instance=new Configuracion();
        }
        return instance;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    
    
    
    
}
