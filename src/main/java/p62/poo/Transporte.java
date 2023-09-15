/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p62.poo;

import java.util.List;

/**
 *
 * @author morti
 */
public class Transporte {
    
    private int codigo;
    private String descripcion;
    private Propietario prop;
    
    public boolean validarCodigo(){
        boolean retorno=false;
        if(this.codigo>0)
            retorno=true;
        return retorno;
    }
    
    public double calculaMulta(RangoVelocidad rangoVelocidad){
        return 0;
    }
    
    
}
