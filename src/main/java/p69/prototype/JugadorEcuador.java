package p69.prototype;

/** Prototipo concreto configurado para la selección de Ecuador. */
public final class JugadorEcuador extends Jugador {

    public JugadorEcuador() {
        super("ecuatoriana", "amarilla");
    }

    private JugadorEcuador(JugadorEcuador prototipo) {
        super(prototipo);
    }

    @Override
    public Jugador clonar() {
        return new JugadorEcuador(this);
    }
}
