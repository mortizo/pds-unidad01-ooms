/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p65.creacional.protoype;

/**
 *
 * @author morti
 */
public class Cliente {
    public static void main(String[] args) {
        var casaAdosadaOriginal=new CasaAdosada();
        //casaAdosadaOriginal.setColor("blanco");
        var casaAdosadaClonada1=casaAdosadaOriginal.clonar();
        var casaAdosadaClonada2=casaAdosadaOriginal.clonar();
        var casaAdosadaClonada3=casaAdosadaOriginal.clonar();
        var casaAdosadaClonada4=casaAdosadaOriginal.clonar();
        
        System.out.println(casaAdosadaClonada3.toString());
        
    }
}
