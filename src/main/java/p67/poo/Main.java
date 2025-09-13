/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p67.poo;

import java.util.ArrayList;

/**
 *
 * @author morti
 */
public class Main {
    public static void main(String[] args) {
        
        
        var leo= new Actor("Leonardo Di Caprio",50);
        var kate = new Actor("Kate Winslet",48);
                
        
        var losIncas = new PeliculaDocumental();
        var laBombaAtomica = new PeliculaDocumentalHistorico();
        var pinocho= new PeliculaAnimada();
        pinocho.setNombre("Pinocho hijo de Gepeto");
        pinocho.setDuracion(120);
        pinocho.setDuracionCreditos(10);
        pinocho.setPremioList(new ArrayList());
        //COMPOSICIÓN
        pinocho.getPremioList().add(new Premio("Oscar",2011));
        pinocho.getPremioList().add(new Premio("BAFTA",2010));
        //AGREGACIÓN
        pinocho.setActorList(new ArrayList());
        pinocho.getActorList().add(leo);
        pinocho.getActorList().add(kate);
        losIncas.setActorList(new ArrayList());
        losIncas.getActorList().add(leo);
        
        
        
        System.out.println(laBombaAtomica.obtenerLimiteEdad());
        System.out.println(pinocho.obtenerLimiteEdad());
        System.out.println(losIncas.obtenerLimiteEdad());
        
        
    }
}
