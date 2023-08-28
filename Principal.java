import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        
        // atores para filmes
        List<String> atoresFilme = new ArrayList<>();
        atoresFilme.add("Dwayne Johnson");
        atoresFilme.add("Gal Gadot");
        atoresFilme.add("Ryan Reynolds");
        
        // atores para series
        List<String> atoresSerie = new ArrayList<>();
        atoresSerie.add("Henry Cavill");
        atoresSerie.add("Freya Allan");
        atoresSerie.add("Anya Chalotra");
        
        SistemaMidias sistema = new SistemaMidias();

        // filme
        Filme filme = new Filme("Alerta Vermelho", Relacao.CONSUMIDO, 120, FormatoMidia.DVD, "Rawson Marshall Thurber", atoresFilme, Genero.Acao);

        // livro
        Livro livro = new Livro("Crime e Castigo", Relacao.POSSUI, 592, Genero.FiccaoLiteraria, "Fiódor Dostoiésvski");

        // série
        Serie serie = new Serie("The Witcher", Relacao.DESEJADO, 1440, FormatoMidia.Digital, atoresSerie, Genero.Ficcao);
        serie.adicionarTemporada(new Temporada(1));
        serie.adicionarTemporada(new Temporada(2));
        serie.adicionarTemporada(new Temporada(3));
        
        sistema.adicionarMidia(livro);
        sistema.adicionarMidia(filme);
        sistema.adicionarMidia(serie);

        // usuario
        Usuario usuario = new Usuario("Samuel Pena");
        usuario.adicionarMidia(filme);
        usuario.adicionarMidia(livro);
        usuario.adicionarMidia(serie);
        
        // Empréstimo
        filme.emprestar("Fulano", LocalDate.now().plusDays(15));
        livro.emprestar("Ciclano", LocalDate.now().plusDays(7));
        serie.emprestar("Beltrano", LocalDate.now().plusDays(10));
        
        System.out.println(usuario);
        System.out.println();
        sistema.relatorioMidiasEmprestadas();
        sistema.wishlist();

        // Devolução
        filme.devolver();
        livro.devolver();
        serie.devolver();

        // impressões
        System.out.println();
        System.out.print("-------------------- FILME --------------------\n");
        System.out.println(filme);
        System.out.print("\n-------------------- SERIE --------------------\n");
        System.out.println(serie);
        System.out.print("\n-------------------- LIVRO --------------------\n");
        System.out.println(livro);
    }
}