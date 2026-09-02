package p69.builder;

/**
 * Define los pasos comunes para construir diferentes representaciones de una
 * renta.
 */
public interface RentaBuilder {

    void construirCanon();

    void construirAlicuota();

    void construirServicios();

    Renta obtenerRenta();
}
