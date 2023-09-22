package p62.poo;

import java.util.List;

public abstract class EdificacionGrupo6 {
    /**
     * Atributos
     */
    private int codigo;
    private String claveCatasral;
    private int metrosTerreno;
    List<PropietarioGrupo6> listPropietarioGrupo6;
    /**
     * Constructor
     */
    public EdificacionGrupo6(){
        this.metrosTerreno=6;
    }

    /**
 * Metodos
 */
public abstract String verInfo();

public int metrosterreno(){
    return this.metrosTerreno;
}
    public boolean agregaPropietario(PropietarioGrupo6 propietario){
        boolean retorno=false;
        this.listPropietarioGrupo6.add(propietario);
        return retorno;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getClaveCatasral() {
        return claveCatasral;
    }

    public void setClaveCatasral(String claveCatasral) {
        this.claveCatasral = claveCatasral;
    }

    public int getMetrosTerreno() {
        return metrosTerreno;
    }

    public void setMetrosTerreno(int metrosTerreno) {
        this.metrosTerreno = metrosTerreno;
    }
}
