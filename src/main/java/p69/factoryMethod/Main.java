package p69.factoryMethod;

import java.util.Scanner;

/**
 * Demostración interactiva del patrón Factory Method.
 */
public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true;

            while (continuar) {
                mostrarMenu();
                String opcion = scanner.nextLine().trim();

                switch (opcion) {
                    case "1":
                        procesarContratoFijo(scanner);
                        break;
                    case "2":
                        procesarContratoFactura(scanner);
                        break;
                    case "3":
                        procesarContratoTemporal(scanner);
                        break;
                    case "0":
                        continuar = false;
                        System.out.println("Programa finalizado.");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }

                System.out.println();
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("=== FACTORY METHOD: CONTRATOS ===");
        System.out.println("1. Crear contrato fijo");
        System.out.println("2. Crear contrato por factura");
        System.out.println("3. Crear contrato temporal");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void procesarContratoFijo(Scanner scanner) {
        double salario = leerNoNegativo(scanner, "Salario mensual: ");
        double bonificacion = leerNoNegativo(scanner, "Bonificación: ");

        CreadorContrato creador = new CreadorContratoFijo(salario, bonificacion);
        mostrarResultado(creador);
    }

    private static void procesarContratoFactura(Scanner scanner) {
        double valorFactura = leerNoNegativo(scanner, "Valor de la factura: ");
        double retencion = leerPorcentaje(scanner, "Porcentaje de retención: ");

        CreadorContrato creador = new CreadorContratoFactura(valorFactura, retencion);
        mostrarResultado(creador);
    }

    private static void procesarContratoTemporal(Scanner scanner) {
        double horas = leerNoNegativo(scanner, "Horas trabajadas: ");
        double valorHora = leerNoNegativo(scanner, "Valor por hora: ");

        CreadorContrato creador = new CreadorContratoTemporal(horas, valorHora);
        mostrarResultado(creador);
    }

    private static void mostrarResultado(CreadorContrato creador) {
        Contrato contrato = creador.crearContrato();
        System.out.printf("Producto creado: %s%n", contrato.getClass().getSimpleName());
        System.out.printf("Sueldo calculado: $%.2f%n", contrato.calcularSueldo());
    }

    private static double leerNoNegativo(Scanner scanner, String mensaje) {
        while (true) {
            double valor = leerDouble(scanner, mensaje);
            if (valor >= 0) {
                return valor;
            }
            System.out.println("El valor no puede ser negativo.");
        }
    }

    private static double leerPorcentaje(Scanner scanner, String mensaje) {
        while (true) {
            double porcentaje = leerDouble(scanner, mensaje);
            if (porcentaje >= 0 && porcentaje <= 100) {
                return porcentaje;
            }
            System.out.println("El porcentaje debe estar entre 0 y 100.");
        }
    }

    private static double leerDouble(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine().trim().replace(',', '.');

            try {
                return Double.parseDouble(entrada);
            } catch (NumberFormatException exception) {
                System.out.println("Ingrese un número válido.");
            }
        }
    }
}
