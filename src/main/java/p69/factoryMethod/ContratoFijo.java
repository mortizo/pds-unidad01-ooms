package p69.factoryMethod;

/**
 * Producto concreto que representa un contrato con salario mensual y bono.
 */
public final class ContratoFijo extends Contrato {
    private final double salarioMensual;
    private final double bonificacion;

    public ContratoFijo(double salarioMensual, double bonificacion) {
        validarNoNegativo("salarioMensual", salarioMensual);
        validarNoNegativo("bonificacion", bonificacion);
        this.salarioMensual = salarioMensual;
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSueldo() {
        return salarioMensual + bonificacion;
    }
}
