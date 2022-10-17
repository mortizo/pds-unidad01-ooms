/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.builder02;

/**
 *
 * @author Mauricio Ortiz Ochoa
 */
public class PersonaBuilder {
    
    private Persona persona;

    public PersonaBuilder( ) {
        this.persona= new Persona();
    }
    
    public PersonaBuilder conId(int id){
        this.persona.setId(id);
        return this;
    }
    
    public PersonaBuilder conNombre(String nombre){
        this.persona.setNombre(nombre);
        return this;
    }
    
    public PersonaBuilder conApellido(String apellido){
        this.persona.setApellido(apellido);
        return this;
    }
    
    public PersonaBuilder conEdad(int edad){
        this.persona.setEdad(edad);
        return this;
    }
    
    
    public Persona construir(){
        return this.persona;
    }
    
    
    
    
}
