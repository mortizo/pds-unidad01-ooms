package p62.poo;

public class ComercialGrupo6 extends EdificacionGrupo6 {
    private String nombreLocal;
    private String direccion;

    @Override
    public String verInfo() {
        return "Este local comercial pertenece a la edificacion con codigo catastral: "+ this.nombreLocal +" direccion: "+this.direccion ;
    }

    public String getNombreLocal() {
        return nombreLocal;
    }

    public void setNombreLocal(String nombreLocal) {
        this.nombreLocal = nombreLocal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
