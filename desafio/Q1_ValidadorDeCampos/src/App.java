public class App {
    public static void main(String[] args) throws Exception {
        String email = "bernardo.copstein@pucrs.br";
        String inteiro = "123456";
        String matricula = "1234567";
        String nome = "Bernardo";
        var validador = new Validador();

        if (validador.getValidador(Validador.Tipo.INTEIRO, nome)){
            System.out.println("é valido!");
        }else{
            System.out.println("não é válido!");
        }
    }
}
