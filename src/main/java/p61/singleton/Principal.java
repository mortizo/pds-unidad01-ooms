/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.singleton;

/**
 *
 * @author morti
 */
public class Principal {
    
    public static void main(String[] args) {
        ContadorVisita cv = ContadorVisita.getInstance();
        cv.setValor(15);
        
        AppMovil app= new AppMovil();
        PortalWeb pWeb = new PortalWeb();
        app.realizarVisita(10);
        pWeb.realizarVisita(80);
        
        System.out.println(cv.getValor());
        
        
    }
    
}
