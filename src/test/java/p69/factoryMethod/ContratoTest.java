package p69.factoryMethod;

import java.lang.reflect.Modifier;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContratoTest {

    @Test
    void creadorContratoFijoCreaElProductoCorrecto() {
        CreadorContrato creador = new CreadorContratoFijo(1_000, 150);

        assertInstanceOf(ContratoFijo.class, creador.crearContrato());
    }

    @Test
    void creadorContratoFacturaCreaElProductoCorrecto() {
        CreadorContrato creador = new CreadorContratoFactura(1_000, 10);

        assertInstanceOf(ContratoFactura.class, creador.crearContrato());
    }

    @Test
    void creadorContratoTemporalCreaElProductoCorrecto() {
        CreadorContrato creador = new CreadorContratoTemporal(40, 15);

        assertInstanceOf(ContratoTemporal.class, creador.crearContrato());
    }

    @Test
    void contratosConcretosSeUsanMedianteLaAbstraccionContrato() {
        List<Contrato> contratos = List.of(
                new CreadorContratoFijo(1_000, 150).crearContrato(),
                new CreadorContratoFactura(1_000, 10).crearContrato(),
                new CreadorContratoTemporal(40, 15).crearContrato()
        );

        assertEquals(1_150, contratos.get(0).calcularSueldo(), 0.001);
        assertEquals(900, contratos.get(1).calcularSueldo(), 0.001);
        assertEquals(600, contratos.get(2).calcularSueldo(), 0.001);
    }

    @Test
    void creadorAbstractoDelegaLaSeleccionEnLosCreadoresConcretos()
            throws NoSuchMethodException {
        assertTrue(Modifier.isAbstract(CreadorContrato.class.getModifiers()));
        assertTrue(Modifier.isAbstract(
                CreadorContrato.class.getDeclaredMethod("crearContrato").getModifiers()));
    }
}
