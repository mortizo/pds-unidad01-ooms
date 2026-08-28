package p69.factoryMethod;

/**
 * Creador concreto de contratos temporales.
 */
public final class CreadorContratoTemporal extends CreadorContrato {
    private final double horasTrabajadas;
    private final double valorHora;

    public CreadorContratoTemporal(double horasTrabajadas, double valorHora) {
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public Contrato crearContrato() {
        return new ContratoTemporal(horasTrabajadas, valorHora);
    }
}
