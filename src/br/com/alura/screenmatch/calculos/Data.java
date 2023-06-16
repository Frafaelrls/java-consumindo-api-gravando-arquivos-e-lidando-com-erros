package br.com.alura.screenmatch.calculos;

import java.time.LocalDate;
import java.time.Period;

public class Data {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDate copa = LocalDate.of(2023, 7, 6);

        Period comparador = Period.between(hoje, copa);

        System.out.println("Contagem para o início da Copa do Mundo:");
        System.out.println(comparador.getYears() + "/" + comparador.getMonths() + "/" + comparador.getDays());
    }
}
