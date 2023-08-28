import java.time.LocalDate;

class Emprestimo {
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private String pessoa;

    public Emprestimo(LocalDate dataEmprestimo, LocalDate dataDevolucao, String pessoa) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.pessoa = pessoa;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public String getPessoa() {
        return pessoa;
    }
}