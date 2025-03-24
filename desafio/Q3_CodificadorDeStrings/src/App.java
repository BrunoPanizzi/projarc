public class App {
    public static void main(String[] args) throws Exception {
        String aux = "Desafio Padrões de Projeto";

        ICodificador codificador = new CodificadorSimples();

        System.out.println(aux);
        aux = AplicaCodificador.codifica(codificador, aux);
        System.out.println(aux);
        aux = AplicaCodificador.deCodifica(codificador, aux);

        codificador = new CodificadorDesloca();

        System.out.println(aux);
        aux = AplicaCodificador.codifica(codificador, aux);
        System.out.println(aux);
        aux = AplicaCodificador.deCodifica(codificador, aux);
        System.out.println(aux);
    }
}
