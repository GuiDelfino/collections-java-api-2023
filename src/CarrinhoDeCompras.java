import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {

    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }
    public void adicionarItem(String nome, Double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        itens.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : itens  ) {
            if (i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        itens.removeAll(itensParaRemover);
    }

    public void exibirItens(){
        System.out.println(itens);
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        for (Item i : itens) {
            double valorItem = i.getPreco()*i.getQuantidade();
            valorTotal += valorItem;
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "itens=" + itens +
                '}';
    }

    // TESTES ABAIXO

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Lápis", 2d,4);
        carrinhoDeCompras.adicionarItem("Caderno", 10d, 2);
        carrinhoDeCompras.adicionarItem("Borracha", 0.50d, 3);
        carrinhoDeCompras.exibirItens();
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.removerItem("Borracha");
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}
