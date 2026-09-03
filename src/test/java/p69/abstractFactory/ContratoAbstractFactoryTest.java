package p69.abstractFactory;

import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContratoAbstractFactoryTest {

    @Test
    void fijoFactoryCreaUnaFamiliaFijaCompleta() {
        ContratoAbstractFactory factory = new FijoFactory();

        assertInstanceOf(MedicoFijo.class, factory.crearMedico());
        assertInstanceOf(ColaboradorFijo.class, factory.crearColaborador());
        assertEquals(3_000.00, factory.crearMedico().calcularSueldo(), 0.001);
        assertEquals(1_350.00, factory.crearColaborador().calcularSueldo(), 0.001);
    }

    @Test
    void temporalFactoryCreaUnaFamiliaTemporalCompleta() {
        ContratoAbstractFactory factory = new TemporalFactory();

        assertInstanceOf(MedicoTemporal.class, factory.crearMedico());
        assertInstanceOf(ColaboradorTemporal.class, factory.crearColaborador());
        assertEquals(2_000.00, factory.crearMedico().calcularSueldo(), 0.001);
        assertEquals(800.00, factory.crearColaborador().calcularSueldo(), 0.001);
    }

    @Test
    void clientePuedeCambiarLaFamiliaSinCambiarSuLogica() {
        Cliente cliente = new Cliente(new FijoFactory());
        assertInstanceOf(MedicoFijo.class, cliente.contratarMedico());
        assertInstanceOf(ColaboradorFijo.class, cliente.contratarColaborador());

        cliente.cambiarFactory(new TemporalFactory());
        assertInstanceOf(MedicoTemporal.class, cliente.contratarMedico());
        assertInstanceOf(ColaboradorTemporal.class, cliente.contratarColaborador());
    }

    @Test
    void factoryYProductosSonAbstracciones() {
        assertTrue(Modifier.isAbstract(ContratoAbstractFactory.class.getModifiers()));
        assertTrue(Modifier.isAbstract(Medico.class.getModifiers()));
        assertTrue(Modifier.isAbstract(Colaborador.class.getModifiers()));
    }
}
