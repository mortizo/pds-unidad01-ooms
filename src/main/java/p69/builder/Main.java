package p69.builder;

import java.util.List;

/** Ejecuta una demostración académica del patrón Builder. */
public class Main {

    public static void main(String[] args) {
        RentaDirector director = new RentaDirector();

        List<Renta> rentas = List.of(
                director.construir(new RentaCasaBuilder()),
                director.construir(new RentaDepartamentoBuilder()),
                director.construir(new RentaTerrenoBuilder())
        );

        rentas.forEach(System.out::println);
    }
}
