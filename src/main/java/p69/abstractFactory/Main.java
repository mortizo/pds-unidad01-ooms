package p69.abstractFactory;

/** Ejecuta una demostración académica del patrón Abstract Factory. */
public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente(new FijoFactory());
        mostrarFamilia("Contratación fija", cliente);

        cliente.cambiarFactory(new TemporalFactory());
        mostrarFamilia("Contratación temporal", cliente);
    }

    private static void mostrarFamilia(String modalidad, Cliente cliente) {
        Medico medico = cliente.contratarMedico();
        Colaborador colaborador = cliente.contratarColaborador();

        System.out.println("=== " + modalidad + " ===");
        System.out.printf("Médico: %s - sueldo: $%.2f%n",
                medico.getClass().getSimpleName(), medico.calcularSueldo());
        System.out.printf("Colaborador: %s - sueldo: $%.2f%n",
                colaborador.getClass().getSimpleName(), colaborador.calcularSueldo());
    }
}
