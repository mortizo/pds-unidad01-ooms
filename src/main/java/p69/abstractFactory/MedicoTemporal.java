package p69.abstractFactory;

/** Médico perteneciente a la familia de contratación temporal. */
public final class MedicoTemporal extends Medico {

    private static final int HORAS_CONTRATADAS = 80;
    private static final double VALOR_HORA = 25.00;

    @Override
    public double calcularSueldo() {
        return HORAS_CONTRATADAS * VALOR_HORA;
    }
}
