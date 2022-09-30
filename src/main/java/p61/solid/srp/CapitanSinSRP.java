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
public class CapitanSinSRP {

    private int codigo;
    private String nombre;
    private String pais;
    private List<CapitanSinSRP> capitanList = new ArrayList<>();

    public CapitanSinSRP() {
        this.codigo = 0;
        this.nombre = null;
        this.pais = null;
    }

    public CapitanSinSRP(int codigo, String nombre, String pais) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.pais = pais;
    }

    public CapitanSinSRP crear(CapitanSinSRP capitan) {
        var capitanBuscado = this.buscarPorCodigo(capitan.getCodigo());
        if (capitanBuscado == null) {
            this.capitanList.add(capitan);
        } else {
            throw new RuntimeException("El código ingresado ya se encuentra "
                    + "asignado al Capitán: " + capitanBuscado.getNombre());
        }
        return capitan;
    }

    public List<CapitanSinSRP> listar() {
        return this.capitanList;
    }

    public CapitanSinSRP buscarPorCodigo(int codigoCapitan) {
        CapitanSinSRP capitan = null;
        for (var c : this.capitanList) {
            if (codigoCapitan == c.getCodigo()) {
                capitan = c;
                break;
            }
        }
        return capitan;
    }

    public String getContinente() {
        return this.pais + " pertenece al Continente ...";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Capitan{" + "codigo=" + codigo + ", nombre=" + nombre
                + ", pais=" + pais + '}';
    }

}
