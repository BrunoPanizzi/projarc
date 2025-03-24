public class Validador{

    public enum Tipo { EMAIL, INTEIRO, MATRICULA, NOME }

    public boolean validaInteiro(String valor){
        for(int i=0;i<valor.length();i++){
            if (!Character.isDigit(valor.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public boolean validaMatricula(String valor){
        if (!validaInteiro(valor)){
            return false;
        }else{
            int sum = 0;
            for(int i=0;i<valor.length()-1;i++){
                sum += Character.getNumericValue(valor.charAt(i));
            }
            int verificador = sum%10;
            if (verificador == Character.getNumericValue(valor.charAt(valor.length()-1))){
                return true;
            }
        }
        return false;
    }

    public boolean validaEmail(String valor){
        int posA = valor.indexOf('@');
        int posPt = valor.indexOf('.');
        if (posA <= 0 || posPt <= 0) return false;
        return true;
    }
    
    public boolean validaNome(String valor){
        if (valor.length() < 3) return false;
        return true;
    }

    public boolean getValidador(Tipo tipo, String valor) {
        switch (tipo) {
            case EMAIL:
                return validaEmail(valor);
            case INTEIRO:
                return validaInteiro(valor);
            case MATRICULA:
                return validaMatricula(valor);
            case NOME:
                return validaNome(valor);
            default:
                throw new IllegalArgumentException("Tipo de validador desconhecido");
        }
    }
}

/*public class Validador{
    public enum Tipo { EMAIL, INTEIRO, MATRICULA }

    public boolean valida(Tipo tipo,String valor){
        switch(tipo){
            case INTEIRO:
                for(int i=0;i<valor.length();i++){
                    if (!Character.isDigit(valor.charAt(i))){
                        return false;
                    }
                }
                return true;
            case MATRICULA:
                if (!valida(Tipo.INTEIRO,valor)){
                    return false;
                }else{
                    int sum = 0;
                    for(int i=0;i<valor.length()-1;i++){
                        sum += Character.getNumericValue(valor.charAt(i));
                    }
                    int verificador = sum%10;
                    if (verificador == Character.getNumericValue(valor.charAt(valor.length()-1))){
                        return true;
                    }
                }
                return false;
            case EMAIL:
                int posA = valor.indexOf('@');
                int posPt = valor.indexOf('.');
                if (posA <= 0 || posPt <= 0) return false;
                return true;
            default:
                return false;
        }
    }
}
 */