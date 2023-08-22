import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produtos> produtosSet;

    public CadastroProdutos(Set<Produtos> produtosSet) {
        this.produtosSet = produtosSet;
    }

    public void adicionarProduto(int codigo, String nome, double preco, int quantidade) {
        produtosSet.add(new Produtos(nome, codigo, quantidade, preco));
    }
    public Set<Produtos> exibirProdutosPorNome(){
        Set<Produtos> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;
    }

    public  Set<Produtos> exibirProdutosPorPreco() {
        Set<Produtos> produtosPorPreco = new TreeSet<>(new Produtos.ComparatorPorPreco());
        produtosSet.addAll(produtosSet);
        return produtosPorPreco;
    }


}
