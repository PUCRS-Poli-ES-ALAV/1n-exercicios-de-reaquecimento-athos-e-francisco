public class Inverter {
    public static String inverter(String str) {
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }
        
        return str.charAt(str.length() - 1) + inverter(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println("Inversão de 'java': " + inverter("java"));
    }
}   