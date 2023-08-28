import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

class SistemaMidias {
    private List<Midia> midias;
    private double preco = 29.90;

    public SistemaMidias() {
        midias = new ArrayList<>();
    }

    public void adicionarMidia(Midia midia) {
        midias.add(midia);
    }

    public void relatorioMidiasEmprestadas() {
        System.out.println("-------------------- RELATORIO DAS MIDIAS EMPRESTADAS --------------------");
        for (Midia midia : midias) {
            if (midia.getEmprestimo() != null) {
                if (midia.getRelacao() == Relacao.POSSUI || midia.getRelacao() == Relacao.CONSUMIDO) {
                    System.out.print("> " + midia.getTitulo() + " emprestado para: " + midia.getEmprestimo().getPessoa());
                    LocalDate dataDevolucao = midia.getEmprestimo().getDataDevolucao();
                    System.out.print(" - Data de Devolução: " + dataDevolucao);
                    LocalDate dataAtual = LocalDate.now();
                    if (dataDevolucao.isBefore(dataAtual)) {
                        long diasAtraso = dataAtual.toEpochDay() - dataDevolucao.toEpochDay();
                        System.out.print(" Atraso: " + diasAtraso + " dias");
                    }
                    System.out.println();
                }
            }
        }
    }

    public void wishlist() {
        System.out.print("\n-------------------- WISHLIST --------------------\n");
        for (Midia midia : midias) {
            if (midia.getRelacao() == Relacao.DESEJADO) {
                System.out.println(midia.getTitulo() + " - Preço: " + preco);
            }
        }
    }
}