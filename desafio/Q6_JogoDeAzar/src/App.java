public class App {
    public static void main(String[] args) {
        Dado d6 = new DadoMemoria(new DadoSimples(6));
        DadoMemoria d20 = new DadoMemoria(new DadoSimples(20));
        d6.rolar();
        d20.rolar();
        d6.rolar();
        d20.rolar();
        d6.rolar();
        d20.rolar();
        System.out.println("D6: " + d6.getValor());
        System.out.println("D20: " + d20.getHistorico());
    }
}
