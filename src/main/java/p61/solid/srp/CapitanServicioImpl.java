/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.solid.srp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mauricio Ortiz
 */
public class CapitanServicioImpl implements CapitanServicio{

    private List<Capitan> capitanList = new ArrayList<>();

    @Override
    public Capitan crear(Capitan capitan) {
        var capitanBuscado=this.buscarPorCodigo(capitan.getCodigo());
        if(capitanBuscado==null){
            this.capitanList.add(capitan);
        }else{
            throw new RuntimeException("El código ingresado ya se encuentra "
                    + "asignado al Capitán: "+capitanBuscado.getNombre());
        }
        return capitan;
    }
    
    @Override
    public List<Capitan> listar(){
        return this.capitanList;
    }

    @Override
    public Capitan buscarPorCodigo(int codigoCapitan) {
        Capitan capitan=null;
        for(var c:this.capitanList){
            if(codigoCapitan==c.getCodigo()){
                capitan=c;
                break;
            }
        }
        return capitan;
    }

}
