class Livro extends Midia {
    private int paginas;
    private String autor;

    public Livro(String titulo, Relacao relacao, int paginas, Genero genero, String autor) {
        super(titulo, relacao, null, genero);
        this.paginas = paginas;
        this.autor = autor;
    }

    public String toString() {
        System.out.print("Titulo: ");
        return super.toString() + "\nPaginas: " + paginas + "\nAutor: " + autor;
    }
}