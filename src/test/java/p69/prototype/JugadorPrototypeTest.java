package p69.prototype;

import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JugadorPrototypeTest {

    @Test
    void clonarCreaUnaInstanciaIndependienteDelMismoTipo() {
        JugadorEcuador prototipo = new JugadorEcuador();
        prototipo.setNombre("Jugador base");
        prototipo.setNumero(1);
        prototipo.setPosicion("Arquero");

        Jugador copia = prototipo.clonar();

        assertNotSame(prototipo, copia);
        assertInstanceOf(JugadorEcuador.class, copia);
        assertEquals(prototipo.getNombre(), copia.getNombre());
        assertEquals(prototipo.getNumero(), copia.getNumero());
        assertEquals(prototipo.getPosicion(), copia.getPosicion());
    }

    @Test
    void personalizarLaCopiaNoModificaElPrototipo() {
        Jugador prototipo = new JugadorEcuador();
        prototipo.setNombre("Jugador base");
        prototipo.setNumero(1);
        prototipo.setPosicion("Arquero");

        Jugador copia = prototipo.clonar();
        copia.setNombre("Nuevo jugador");
        copia.setNumero(10);
        copia.setPosicion("Delantero");

        assertEquals("Jugador base", prototipo.getNombre());
        assertEquals(1, prototipo.getNumero());
        assertEquals("Arquero", prototipo.getPosicion());
    }

    @Test
    void prototiposConcretosConservanLaConfiguracionDeSuSeleccion() {
        Cliente cliente = new Cliente();

        Jugador ecuador = cliente.crearJugador(
                new JugadorEcuador(), "Ana", 1, "Arquera");
        Jugador alemania = cliente.crearJugador(
                new JugadorAlemania(), "Hans", 2, "Defensa");
        Jugador mexico = cliente.crearJugador(
                new JugadorMexico(), "Santiago", 3, "Delantero");
        Jugador costaMarfil = cliente.crearJugador(
                new JugadorCostaMarfil(), "Sébastien", 4, "Delantero");
        Jugador curazao = cliente.crearJugador(
                new JugadorCurazao(), "Leandro", 5, "Mediocampista");

        assertEquals("ecuatoriana", ecuador.getNacionalidad());
        assertEquals("amarilla", ecuador.getColorCamiseta());
        assertEquals("alemana", alemania.getNacionalidad());
        assertEquals("blanca", alemania.getColorCamiseta());
        assertEquals("mexicana", mexico.getNacionalidad());
        assertEquals("verde", mexico.getColorCamiseta());
        assertEquals("marfileña", costaMarfil.getNacionalidad());
        assertEquals("naranja", costaMarfil.getColorCamiseta());
        assertEquals("curazoleña", curazao.getNacionalidad());
        assertEquals("azul", curazao.getColorCamiseta());
    }

    @Test
    void jugadorDefineLaOperacionAbstractaClonar() throws NoSuchMethodException {
        assertTrue(Modifier.isAbstract(Jugador.class.getModifiers()));
        assertTrue(Modifier.isAbstract(
                Jugador.class.getDeclaredMethod("clonar").getModifiers()));
    }
}
