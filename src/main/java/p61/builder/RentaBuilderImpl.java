/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.builder;

/**
 *
 * @author Mauricio Ortiz
 */
public class RentaBuilderImpl extends RentaBuilder {

    private Renta renta = new Renta();

    @Override
    public void setNombrePropiedad(String nombrePropiedad) {
        this.renta.setNombrePropiedad(nombrePropiedad);
    }   
    
    @Override
    public void cobrarAgua(double agua) {
        this.renta.setAgua(agua);
    }

    @Override
    public void cobrarLuz(double luz) {
        this.renta.setLuz(luz);
    }

    @Override
    public void cobrarInternet(double internet) {
        this.renta.setInternet(internet);
    }

    @Override
    public void cobrarAlicuota(double alicuota) {
        this.renta.setAlicuota(alicuota);
    }

    public Renta getRenta(){
        return this.renta;
    }

}
