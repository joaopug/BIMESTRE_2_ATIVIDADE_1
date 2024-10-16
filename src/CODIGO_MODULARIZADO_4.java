public class CODIGO_MODULARIZADO_4 {
    public static void main(String[] args) {
        double[] numeros = {10, 20, 30, 40, 50};
        double soma = 0;

        double media = fazerMedia(numeros);

        System.out.println("A média é: " + media);
    }

    public static double rodarVetor(double[] numeros, double soma) {
        for (double numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public static double fazerMedia(double[] numeros) {
        double media = rodarVetor(numeros, 0) / numeros.length;
        return media;
    }
}