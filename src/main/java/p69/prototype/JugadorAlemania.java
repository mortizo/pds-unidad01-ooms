package p69.prototype;

/** Prototipo concreto configurado para la selección de Alemania. */
public final class JugadorAlemania extends Jugador {

    public JugadorAlemania() {
        super("alemana", "blanca");
    }

    private JugadorAlemania(JugadorAlemania prototipo) {
        super(prototipo);
    }

    @Override
    public Jugador clonar() {
        return new JugadorAlemania(this);
    }
}
