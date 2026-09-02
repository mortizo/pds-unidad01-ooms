package p69.builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RentaBuilderTest {

    private final RentaDirector director = new RentaDirector();

    @Test
    void construyeRentaDeCasaConSusCargosOpcionales() {
        Renta renta = director.construir(new RentaCasaBuilder());

        assertEquals("Casa", renta.getTipoPropiedad());
        assertEquals(650.00, renta.getCanon(), 0.001);
        assertEquals(0.00, renta.getAlicuota(), 0.001);
        assertEquals(40.00, renta.getParqueadero(), 0.001);
        assertEquals(795.00, renta.getTotal(), 0.001);
    }

    @Test
    void construyeRentaDeDepartamentoConAlicuota() {
        Renta renta = director.construir(new RentaDepartamentoBuilder());

        assertEquals("Departamento", renta.getTipoPropiedad());
        assertEquals(80.00, renta.getAlicuota(), 0.001);
        assertEquals(0.00, renta.getParqueadero(), 0.001);
        assertEquals(665.00, renta.getTotal(), 0.001);
    }

    @Test
    void construyeRentaDeTerrenoSinServiciosBasicos() {
        Renta renta = director.construir(new RentaTerrenoBuilder());

        assertEquals("Terreno", renta.getTipoPropiedad());
        assertEquals(0.00, renta.getAgua(), 0.001);
        assertEquals(0.00, renta.getElectricidad(), 0.001);
        assertEquals(0.00, renta.getInternet(), 0.001);
        assertEquals(20.00, renta.getOtrosCargos(), 0.001);
        assertEquals(320.00, renta.getTotal(), 0.001);
    }

    @Test
    void directorEjecutaLosPasosEnElOrdenDefinido() {
        List<String> pasos = new ArrayList<>();
        RentaBuilder builder = new RentaBuilder() {
            private final Renta renta = new Renta("Prueba");

            @Override
            public void construirCanon() {
                pasos.add("canon");
            }

            @Override
            public void construirAlicuota() {
                pasos.add("alicuota");
            }

            @Override
            public void construirServicios() {
                pasos.add("servicios");
            }

            @Override
            public Renta obtenerRenta() {
                pasos.add("obtener");
                return renta;
            }
        };

        director.construir(builder);

        assertEquals(
                Arrays.asList("canon", "alicuota", "servicios", "obtener"),
                pasos
        );
    }
}
