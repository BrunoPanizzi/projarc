import java.util.List;

public class VisualizadorDeSomatorio implements Observador {
    private FonteDeDados fonte;
    private boolean ligado;

    public VisualizadorDeSomatorio(FonteDeDados fonte) {
        this.fonte = fonte;
        this.ligado = false; // Começa desligado
    }

    public void ligar() {
        if (!ligado) {
            this.fonte.adicionarObservador(this);
            ligado = true;
            System.out.println("Visualizador de Somatório ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            this.fonte.removerObservador(this);
            ligado = false;
            System.out.println("Visualizador de Somatório desligado.");
        }
    }

    @Override
    public void atualizar() {
        exibeSomatorio();
    }

    public void exibeSomatorio() {
        List<Integer> valores = fonte.getValores();
        Integer soma = valores.stream()
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println("Somatório: " + soma + ", quantidade de elementos analisados: " + valores.size());
    }
}
