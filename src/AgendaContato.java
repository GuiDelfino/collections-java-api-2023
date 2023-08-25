import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContato() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void addContato (String nome, Integer numero){
        agendaContatoMap.put(nome, numero);
    }

    public void removerContato (String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return  numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContato agendaCont = new AgendaContato();


        agendaCont.addContato("Sarah", 996650411);
        agendaCont.addContato("Paulo", 996540511);
        agendaCont.addContato("Vovó", 35520591);
        agendaCont.exibirContatos();
        agendaCont.removerContato("Paulo");
        agendaCont.exibirContatos();
        System.out.println("O número de Sarah é: " + agendaCont.pesquisarPorNome("Sarah"));
    }


}
