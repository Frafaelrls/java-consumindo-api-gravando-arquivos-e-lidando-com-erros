package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

/*
    public void inclui(Filme f) {
        this.tempoTotal += f.getDuracaoEmMinutos();
    }

    //Quando usamos métodos com o mesmo nome temos uma Sobrecarga de métodos
    public void inclui(Serie s) {
        this.tempoTotal += s.getDuracaoEmMinutos();
    }

*/
    public void inclui(Titulo titulo){
        System.out.printf("Adicionando duração em minutos de %s%n", titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
