package p69.abstractFactory;

/** Colaborador perteneciente a la familia de contratación temporal. */
public final class ColaboradorTemporal extends Colaborador {

    private static final int HORAS_CONTRATADAS = 80;
    private static final double VALOR_HORA = 10.00;

    @Override
    public double calcularSueldo() {
        return HORAS_CONTRATADAS * VALOR_HORA;
    }
}
