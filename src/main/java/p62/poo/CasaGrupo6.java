package p62.poo;

public class CasaGrupo6 extends ResidencialGrupo6{
    private String numerCasa;

    @Override
    public String verInfo() {
        return "Este local comercial pertenece a la edificacion con codigo catastral: "+ super.getClaveCatasral() + "numero de baños" + this.getNumeroBaños() + "numero Casa: "+this.numerCasa ;
    }



}
