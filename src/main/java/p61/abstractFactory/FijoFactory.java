/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.abstractFactory;

/**
 *
 * @author Mauricio Ortiz
 */
public class FijoFactory extends ContratoAbstractFactory{

    @Override
    public Medico crearMedico() {
        return new MedicoFijo();
    }

    @Override
    public Colaborador crearColaborador() {
        return new ColaboradorFijo();
    }
    
}
