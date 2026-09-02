package p69.builder;

/** Construye una renta de terreno con valores académicos predefinidos. */
public class RentaTerrenoBuilder implements RentaBuilder {

    private final Renta renta = new Renta("Terreno");

    @Override
    public void construirCanon() {
        renta.setCanon(300.00);
    }

    @Override
    public void construirAlicuota() {
        // El terreno de este ejemplo no paga alícuota.
    }

    @Override
    public void construirServicios() {
        // No requiere servicios básicos; solo se aplica un cargo administrativo.
        renta.setOtrosCargos(20.00);
    }

    @Override
    public Renta obtenerRenta() {
        return renta;
    }
}
