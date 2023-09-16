/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p62.poo;

/**
 *
 * @author morti
 */
public abstract class Edificacion {
    
    private int codigo;
    private int metrosTerreno;

    public abstract String verInfo();

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getMetrosTerreno() {
        return metrosTerreno;
    }

    public void setMetrosTerreno(int metrosTerreno) {
        this.metrosTerreno = metrosTerreno;
    }
    
    
}
