import java.util.List;
import java.util.ArrayList;

class Temporada {
    private int numeroTemporada;
    private List<Episodio> episodios;

    public Temporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
        episodios = new ArrayList<>();
    }

    public void adicionarEpisodio(Episodio episodio) {
        episodios.add(episodio);
    }

    public String toString() {
        return "Temporada " + numeroTemporada + " - Episodios: " + episodios.size();
    }
}