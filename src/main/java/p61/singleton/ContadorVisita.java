/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.singleton;

/**
 *
 * @author Mauricio Ortiz
 */
public class ContadorVisita {
    
    private static ContadorVisita instance;
    private int valor;
    
    public static ContadorVisita getInstance() {
        if(instance == null){
            instance = new ContadorVisita();
        }
        return instance;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    

    

}
