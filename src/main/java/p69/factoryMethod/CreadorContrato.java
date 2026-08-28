package p69.factoryMethod;

/**
 * Creador abstracto que declara el Factory Method.
 *
 * Las subclases deciden qué producto concreto se debe instanciar.
 */
public abstract class CreadorContrato {

    public abstract Contrato crearContrato();
}
