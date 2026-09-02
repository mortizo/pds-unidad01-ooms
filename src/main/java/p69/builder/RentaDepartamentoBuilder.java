package p69.builder;

/** Construye una renta de departamento con valores académicos predefinidos. */
public class RentaDepartamentoBuilder implements RentaBuilder {

    private final Renta renta = new Renta("Departamento");

    @Override
    public void construirCanon() {
        renta.setCanon(500.00);
    }

    @Override
    public void construirAlicuota() {
        renta.setAlicuota(80.00);
    }

    @Override
    public void construirServicios() {
        renta.setAgua(20.00);
        renta.setElectricidad(30.00);
        renta.setInternet(25.00);
        renta.setOtrosCargos(10.00);
    }

    @Override
    public Renta obtenerRenta() {
        return renta;
    }
}
