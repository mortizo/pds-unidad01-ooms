package p69.factoryMethod;

/**
 * Producto concreto cuyo sueldo depende de las horas trabajadas.
 */
public final class ContratoTemporal extends Contrato {
    private final double horasTrabajadas;
    private final double valorHora;

    public ContratoTemporal(double horasTrabajadas, double valorHora) {
        validarNoNegativo("horasTrabajadas", horasTrabajadas);
        validarNoNegativo("valorHora", valorHora);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * valorHora;
    }
}
