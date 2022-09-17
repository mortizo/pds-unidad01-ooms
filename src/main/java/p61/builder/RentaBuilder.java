/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package p61.builder;

/**
 *
 * @author Mauricio Ortiz
 */
public abstract class RentaBuilder {

    protected Renta renta;

    public Renta getRenta() {
        return renta;
    }


    public abstract void cobrarAgua();

    public abstract void cobrarLuz();

    public abstract void cobrarInternet();

    public abstract void cobrarAlicuota();

}
