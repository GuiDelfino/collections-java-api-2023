import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livros> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livros(titulo, autor, anoPublicacao));
    }

    public List<Livros> pesquisarPorAutor(String autor) {
        List<Livros> livrosPorAutor = new ArrayList<>();
        if (livrosList.isEmpty()){
            for (Livros l : livrosList) {
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livros> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livros> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livrosList.isEmpty()){
            for (Livros l : livrosList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livros pesquisarPorTitulo(String titulo){
        Livros livroPorTitulo = null;
        if (!livrosList.isEmpty()){
            for (Livros l : livrosList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
}
