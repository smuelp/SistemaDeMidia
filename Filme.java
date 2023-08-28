import java.util.List;

class Filme extends Midia {
    private int duracao;
    private String diretor;
    private List<String> atores;

    public Filme(String titulo, Relacao relacao, int duracao, FormatoMidia formato, String diretor, List<String> atores, Genero genero) {
        super(titulo, relacao, formato, genero);
        this.duracao = duracao;
        this.diretor = diretor;
        this.atores = atores;
    }

    public String toString() {
        System.out.print("Titulo: ");
        return super.toString() + "\nDuracao:  " + duracao + " minutos\nDiretor: " + diretor + "\nAtores: " + atores;
    }
}