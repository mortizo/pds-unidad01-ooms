package p62.poo;

import java.util.List;

public class ResidencialGrupo6 extends EdificacionGrupo6{
    private int numeroBaños;
    private List<HabitacionGrupo6> listHabitacionGrupo6;

    @Override
    public String verInfo() {
        return "Numero de baños: " + this.numeroBaños;
    }
    public boolean nuevaHabitacion(int metrosCloset){
        boolean retorno=false;
        HabitacionGrupo6 habitacion= new HabitacionGrupo6();
        habitacion.setMetrosCloset(metrosCloset);
        this.listHabitacionGrupo6.add(habitacion);
        retorno=true;
        return retorno;

    }

    public int getNumeroBaños() {
        return numeroBaños;
    }

    public void setNumeroBaños(int numeroBaños) {
        this.numeroBaños = numeroBaños;
    }
}
