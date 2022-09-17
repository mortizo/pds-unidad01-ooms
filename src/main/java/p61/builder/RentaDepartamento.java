/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.builder;

/**
 *
 * @author Mauricio Ortiz
 */
public class RentaDepartamento extends RentaBuilder {

    public RentaDepartamento() {
        super.renta= new Renta();
    }

    @Override
    public void cobrarAgua() {
        this.getRenta().setAgua(15);
    }

    @Override
    public void cobrarLuz() {
        this.getRenta().setLuz(30);
    }

    @Override
    public void cobrarInternet() {
        this.getRenta().setInternet(40);
    }

    @Override
    public void cobrarAlicuota() {
        this.getRenta().setAlicuota(70);
    }

}
