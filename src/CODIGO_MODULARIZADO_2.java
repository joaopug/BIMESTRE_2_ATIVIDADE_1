public class CODIGO_MODULARIZADO_2 {
    public static void main(String[] args) {
        double celsius = 25;

        double contaLinda = calculo(celsius);

        System.out.println(celsius + " graus Celsius é igual a " + contaLinda + " graus Fahrenheit.");
    }

    public static double calculo(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }
}