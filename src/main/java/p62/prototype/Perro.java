/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p62.prototype;

/**
 *
 * @author morti
 */
public class Perro extends Animal{

    private String duenio;

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }
    
    
    @Override
    public Animal clonar() {
        Perro retorno= new Perro();
        retorno.setEspecie("Mamifero");
        retorno.setDieta("Croquetas");
        return retorno;
    }

    @Override
    public String toString() {
        return super.toString() + "duenio=" + duenio + '}';
    }
    
    
    
}
