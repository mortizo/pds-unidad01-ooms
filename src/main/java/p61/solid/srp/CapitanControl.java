/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.solid.srp;

import java.util.List;


/**
 *
 * @author Mauricio Ortiz
 */
public class CapitanControl {
    
    private final CapitanServicioImpl capitanServicio = new CapitanServicioImpl();
    
    public Capitan crear(String [] args) throws RuntimeException{
        var capitan= new Capitan(this.convertirEntero(args[0]),args[1],args[2]);
        this.capitanServicio.crear(capitan);
        return capitan;
    }
    
    private int convertirEntero(String numero){
        try
        {
            return Integer.valueOf(numero);
        }catch(NumberFormatException e){
            throw new RuntimeException("El campo ingresaso solamente recibe "
                    + "números");
        }catch(Exception e){
            throw new RuntimeException("Error inesperado");
        }
    }
    
    
    public List<Capitan> listar(){
        return this.capitanServicio.listar();
    }
    
}
