package p69.factoryMethod;

/**
 * Producto concreto que representa un contrato pagado mediante factura.
 */
public final class ContratoFactura extends Contrato {
    private final double valorFactura;
    private final double porcentajeRetencion;

    public ContratoFactura(double valorFactura, double porcentajeRetencion) {
        validarNoNegativo("valorFactura", valorFactura);
        validarNoNegativo("porcentajeRetencion", porcentajeRetencion);
        if (porcentajeRetencion > 100) {
            throw new IllegalArgumentException("porcentajeRetencion no puede superar 100");
        }
        this.valorFactura = valorFactura;
        this.porcentajeRetencion = porcentajeRetencion;
    }

    @Override
    public double calcularSueldo() {
        return valorFactura * (1 - porcentajeRetencion / 100);
    }
}
