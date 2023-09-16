/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p62.factory;

/**
 *
 * @author morti
 */
public class PaqueteFactory extends AbstractPaqueteFactory{

    @Override
    public Paquete crearPaquete(int t) {
        Paquete paquete=null;
        if(t==0)
            paquete=new Nacional();
        if(t==1)
            paquete=new Internacional();
        return paquete;    
    }
    
}
