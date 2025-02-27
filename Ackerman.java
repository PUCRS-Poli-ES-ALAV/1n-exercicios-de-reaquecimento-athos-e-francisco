public class Ackerman {
    public static int calcular(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        if (n == 0) {
            return calcular(m - 1, 1);
        }
        
        return calcular(m - 1, calcular(m, n - 1));
    }

    public static void main(String[] args) {
        System.out.println("Ackermann(0, 0) = " + calcular(0, 0));
    }
}