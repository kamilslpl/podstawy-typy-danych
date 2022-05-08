package pl.arp4.tablice;
import java.util.Scanner;

public class MainLosowanieTablica2SkanerSumowanie_najwiekszy_najmniejszy_element {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] tablica = new int[10];
        int sumatablicy = 0;
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbe");
            int wpisanaliczba = scanner.nextInt();
            tablica[i] = wpisanaliczba;
            sumatablicy = sumatablicy + tablica[i];
        }
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + ", ");
        }
        System.out.println("Suma tablicy: " + sumatablicy);

/*        // szukanie minimum
        int minimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (minimum > tablica[i]) {
                minimum = tablica[i];
            }*/
            // szukanie maks
            int maksimum = tablica[0];
            for (int i = 1; i < tablica.length; i++) {
                if (maksimum < tablica[i]) {
                    maksimum = tablica[i];
                }
            }
           // System.out.println("Minimum: " + minimum);
            System.out.println("Maksimum: " + maksimum);
        }
    }


