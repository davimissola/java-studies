import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("Seven");
        myMovie.setAnoLancamento(2004);
        myMovie.setIncluidoNoPlano(true);
        myMovie.showMovie();


        Serie mentalista = new Serie();
        mentalista.setName("O mentalista");
        mentalista.setTemporadas(7);
        mentalista.setEpisodios(20);
        mentalista.setMinutosPorEpisodio(50);
        System.out.println(mentalista.getDuracaoEmMinutos() + " minutos");
    }
}
