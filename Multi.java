public class Multi {

    public static int multiplicar(int a, int b) {
        if (a == 0 || b == 0) { 
            return 0;
        }
        
        if (a == 1) {
            return b;
        } else {
            return b + multiplicar(a - 1, b);
        }
    }

    public static void main(String[] args) {
        System.out.println("3 x 4 = " + multiplicar(3, 4));
    }
}