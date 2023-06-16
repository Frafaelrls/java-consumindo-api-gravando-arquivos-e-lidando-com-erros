package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

// palavra-chave extends será usada para indicar herança, todo Filme é um Titulo
// palavra-chave implements será usada para adicionar uma interface (similar a classe Abstrata do Python)
public class Filme extends Titulo implements Classificavel {
    private String diretor;

    // Um método construtor da classe é declarado com o nome da classe e não possui retorno
    // Em uma classe podemos ter dois métodos construtores;
    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    // toString semelhante ao método __str__ do python
    @Override
    public String toString() {

        return "Filme: %s (%d)".formatted(this.getNome(), this.getAnoDeLancamento());
    }



}

