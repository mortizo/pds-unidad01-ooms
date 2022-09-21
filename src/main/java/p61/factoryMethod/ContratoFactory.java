/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.factoryMethod;

import p61.factoryMethod.Contrato;
import p61.factoryMethod.ContratoFactura;
import p61.factoryMethod.ContratoFijo;
import p61.factoryMethod.ContratoTemporal;

/**
 *
 * @author Mauricio Ortiz
 */
public class ContratoFactory extends ContratoAbstractFactory{

    @Override
    public Contrato crearContratoFactory(TipoContrato tipoContrato) {
        switch (tipoContrato) {
            case FIJO:
                return new ContratoFijo();
            case TEMPORAL:
                return new ContratoTemporal();
            case FACTURA:
                return new ContratoFactura();            
            default:
                throw new IllegalArgumentException("Parámetro inválido");
        }
    }
    
}
