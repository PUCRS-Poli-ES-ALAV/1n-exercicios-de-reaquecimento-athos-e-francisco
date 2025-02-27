public class Sequencia {
    public static int calcularF(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return 2 * calcularF(n - 1) + 3 * calcularF(n - 2);
    }

    public static void main(String[] args) {
        int resultado = calcularF(5);
        System.out.println("Sequencia: " + resultado);
    }
}