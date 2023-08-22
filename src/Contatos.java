import java.util.Objects;

public class Contatos {
    private String nome;
    private int numero;

    public Contatos(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return nome + "," + numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contatos contatos)) return false;
        return Objects.equals(getNome(), contatos.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    public void setNumero(int novoNumero) {
    }
}
