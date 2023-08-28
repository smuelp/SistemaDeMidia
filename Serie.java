import java.util.List;
import java.util.ArrayList;

class Serie extends Midia {
    private List<Temporada> temporadas;
    private List<String> atores;
    private int duracao;

    public Serie(String titulo, Relacao relacao, int duracao, FormatoMidia formato, List<String> atores, Genero genero) {
        super(titulo, relacao, formato, genero);
        temporadas = new ArrayList<>();
        this.duracao = duracao;
        this.atores = atores;
    }

    public void adicionarTemporada(Temporada temporada) {
        temporadas.add(temporada);
    }

    public String toString() {
        System.out.print("Titulo: ");
        return super.toString() + "\nDuracao: " + duracao + " minutos" + "\nAtores: " + atores + "\nTemporadas: " + temporadas.size();
    }
}