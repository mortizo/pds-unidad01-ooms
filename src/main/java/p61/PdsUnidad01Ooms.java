/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package p61;

import p61.builder.RentaDepartamento;
import p61.builder.RentaDirector;
import p61.builder.RentaBuilder;
import p61.builder.RentaCasa;
import p61.builder02.PersonaBuilder;
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
        var factory = new ContratoFactoryImpl();
        var contrato = factory.crearContratoFactory(TipoContrato.FIJO);
        System.out.println(contrato.calcularSueldo());
        
        System.out.println("Builder");
        var director = new RentaDirector();
        var renta1 = new RentaDepartamento();
        var renta2 = new RentaCasa();
        
        director.setBuilder(renta1);
        director.construirRenta();
        System.out.println(director.getBuilder().getRenta().toString());
        
        director.setBuilder(renta2);
        director.construirRenta();
        System.out.println(director.getBuilder().getRenta().toString());
        
        System.out.println("Builder 2");
        var persona = new PersonaBuilder();
        persona
                .conId(777)
                .conNombre("Mauricio")
                .conEdad(41);
        
        System.out.println((persona.construir()).toString());
        
        
        
  

        
        
        
        
    }
}
