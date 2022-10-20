/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package p61;

import p61.abstractFactory.FijoFactory;
import p61.abstractFactory.TemporalFactory;
import p61.abstractFactory02.AutoFactory;
import p61.abstractFactory02.Camioneta;
import p61.abstractFactory02.CamionetaFactory;
import p61.abstractFactory02.VehiculoFactory;
import p61.builder.RentaDepartamento;
import p61.builder.RentaDirector;
import p61.builder.RentaBuilder;
import p61.builder.RentaCasa;
import p61.builder02.PersonaBuilder;
import p61.factoryMethod.Contrato;
import p61.factoryMethod.ContratoAbstractFactory;
import p61.factoryMethod.ContratoFactory;
import p61.factoryMethod.TipoContrato;
import p61.poo.Auto1;
import p61.prototype.Jugador;
import p61.prototype.JugadorEcuador;
import p61.singleton.AppMovil;
import p61.singleton.ContadorVisita;
import p61.singleton.PortalWeb;

/**
 *
 * @author Mauricio Ortiz Ochoa
 */
public class PdsUnidad01Ooms {

    public static void main(String[] args) {
        //poo();
        //factory();
        //builder();
        //abstractFctory();
        //prototype();
        singleton();
    }

    public static void poo() {
        Auto1 auto;
    }

    public static void factory() {

        System.out.println("Factory Method");
        var factory = new ContratoFactory();
        var contrato = factory.crearContratoFactory(TipoContrato.ENLINEA);
        System.out.println(contrato.calcularSueldo());

    }

    public static void builder() {

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
    }

    public static void abstractFctory() {
        System.out.println("Abstract Factory");

        var fijoFactory = new FijoFactory();
        var obj1 = fijoFactory.crearMedico().calcularSueldo();

        var obj2 = new TemporalFactory().crearMedico().calcularSueldo();
        var obj3 = new FijoFactory().crearColaborador().calcularSueldo();
        var obj4 = new TemporalFactory().crearColaborador().calcularSueldo();

        System.out.println(obj1 + " " + obj2 + " " + obj3 + " " + obj4);
    }

    public static void prototype() {
        System.out.println("Prototype");

        Jugador enner = new JugadorEcuador("Enner Valencia", 9);
        var alexander = enner.clonar();
        var byron = enner.clonar();
        var enner1 = enner.clonar();

        alexander.setNombre("Alexander Dominguez");
        alexander.setNumero(1);
        byron.setNombre("Byron Castillo");
        byron.setNumero(6);

        System.out.println(enner.toString());
        System.out.println(alexander.toString());
        System.out.println(byron.toString());
        System.out.println(enner1.toString());

    }

    public static void singleton() {

        System.out.println("Singleton");
        
        var portalWeb = new PortalWeb();
        var appMovil = new AppMovil();
                       
        System.out.println(portalWeb.realizarVisita(10));
        System.out.println(appMovil.realizarVisita(20));
        System.out.println(portalWeb.realizarVisita(70));
        
        

    }

}
