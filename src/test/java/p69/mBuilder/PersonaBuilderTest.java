package p69.mBuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PersonaBuilderTest {

    @Test
    void construyePersonaMedianteMetodosEncadenados() {
        PersonaBuilder builder = new PersonaBuilder();

        assertSame(builder, builder.conId(10));
        assertSame(builder, builder.conNombre("María"));
        assertSame(builder, builder.conApellido("López"));
        assertSame(builder, builder.conEdad(30));

        Persona persona = builder.construir();

        assertEquals(10, persona.getId());
        assertEquals("María", persona.getNombre());
        assertEquals("López", persona.getApellido());
        assertEquals(30, persona.getEdad());
    }

    @Test
    void permiteOmitirLosAtributosOpcionales() {
        Persona persona = new PersonaBuilder()
                .conId(11)
                .conNombre("José")
                .construir();

        assertEquals("", persona.getApellido());
        assertEquals(0, persona.getEdad());
    }

    @Test
    void exigeIdYNombreAntesDeConstruir() {
        assertThrows(IllegalStateException.class,
                () -> new PersonaBuilder().conNombre("Ana").construir());
        assertThrows(IllegalStateException.class,
                () -> new PersonaBuilder().conId(1).construir());
    }

    @Test
    void rechazaUnaEdadNegativa() {
        assertThrows(IllegalStateException.class,
                () -> new PersonaBuilder()
                        .conId(1)
                        .conNombre("Ana")
                        .conEdad(-1)
                        .construir());
    }
}
