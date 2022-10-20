/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.singleton;

/**
 *
 * @author UPS
 */
public class AppMovil {

    public int realizarVisita(int numeroVisitas) {
        var contador1 = ContadorVisita.getInstance();
        contador1.getInstance().setValor(ContadorVisita.getInstance().getValor() + numeroVisitas);
        return contador1.getValor();
    }
}
