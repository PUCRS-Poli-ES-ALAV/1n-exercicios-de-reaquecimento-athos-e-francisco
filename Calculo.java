public class Calculo {
    public static double somaHarmonica(int n) {
        if (n == 1) {
            return 1.0;
        }
        return 1.0 / n + somaHarmonica(n - 1);
    }

    public static void main(String[] args) {
        double resultado = somaHarmonica(4);
        System.out.println("Resultado: " + resultado);
    }
}