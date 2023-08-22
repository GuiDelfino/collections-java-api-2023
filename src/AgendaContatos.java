import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contatos> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contatos(nome, numero));
    }
    public void exibirContatos() {
        if (!contatosSet.isEmpty()) {
            System.out.println(contatosSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public Set<Contatos> pesquisarPorNome(String nome) {
        Set<Contatos> contatosPorNome = new HashSet<>();
        if (!contatosSet.isEmpty()) {
            for (Contatos c : contatosSet) {
                if (c.getNome().startsWith(nome)) {
                    contatosPorNome.add(c);
                }
            }
            return contatosPorNome;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Contatos atualizarNumeroContato(String nome, int novoNumero) {
        Contatos contatoAtualizado = null;
        if (!contatosSet.isEmpty()) {
            for (Contatos c : contatosSet) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
            return contatoAtualizado;
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Guilherme", 123456);
        agendaContatos.adicionarContato("Guilherme", 5665);
        agendaContatos.adicionarContato("Guilherme", 5665);
        agendaContatos.adicionarContato("Guilherme Delfino", 1111111);
        agendaContatos.adicionarContato("Guilherme DIO", 654987);
        agendaContatos.adicionarContato("Maria de Fátima", 1111111);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Guilherme"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria de Fátima", 5555555));

        agendaContatos.exibirContatos();
    }
}
