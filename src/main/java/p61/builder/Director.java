/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.builder;

/**
 *
 * @author morti
 */
public class Director {
    
    private RentaBuilder builder;

    public RentaBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(RentaBuilder builder) {
        this.builder = builder;
    }
    
    public void construir(){
        builder.setNombrePropiedad("DepartamentoA4B");
        builder.cobrarAgua(20);
        builder.cobrarLuz(40);
        builder.cobrarAlicuota(65);
    }
    
}
