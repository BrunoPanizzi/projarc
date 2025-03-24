public class AplicaCodificador {
    public static String codifica(ICodificador codificador,String str){
        return codificador.codifica(str);
    }

    public static String deCodifica(ICodificador codificador,String str){
        return codificador.decodifica(str);
    }
}