package n1exercici2;

public class CalculoDni {

    private static final char[] lletres = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
            'H', 'L', 'C', 'K', 'E' };

    public static char calcularLletraDni(int dni){
        char lletraCalculada = lletres[dni % 23];
        return lletraCalculada;
    }
}
