package p69.abstractFactory;

/** Fábrica concreta de la familia de contratación fija. */
public final class FijoFactory extends ContratoAbstractFactory {

    @Override
    public Medico crearMedico() {
        return new MedicoFijo();
    }

    @Override
    public Colaborador crearColaborador() {
        return new ColaboradorFijo();
    }
}
