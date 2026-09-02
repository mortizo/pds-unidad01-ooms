package p69.builder;

/** Construye una renta de casa con valores académicos predefinidos. */
public class RentaCasaBuilder implements RentaBuilder {

    private final Renta renta = new Renta("Casa");

    @Override
    public void construirCanon() {
        renta.setCanon(650.00);
    }

    @Override
    public void construirAlicuota() {
        // La casa de este ejemplo no paga alícuota.
    }

    @Override
    public void construirServicios() {
        renta.setAgua(25.00);
        renta.setElectricidad(35.00);
        renta.setInternet(30.00);
        renta.setParqueadero(40.00);
        renta.setOtrosCargos(15.00);
    }

    @Override
    public Renta obtenerRenta() {
        return renta;
    }
}
