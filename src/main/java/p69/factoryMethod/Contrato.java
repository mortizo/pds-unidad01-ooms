package p69.factoryMethod;

/**
 * Producto abstracto del patrón Factory Method.
 *
 * Cada contrato concreto define su propia regla para calcular el sueldo.
 */
public abstract class Contrato {

    public abstract double calcularSueldo();

    protected static void validarNoNegativo(String campo, double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException(campo + " no puede ser negativo");
        }
    }
}
