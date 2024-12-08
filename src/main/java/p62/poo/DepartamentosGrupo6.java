package p62.poo;

public class DepartamentosGrupo6 extends ResidencialGrupo6 {
    private String numerDepartamento;

    @Override
    public String verInfo() {
        return "Este local comercial pertenece a la edificacion con codigo catastral: "+ super.getClaveCatasral() + "numero de baños" + this.getNumeroBaños() + "numero Casa: "+this.numerDepartamento ;
    }

}
