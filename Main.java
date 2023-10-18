public class Main {
    public static int obliczSilnie(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Silnia jest zdefiniowana tylko dla liczb nieujemnych.");
        }

        if (n == 0) {
            return 1;
        } else {
            int wynik = 1;
            for (int i = 1; i <= n; i++) {
                wynik *= i;
            }
            return wynik;
        }
    }

    public static void main(String[] args) {
        int liczba = 19; // Możesz zmienić tę liczbę na dowolną inną, dla której chcesz obliczyć silnię.
        int wynik = obliczSilnie(liczba);
        System.out.println("Silnia z " + liczba + " wynosi " + wynik);
    }
}
