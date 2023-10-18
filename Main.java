public class Main {

    public static void main(String[] args) {
        obliczStatystyki(2, 4, 6, 8, 10);
        obliczStatystyki(3.5, 1.5, 4.0, 2.0, 5.5);
        obliczStatystyki(1, 2, 3);
    }

    public static void obliczStatystyki(double... liczby) {
        if (liczby.length == 0) {
            System.out.println("Brak danych do obliczeń.");
            return;
        }

        double suma = 0;
        for (double liczba : liczby) {
            suma += liczba;
        }

        double srednia = suma / liczby.length;

        // Sortowanie liczb w celu obliczenia mediany
        java.util.Arrays.sort(liczby);

        double mediana;
        if (liczby.length % 2 == 0) {
            int middle = liczby.length / 2;
            //liczby[middle - 1] oznacza element po lewej stronie środka (gdy liczby są posortowane, to jest to element "niższy").
            //liczby[middle] oznacza element po prawej stronie środka (element "wyższy").
            mediana = (liczby[middle - 1] + liczby[middle]) / 2.0;
        } else {
            int middle = liczby.length / 2;
            mediana = liczby[middle];
        }

        System.out.println("Suma: " + suma);
        System.out.println("Średnia: " + srednia);
        System.out.println("Mediana: " + mediana);
    }
}
