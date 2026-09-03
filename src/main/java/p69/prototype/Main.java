package p69.prototype;

import java.util.List;

/** Ejecuta una demostración académica del patrón Prototype. */
public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Jugador prototipoEcuador = new JugadorEcuador();
        Jugador prototipoAlemania = new JugadorAlemania();
        Jugador prototipoMexico = new JugadorMexico();
        Jugador prototipoCostaMarfil = new JugadorCostaMarfil();
        Jugador prototipoCurazao = new JugadorCurazao();

        List<Jugador> jugadores = List.of(
                cliente.crearJugador(prototipoEcuador, "Enner Valencia", 13, "Delantero"),
                cliente.crearJugador(prototipoEcuador, "Moisés Caicedo", 23, "Mediocampista"),
                cliente.crearJugador(prototipoAlemania, "Jamal Musiala", 10, "Mediocampista"),
                cliente.crearJugador(prototipoMexico, "Santiago Giménez", 11, "Delantero"),
                cliente.crearJugador(prototipoCostaMarfil, "Sébastien Haller", 22, "Delantero"),
                cliente.crearJugador(prototipoCurazao, "Leandro Bacuna", 10, "Mediocampista")
        );

        jugadores.forEach(System.out::println);
    }
}
