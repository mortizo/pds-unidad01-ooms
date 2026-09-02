package p69.builder;

/**
 * Producto construido paso a paso por las implementaciones de
 * {@link RentaBuilder}.
 */
public class Renta {

    private final String tipoPropiedad;
    private double canon;
    private double alicuota;
    private double agua;
    private double electricidad;
    private double internet;
    private double parqueadero;
    private double otrosCargos;

    Renta(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }

    public String getTipoPropiedad() {
        return tipoPropiedad;
    }

    public double getCanon() {
        return canon;
    }

    void setCanon(double canon) {
        this.canon = validarValor(canon);
    }

    public double getAlicuota() {
        return alicuota;
    }

    void setAlicuota(double alicuota) {
        this.alicuota = validarValor(alicuota);
    }

    public double getAgua() {
        return agua;
    }

    void setAgua(double agua) {
        this.agua = validarValor(agua);
    }

    public double getElectricidad() {
        return electricidad;
    }

    void setElectricidad(double electricidad) {
        this.electricidad = validarValor(electricidad);
    }

    public double getInternet() {
        return internet;
    }

    void setInternet(double internet) {
        this.internet = validarValor(internet);
    }

    public double getParqueadero() {
        return parqueadero;
    }

    void setParqueadero(double parqueadero) {
        this.parqueadero = validarValor(parqueadero);
    }

    public double getOtrosCargos() {
        return otrosCargos;
    }

    void setOtrosCargos(double otrosCargos) {
        this.otrosCargos = validarValor(otrosCargos);
    }

    public double getTotal() {
        return canon + alicuota + agua + electricidad + internet
                + parqueadero + otrosCargos;
    }

    private double validarValor(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Los valores de la renta no pueden ser negativos");
        }
        return valor;
    }

    @Override
    public String toString() {
        return "Renta{" +
                "tipoPropiedad='" + tipoPropiedad + '\'' +
                ", canon=" + canon +
                ", alicuota=" + alicuota +
                ", agua=" + agua +
                ", electricidad=" + electricidad +
                ", internet=" + internet +
                ", parqueadero=" + parqueadero +
                ", otrosCargos=" + otrosCargos +
                ", total=" + getTotal() +
                '}';
    }
}
