/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p65.poo;

/**
 *
 * @author morti
 */
public class Moto extends Vehiculo  implements IAuditoria{

    
    
    
    @Override
    public int calcularEdad(int yearActual) {
        return (yearActual-this.getYear())+1;
    }

    @Override
    public String user() {
        return "Mauricio Ortiz";
    }

    @Override
    public String fechaRegistro() {
        return "2024/09/13";
    }
    
    
    
}
