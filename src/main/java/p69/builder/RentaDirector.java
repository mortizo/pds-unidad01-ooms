package p69.builder;

import java.util.Objects;

/** Coordina el proceso común de construcción de una renta. */
public class RentaDirector {

    public Renta construir(RentaBuilder builder) {
        Objects.requireNonNull(builder, "El builder es obligatorio");
        builder.construirCanon();
        builder.construirAlicuota();
        builder.construirServicios();
        return builder.obtenerRenta();
    }
}
