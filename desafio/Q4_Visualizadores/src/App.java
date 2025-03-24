import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var dados = new FonteDeDados();
        var cm = new VisualizadorDeMedia(dados);
        var cs = new VisualizadorDeSomatorio(dados);
        var mv = new VisualizadorDeMaiorValor(dados);

        Scanner s = new Scanner(System.in);
        int opcao = -1;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Ligar Visualizador de Média");
            System.out.println("2 - Desligar Visualizador de Média");
            System.out.println("3 - Ligar Visualizador de Somatório");
            System.out.println("4 - Desligar Visualizador de Somatório");
            System.out.println("5 - Ligar Visualizador de Maior Valor");
            System.out.println("6 - Desligar Visualizador de Maior Valor");
            System.out.println("7 - Adicionar valor à Fonte de Dados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(s.nextLine());

            if (opcao == 0) {
                break;
            }

            switch (opcao) {
                case 1:
                    cm.ligar();
                    break;
                case 2:
                    cm.desligar();
                    break;
                case 3:
                    cs.ligar();
                    break;
                case 4:
                    cs.desligar();
                    break;
                case 5:
                    mv.ligar();
                    break;
                case 6:
                    mv.desligar();
                    break;
                case 7:
                    System.out.print("Entre um valor positivo maior que zero: ");
                    int valor = Integer.parseInt(s.nextLine());
                    if (valor > 0) {
                        dados.add(valor);
                    } else {
                        System.out.println("Valor inválido. Tente novamente.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println("Fim do programa.");
        s.close();
    }
}
