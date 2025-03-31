import java.util.Random;

public class DadoSimples implements Dado {
    private int lados;
    private int valorJogada;
    private final Random random;

    public DadoSimples(int lados) {
        this.lados = lados;
        this.random = new Random();
    }

    public void rolar() {
        valorJogada = random.nextInt(lados) + 1;
    }

    public int getValor() {
        return valorJogada;
    }
}
