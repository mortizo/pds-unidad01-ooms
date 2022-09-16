/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.factoryMethod.factory;

import p61.factoryMethod.Contrato;
import p61.factoryMethod.ContratoFacturaImpl;
import p61.factoryMethod.ContratoFijoImpl;
import p61.factoryMethod.ContratoTemporalImpl;

/**
 *
 * @author Mauricio Ortiz
 */
public class ContratoFactoryImpl extends ContratoFactory{

    @Override
    public Contrato crearContratoFactory(TipoContrato tipoContrato) {
        switch (tipoContrato) {
            case FIJO:
                return new ContratoFijoImpl();
            case TEMPORAL:
                return new ContratoTemporalImpl();
            case FACTURA:
                return new ContratoFacturaImpl();            
            default:
                throw new IllegalArgumentException("Parámetro inválido");
        }
    }
    
}
