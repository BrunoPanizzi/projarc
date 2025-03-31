import java.util.ArrayList;
import java.util.List;

public class DadoMemoria implements Dado {
    private Dado dado;
    private List<Integer> historico;

    public DadoMemoria(Dado dado) {
        this.dado = dado;
        this.historico = new ArrayList<>();
    }

    public int getValor() {
        return this.historico.getLast();
    }

    public void rolar() {
        this.dado.rolar();
        var n = this.dado.getValor();
        this.historico.add(n);
    }

    public List<Integer> getHistorico() {
        return this.historico;
    }
}
