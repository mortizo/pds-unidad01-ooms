package p69.abstractFactory;

/**
 * Fábrica abstracta que declara la creación de una familia de personal.
 */
public abstract class ContratoAbstractFactory {

    public abstract Medico crearMedico();

    public abstract Colaborador crearColaborador();
}
