package p69.abstractFactory;

import java.util.Objects;

/**
 * Cliente que trabaja solamente con la fábrica y los productos abstractos.
 */
public final class Cliente {

    private ContratoAbstractFactory factory;

    public Cliente(ContratoAbstractFactory factory) {
        cambiarFactory(factory);
    }

    public void cambiarFactory(ContratoAbstractFactory factory) {
        this.factory = Objects.requireNonNull(factory, "La factory es obligatoria");
    }

    public Medico contratarMedico() {
        return factory.crearMedico();
    }

    public Colaborador contratarColaborador() {
        return factory.crearColaborador();
    }
}
