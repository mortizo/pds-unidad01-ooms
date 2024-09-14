/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p65.creacional.factory;

/**
 *
 * @author morti
 */
public class CarreraFactory extends AbstractCarreraFactory{

    @Override
    public Carrera crear(int t) {
        Carrera carrera=null;
        if(t==1)
            carrera=new Grado();
        if(t==2)
            carrera=new Posgrado();
        if(t==3)
            carrera=new Tecnologia();
        return carrera;
    }
    
}
