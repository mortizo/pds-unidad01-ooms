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
import p61.factoryMethod.ContratoFactory;
import p61.factoryMethod.ContratoFactoryImpl;
import p61.factoryMethod.TipoContrato;
import p61.prototype.Jugador;
import p61.prototype.JugadorEcuador;
import p61.singleton.ContadorVisita;

/**
 *
 * @author morti
 */
public class PdsUnidad01Ooms {

    public static void main(String[] args) {
        
        ContadorVisita.getInstance().setValor(ContadorVisita.getInstance().getValor()+1);
        
        System.out.println(ContadorVisita.getInstance().getValor());
        
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
        var personaBuilder = new PersonaBuilder();
        personaBuilder
                .conId(777)
                .conNombre("Mauricio");
        
        
        var persona = personaBuilder.construir();
        System.out.println((persona).toString());
        
        System.out.println("Prototype");
        
        Jugador enner = new JugadorEcuador("Enner Valencia",9);
        var alexander=enner.clonar();
        alexander.setNombre("Alexander Dominguez");
        alexander.setNumero(1);
        var byron=enner.clonar();
        byron.setNombre("Byron Castillo");
        byron.setNumero(6);
        var enner1=enner.clonar();
                
        
        System.out.println(enner.toString());
        System.out.println(alexander.toString());
        System.out.println(byron.toString());
        System.out.println(enner1.toString());
        
        System.out.println("Singleton");

        ContadorVisita.getInstance().setValor(ContadorVisita.getInstance().getValor()+1);
        System.out.println(ContadorVisita.getInstance().getValor());

        
        
        
        
        
        
        
        
        
        
  

        
        
        
        
    }
}
