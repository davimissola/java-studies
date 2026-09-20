import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Seven");
        myMovie.setAnoLancamento(2004);
        myMovie.setIncluidoNoPlano(true);
        myMovie.setDuracaoEmMinutos(150);
        myMovie.showMovie();

        Movie myMovie2 = new Movie();
        myMovie2.setDuracaoEmMinutos(190);

        Movie myMovie3 = new Movie();
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
    }
}
