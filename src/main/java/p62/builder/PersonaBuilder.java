/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p62.builder;

/**
 *
 * @author morti
 */
public class PersonaBuilder {
    
    private Persona persona;
    

    public PersonaBuilder(){
        persona= new Persona();
    }
    
    public PersonaBuilder addCedula(String cedula){
        this.persona.setCedula(cedula);
        return this;
    }
    
    public PersonaBuilder addApellido(String apellido){
        this.persona.setApellido(apellido);
        return this;
    }
    
    
    
    public Persona build()
    {
        return this.persona;
    }
    
}
