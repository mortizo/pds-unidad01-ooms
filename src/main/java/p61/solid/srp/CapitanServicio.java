/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package p61.solid.srp;

import java.util.List;

/**
 *
 * @author Mauricio Ortiz
 */
public interface CapitanServicio {
    
    public Capitan crear(Capitan capitan);
    public Capitan buscarPorCodigo(int codigoCapitan);
    public List<Capitan> listar();   
    
}
