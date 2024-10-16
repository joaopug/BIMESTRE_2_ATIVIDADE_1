public class CODIGO_MODULARIZADO_3 {
    public static void main(String[] args) {
        int numero = 7;

        String resultado = verificador(numero);

        System.out.println("O número " + numero + " é " + resultado);
    }

    public static String verificador(int numero) {
        if (numero % 2 == 0) {
            return "par";
        } else {
            return "impar";
        }
    }
}