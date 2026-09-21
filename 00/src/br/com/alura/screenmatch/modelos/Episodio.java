package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private int temporada;
    private Serie serie;
    private int totalVisualizacao;

    public int getTotalVisualizacao() {
        return totalVisualizacao;
    }

    public void setTotalVisualizacao(int totalVisualizacao) {
        this.totalVisualizacao = totalVisualizacao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacao > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
