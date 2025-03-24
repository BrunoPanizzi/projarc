import java.util.List;

public class VisualizadorDeMaiorValor implements Observador {
    private FonteDeDados fonte;
    private boolean ligado;

    public VisualizadorDeMaiorValor(FonteDeDados fonte) {
        this.fonte = fonte;
        this.ligado = false; 
    }

    public void ligar() {
        if (!ligado) {
            this.fonte.adicionarObservador(this);
            ligado = true;
            System.out.println("Visualizador de Maior Valor ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            this.fonte.removerObservador(this);
            ligado = false;
            System.out.println("Visualizador de Maior Valor desligado.");
        }
    }

    @Override
    public void atualizar() {
        exibeMaiorValor();
    }

    public void exibeMaiorValor() {
        List<Integer> valores = fonte.getValores();
        Integer maior = valores.stream()
            .max(Integer::compareTo)
            .orElse(0);
        System.out.println("Maior valor: " + maior);
    }
}