package p69.factoryMethod;

/**
 * Creador concreto de contratos fijos.
 */
public final class CreadorContratoFijo extends CreadorContrato {
    private final double salarioMensual;
    private final double bonificacion;

    public CreadorContratoFijo(double salarioMensual, double bonificacion) {
        this.salarioMensual = salarioMensual;
        this.bonificacion = bonificacion;
    }

    @Override
    public Contrato crearContrato() {
        return new ContratoFijo(salarioMensual, bonificacion);
    }
}
