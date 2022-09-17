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

    public abstract void setNombrePropiedad(String nombrePropiedad);
    public abstract void cobrarAgua(double agua); 
    public abstract void cobrarLuz(double luz); 
    public abstract void cobrarInternet(double internet); 
    public abstract void cobrarAlicuota(double alicuota); 

    
}
