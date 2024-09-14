/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p65.poo;

import java.util.List;
import java.util.Vector;

/**
 *
 * @author morti
 */
public class Garaje {
    
    private int codigo;
    private String direccion;
    private int capacidad;
    private List<Coche> cocheList;

    public Garaje() {
        this.cocheList=new Vector();
    }
    
    public void add(Coche c){
        this.cocheList.add(c);
    }
    
    
    
}
