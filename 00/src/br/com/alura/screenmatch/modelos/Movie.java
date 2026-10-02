package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Movie extends Titulo implements Classificavel {
    private String diretor;

    public Movie(String name) {
        this.setName(name);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) avarageRating() / 2;
    }

    @Override
    public String toString() {
        return "Movie : " + getName() + " (" + getAnoLancamento() + ") ";
    }
}
