import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Seven");
        myMovie.setAnoLancamento(2004);
        myMovie.setIncluidoNoPlano(true);
        myMovie.setDuracaoEmMinutos(150);
        myMovie.rateMovie(9.5);
        myMovie.rateMovie(9.3);
        myMovie.rateMovie(8.9);
        myMovie.showMovie();

        Movie myMovie2 = new Movie("Rede social");
        myMovie2.setAnoLancamento(2010);
        myMovie2.setDuracaoEmMinutos(190);

        Movie myMovie3 = new Movie("Sociedade dos poetas mortos");
        myMovie3.setAnoLancamento(1978);
        myMovie3.setDuracaoEmMinutos(130);


        Serie mentalista = new Serie();
        mentalista.setName("O mentalista");
        mentalista.setTemporadas(7);
        mentalista.setEpisodios(20);
        mentalista.setMinutosPorEpisodio(50);
        System.out.println(mentalista.getDuracaoEmMinutos() + " minutos");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluir(myMovie);
        calculadora.incluir(myMovie2);
        calculadora.incluir(myMovie3);
        calculadora.incluir(mentalista);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        System.out.println(myMovie.avarageRating() / 2);
        filtro.filtra(myMovie);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setTemporada(1);
        episodio.setSerie(mentalista);
        episodio.setTotalVisualizacao(1500);
        filtro.filtra(episodio);


        ArrayList<Movie> arrayMovie = new ArrayList<>();
        arrayMovie.add(myMovie);
        arrayMovie.add(myMovie2);
        arrayMovie.add(myMovie3);
        System.out.println("Tamanho da lista : " + arrayMovie.size());
        System.out.println(arrayMovie);

        Movie myMovie4 = new Movie("Poderoso chefão");
    }
}
