package p69.prototype;

/** Prototipo concreto configurado para la selección de México. */
public final class JugadorMexico extends Jugador {

    public JugadorMexico() {
        super("mexicana", "verde");
    }

    private JugadorMexico(JugadorMexico prototipo) {
        super(prototipo);
    }

    @Override
    public Jugador clonar() {
        return new JugadorMexico(this);
    }
}
