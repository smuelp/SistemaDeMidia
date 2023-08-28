import java.time.LocalDate;

abstract class Midia {
    protected String titulo;
    protected Relacao relacao;
    protected FormatoMidia formato;
    protected Genero genero;
    
    private Emprestimo emprestimo;
    private double preco;

    public Midia(String titulo, Relacao relacao, FormatoMidia formato, Genero genero) {
        this.titulo = titulo;
        this.relacao = relacao;
        this.formato = formato;
        this.genero = genero;
    }
    
    // Métodos para empréstimo e preço
    public void emprestar(String pessoa, LocalDate dataDevolucao) {
        emprestimo = new Emprestimo(LocalDate.now(), dataDevolucao, pessoa);
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public Relacao getRelacao() {
        return relacao;
    }

    public double getPreco() {
        return preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void devolver() {
        emprestimo = null;
    }

    public String toString() {
        String emprestimoInfo = emprestimo != null ? " - " + emprestimo.toString() : "";
        String precoInfo = preco > 0 ? "\nPreco: " + preco : "";
        return titulo + " (" + relacao + ")" + (formato != null ? "\nFormato: " + formato : "") + "\nGenero: " + genero + emprestimoInfo + precoInfo;
    }
}