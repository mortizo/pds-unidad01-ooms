/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p65.creacional.abstractfactory;

/**
 *
 * @author morti
 */
public class EconomicaFactory extends TipoClase{

    @Override
    public Tame crearTame() {
        return new TameEconomica();
    }
    
}
