package p69.abstractFactory;

/** Médico perteneciente a la familia de contratación fija. */
public final class MedicoFijo extends Medico {

    private static final double SUELDO_BASE = 2_500.00;
    private static final double BONIFICACION = 500.00;

    @Override
    public double calcularSueldo() {
        return SUELDO_BASE + BONIFICACION;
    }
}
