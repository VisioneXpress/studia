public class Main {
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int fibNMinus2 = 0;
        int fibNMinus1 = 1;
        int fibN = 0;

        for (int i = 2; i <= n; i++) {
            fibN = fibNMinus1 + fibNMinus2;
            fibNMinus2 = fibNMinus1;
            fibNMinus1 = fibN;
        }

        return fibN;
    }

    public static void main(String[] args) {
        int position = 12; // Zmień tę wartość na pozycję w ciągu, którą chcesz obliczyć
        int result = fib(position);
        System.out.println("Liczba na pozycji " + position + " w ciągu Fibonacciego to: " + result);
    }
}
