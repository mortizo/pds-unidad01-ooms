package p69.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContadorVisitaTest {

    @BeforeEach
    void reiniciarContador() {
        ContadorVisita.getInstance().reiniciar();
    }

    @Test
    void getInstanceSiempreDevuelveLaMismaInstancia() {
        ContadorVisita primera = ContadorVisita.getInstance();
        ContadorVisita segunda = ContadorVisita.getInstance();

        assertSame(primera, segunda);
    }

    @Test
    void constructorEsPrivado() {
        Constructor<?>[] constructores = ContadorVisita.class.getDeclaredConstructors();

        assertEquals(1, constructores.length);
        assertTrue(Modifier.isPrivate(constructores[0].getModifiers()));
    }

    @Test
    void canalesDiferentesCompartenElContador() {
        AppMovil appMovil = new AppMovil();
        PortalWeb portalWeb = new PortalWeb();

        appMovil.realizarVisita();
        portalWeb.realizarVisita();
        appMovil.realizarVisita();

        assertEquals(3, ContadorVisita.getInstance().getValor());
    }

    @Test
    void permiteRegistrarVariasVisitasEnUnaOperacion() {
        int total = ContadorVisita.getInstance().registrarVisitas(5);

        assertEquals(5, total);
        assertEquals(5, ContadorVisita.getInstance().getValor());
    }

    @Test
    void rechazaCantidadesNoPositivas() {
        assertThrows(IllegalArgumentException.class,
                () -> ContadorVisita.getInstance().registrarVisitas(0));
        assertThrows(IllegalArgumentException.class,
                () -> ContadorVisita.getInstance().registrarVisitas(-1));
    }
}
