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

    public Transporte(int codigo) {
        this.codigo = codigo;
        
        
    }
    

    public Transporte(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public Transporte(int codigo, String descripcion, Propietario prop) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.prop = prop;
    }
    
    
    
    
    public boolean validarCodigo(){
        boolean retorno=false;
        if(this.codigo>0)
            retorno=true;
        return retorno;
    }
    
    public double calculaMulta(RangoVelocidad rangoVelocidad){
        return 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Propietario getProp() {
        return prop;
    }

    public void setProp(Propietario prop) {
        this.prop = prop;
    }
    
    
    
    
}
