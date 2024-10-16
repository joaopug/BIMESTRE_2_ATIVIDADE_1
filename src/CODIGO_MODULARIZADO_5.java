public class CODIGO_MODULARIZADO_5 {
    public static void main(String[] args) {
        String palavra = "arara";

        boolean ehPalindromo = verificadorDaPalavra(palavra);
        String palindrometro = verificadorDaVariavel(palavra, ehPalindromo);

        System.out.println(palindrometro);
    }

    public static boolean verificadorDaPalavra(String palavra) {
        for (int i = 0; i < palavra.length() / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static String verificadorDaVariavel(String palavra, boolean ehPalindromo) {
        if (ehPalindromo) {
            return "A palavra " + palavra + " é um palíndromo";
        } else {
            return "A palavra " + palavra + " não é um palíndromo";
        }
    }
}