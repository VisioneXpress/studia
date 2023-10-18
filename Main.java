import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        wypiszDzienTygodnia(); // Wywołanie funkcji bez parametru
        wypiszDzienTygodnia(7 ); // Wywołanie funkcji z parametrem
    }

    // Funkcja bez parametru wypisująca aktualny dzień tygodnia
    public static void wypiszDzienTygodnia() {
        LocalDate currentDate = LocalDate.now();
        DayOfWeek currentDayOfWeek = currentDate.getDayOfWeek();
        String dayOfWeek = currentDayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault());
        System.out.println("Dzisiaj jest " + dayOfWeek);
    }

    // Funkcja z parametrem wypisująca dzień tygodnia na podstawie liczby
    public static void wypiszDzienTygodnia(int dayNumber) {
        if (dayNumber >= 1 && dayNumber <= 7) {
            DayOfWeek selectedDayOfWeek = DayOfWeek.of(dayNumber);
            String dayOfWeek = selectedDayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault());
            System.out.println("Dzień tygodnia o numerze " + dayNumber + " to " + dayOfWeek);
        } else {
            System.out.println("Nieprawidłowa liczba. Podaj liczbę od 1 do 7.");
        }
    }
}
