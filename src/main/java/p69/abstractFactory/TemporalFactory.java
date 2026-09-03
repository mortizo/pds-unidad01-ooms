package p69.abstractFactory;

/** Fábrica concreta de la familia de contratación temporal. */
public final class TemporalFactory extends ContratoAbstractFactory {

    @Override
    public Medico crearMedico() {
        return new MedicoTemporal();
    }

    @Override
    public Colaborador crearColaborador() {
        return new ColaboradorTemporal();
    }
}
