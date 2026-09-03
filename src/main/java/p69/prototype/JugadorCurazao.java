package p69.prototype;

/** Prototipo concreto configurado para la selección de Curazao. */
public final class JugadorCurazao extends Jugador {

    public JugadorCurazao() {
        super("curazoleña", "azul");
    }

    private JugadorCurazao(JugadorCurazao prototipo) {
        super(prototipo);
    }

    @Override
    public Jugador clonar() {
        return new JugadorCurazao(this);
    }
}
