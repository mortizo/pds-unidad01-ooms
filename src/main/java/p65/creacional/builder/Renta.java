/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p65.creacional.builder;

/**
 *
 * @author morti
 */
public class Renta {
    
    private int codigo;
    private double luz;
    private double agua;
    private double telefono;
    private double internet;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getLuz() {
        return luz;
    }

    public void setLuz(double luz) {
        this.luz = luz;
    }

    public double getAgua() {
        return agua;
    }

    public void setAgua(double agua) {
        this.agua = agua;
    }

    public double getTelefono() {
        return telefono;
    }

    public void setTelefono(double telefono) {
        this.telefono = telefono;
    }

    public double getInternet() {
        return internet;
    }

    public void setInternet(double internet) {
        this.internet = internet;
    }

    @Override
    public String toString() {
        return "Renta{" + "codigo=" + codigo + ", luz=" + luz + ", agua=" + agua + ", telefono=" + telefono + ", internet=" + internet + '}';
    }
    
    
    
}
