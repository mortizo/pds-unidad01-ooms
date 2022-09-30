/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.solid.srp;

import java.util.Arrays;

/**
 *
 * @author UPS
 */
public class CapitanVistaConsola {
    
    public static void main(String [] args){
        
        var capitanes = new CapitanSinSRP();
        capitanes.crear(new CapitanSinSRP(1,"Mauricio","Ecuador"));
        capitanes.crear(new CapitanSinSRP(2,"Pedro","Argentina"));
        capitanes.crear(new CapitanSinSRP(3,"Adrián","Argentina"));
        capitanes.crear(new CapitanSinSRP(4,"Freddy","Argentina"));
        capitanes.crear(new CapitanSinSRP(5,"Carlos","Argentina"));
        
        for(var c: capitanes.listar()){
            System.out.println(c.toString());
        }
            
        
    }
    
}
