package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String name;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somatoriaAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    public void showMovie() {
        System.out.println("Name : " + name);
        System.out.println("Year of release : " + anoLancamento);
    }

    public void rateMovie(double rating) {
        somatoriaAvaliacoes += rating;
        totalAvaliacoes++;
    }

    public double avarageRating() {
        return somatoriaAvaliacoes / totalAvaliacoes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
