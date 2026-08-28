package p62.poo;

import java.util.List;

public class ParquederoGrupo6 extends ComercialGrupo6{
    private List<AutoGrupo6> listaAutosGrupo6;

    @Override
    public String verInfo() {
        return "Este local comercial pertenece a la edificacion con codigo catastral: "+ this.nombreLocal +" direccion: "+this.direccion ;
    }

    private List<AutoGrupo6> crearAuto (AutoGrupo6 autoGrupo6){
        listaAutosGrupo6.add(autoGrupo6);
        return listaAutosGrupo6;
    }

}
