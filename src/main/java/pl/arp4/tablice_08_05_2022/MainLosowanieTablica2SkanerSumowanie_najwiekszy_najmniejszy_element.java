package pl.arp4.tablice_08_05_2022;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainLosowanieTablica2SkanerSumowanie_najwiekszy_najmniejszy_element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tablica = new int[10];
        int sumatablicy = 0;
        for (int i = 0; i < tablica.length; i++) {
            // System.out.println("Podaj " + (i + 1) + " liczbe");
            int wylosowanaLiczba = new Random().nextInt(21) - 10;
            tablica[i] = wylosowanaLiczba;
            // int wpisanaliczba = scanner.nextInt();
            //tablica[i] = wpisanaliczba;
            sumatablicy = sumatablicy + tablica[i];
        }
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + ", ");

        System.out.print(tablica[i] + ", ");}
        System.out.println();
        System.out.println("Suma tablicy: " + sumatablicy);

/*        // szukanie minimum
        int minimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (minimum > tablica[i]) {
                minimum = tablica[i];
                System.out.println("Minimum: " + minimum);
            }*/
        // szukanie maks

        int maksimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (maksimum < tablica[i]) {
                maksimum = tablica[i];
            }
        }
        System.out.println("Maksimum: " + maksimum);

        // f. znajdź i wypisz numer komórki największego elementu w tablicy
        int indeksMaksimum = 0;
        int szukaneMaksimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            if (szukaneMaksimum < tablica[i]) {
                szukaneMaksimum = tablica[i];
                indeksMaksimum = i;
            }
        }
        System.out.println("Maksimum o wartości: " + szukaneMaksimum + " znalezione w komórce: " + indeksMaksimum);

        // g. srednia arytmetyczna
        double sredniaryt = ((double) sumatablicy / tablica.length);
        System.out.println("Srednia arytm: " + sredniaryt);

// h. wypisz ilosc elementow wiekszych od sredniej
        System.out.println("h. elementy wieksze od sredniej:");
        int licznikWiekszychElementow = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] > sredniaryt) {
                licznikWiekszychElementow = licznikWiekszychElementow + 1;
                System.out.print(tablica[i] + " ");
            }
        }
        System.out.println();
        System.out.println("ilosc wiekszych elementow od sredniej wynosi: " + licznikWiekszychElementow);

//i. wypisz tablice w odwrotnej kolejnosci
        System.out.println("Tablica w odwrotnej kolejnosci:");
        for (int i = (tablica.length - 1); i >= 0; i--) {


            System.out.print(tablica[i] + "Tablica w odwrotnej kolejnosci");
        }

// sortowanie tablicy
        Arrays.sort(tablica);
        System.out.println();
        System.out.println("Tablica sortowana:" +Arrays.asList(tablica));

        // j. wypisanie mediany (środkowa wartość w tablicy)
        // długość / 2
        // 10 -> 5 (6 element)
        // 11 -> 5 (6 element)
        // 11 elementów -> 0 1 2 3 4 [5] 6 7 8 9 10
        // 10 elementów -> 0 1 2 3 4 5 6 7 8 9 -> 4.5
        double mediana;

        if (tablica.length % 2 == 0) {
            // parzysta liczba elementów
            // 10 -> 5
            // 12 -> 6
            // 100 -> 50
            int indeksSrodkowyElement = tablica.length / 2;

            int wartosc1 = tablica[indeksSrodkowyElement];
            int wartosc2 = tablica[indeksSrodkowyElement - 1];

            mediana = (wartosc1 + wartosc2) / 2.0;
        } else {
            // nieparzysta liczba elementów
            int indeksSrodkowyElement = tablica.length / 2;
            mediana = tablica[indeksSrodkowyElement];
        }
        System.out.println("Mediana: " + mediana);
    }
}




