/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.builder;

/**
 *
 * @author Mauricio Ortiz
 */
public class Renta {

    private double agua;
    private double luz;
    private double internet;
    private double alicuota;

    public double getAgua() {
        return agua;
    }

    public void setAgua(double agua) {
        this.agua = agua;
    }

    public double getLuz() {
        return luz;
    }

    public void setLuz(double luz) {
        this.luz = luz;
    }

    public double getInternet() {
        return internet;
    }

    public void setInternet(double internet) {
        this.internet = internet;
    }

    public double getAlicuota() {
        return alicuota;
    }

    public void setAlicuota(double alicuota) {
        this.alicuota = alicuota;
    }

    @Override
    public String toString() {
        return "PagoRenta{" + " agua=" + agua
                + ", luz=" + luz
                + ", internet=" + internet
                + ", alicuota=" + alicuota + '}';
    }

}
