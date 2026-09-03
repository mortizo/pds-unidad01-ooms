package p69.abstractFactory;

/** Colaborador perteneciente a la familia de contratación fija. */
public final class ColaboradorFijo extends Colaborador {

    private static final double SUELDO_BASE = 1_200.00;
    private static final double BONIFICACION = 150.00;

    @Override
    public double calcularSueldo() {
        return SUELDO_BASE + BONIFICACION;
    }
}
