/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.builder;

/**
 *
 * @author Mauricio Ortiz
 */
public class RentaCasa extends RentaBuilder {

    public RentaCasa() {

        super.renta = new Renta();
    }

    @Override
    public void cobrarAgua() {
        this.getRenta().setAgua(20);
    }

    @Override
    public void cobrarLuz() {
        this.getRenta().setLuz(40);
    }

    @Override
    public void cobrarInternet() {
        this.getRenta().setInternet(0);
    }

    @Override
    public void cobrarAlicuota() {
        this.getRenta().setAlicuota(0);
    }

}
