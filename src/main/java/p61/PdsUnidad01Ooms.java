/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package p61;

import p61.factoryMethod.Contrato;
import p61.factoryMethod.factory.ContratoFactory;
import p61.factoryMethod.factory.ContratoFactoryImpl;
import p61.factoryMethod.factory.TipoContrato;

/**
 *
 * @author morti
 */
public class PdsUnidad01Ooms {

    public static void main(String[] args) {
        System.out.println("Factory Method");
        ContratoFactory factory = new ContratoFactoryImpl();
        Contrato contrato = factory.crearContratoFactory(TipoContrato.FIJO);
        System.out.println(contrato.calcularSueldo());
        
    }
}
