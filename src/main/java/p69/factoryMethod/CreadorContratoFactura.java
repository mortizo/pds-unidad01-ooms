package p69.factoryMethod;

/**
 * Creador concreto de contratos por factura.
 */
public final class CreadorContratoFactura extends CreadorContrato {
    private final double valorFactura;
    private final double porcentajeRetencion;

    public CreadorContratoFactura(double valorFactura, double porcentajeRetencion) {
        this.valorFactura = valorFactura;
        this.porcentajeRetencion = porcentajeRetencion;
    }

    @Override
    public Contrato crearContrato() {
        return new ContratoFactura(valorFactura, porcentajeRetencion);
    }
}
