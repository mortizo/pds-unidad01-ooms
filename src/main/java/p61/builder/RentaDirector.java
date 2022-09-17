/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.builder;

/**
 *
 * @author Mauricio Ortiz
 */
public class RentaDirector {

    private RentaBuilder builder;

    public void setBuilder(RentaBuilder builder) {
        this.builder = builder;
    }

    public RentaBuilder getBuilder() {
        return builder;
    }

    public void construirRenta() {
        this.builder.cobrarAgua();
        this.builder.cobrarLuz();
        this.builder.cobrarInternet();
        this.builder.cobrarAlicuota();
    }

}
