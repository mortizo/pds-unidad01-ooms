/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.factoryMethod.factory;

import p61.factoryMethod.Contrato;
import p61.factoryMethod.factory.TipoContrato;

/**
 *
 * @author Mauricio Ortiz
 */
public abstract class ContratoFactory {
    
    public abstract Contrato crearContratoFactory(TipoContrato tipoContrato);
    
}
