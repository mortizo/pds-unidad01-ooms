package p69.prototype;

import java.util.Objects;

/** Cliente que crea jugadores copiando un prototipo existente. */
public final class Cliente {

    public Jugador crearJugador(
            Jugador prototipo,
            String nombre,
            int numero,
            String posicion) {
        Jugador jugador = Objects.requireNonNull(
                prototipo, "El prototipo es obligatorio").clonar();
        jugador.setNombre(nombre);
        jugador.setNumero(numero);
        jugador.setPosicion(posicion);
        return jugador;
    }
}
