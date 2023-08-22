import java.util.Comparator;
import java.util.Objects;

public class Produtos implements Comparable<Produtos>{
    private String nome;
    private int codigo, quantidade;
    private double preco;

    public Produtos(String nome, int codigo, int quantidade, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produtos produtos)) return false;
        return getCodigo() == produtos.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "nome = '" + nome + '\'' +
                ", código = " + codigo +
                ", quantidade = " + quantidade +
                ", preço = " + preco +
                '}';
    }

    @Override
    public int compareTo(Produtos p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    static class ComparatorPorPreco implements Comparator<Produtos> {

        @Override
        public int compare(Produtos p1, Produtos p2) {
            return Double.compare(p1.getPreco(), p2.getPreco());
        }
    }
}
