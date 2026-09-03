package p69.prototype;

/** Prototipo concreto configurado para la selección de Costa de Marfil. */
public final class JugadorCostaMarfil extends Jugador {

    public JugadorCostaMarfil() {
        super("marfileña", "naranja");
    }

    private JugadorCostaMarfil(JugadorCostaMarfil prototipo) {
        super(prototipo);
    }

    @Override
    public Jugador clonar() {
        return new JugadorCostaMarfil(this);
    }
}
