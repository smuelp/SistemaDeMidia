import java.util.List;
import java.util.ArrayList;

class Usuario {
    private String nome;
    private List<Midia> midias;

    public Usuario(String nome) {
        this.nome = nome;
        midias = new ArrayList<>();
    }

    public void adicionarMidia(Midia midia) {
        midias.add(midia);
    }

    public List<Midia> getMidias() {
        return midias;
    }

    public String toString() {
        System.out.print("\n-------------------- USUARIO --------------------\n");
        return "Nome: " + nome + "\nMidias: " + midias.size();
    }
}