package pl.arp4.collections;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainTablica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tablica = new int[10];

        // a.
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbę:");
//            int wpisanaLiczba = scanner.nextInt();
            int wpisanaLiczba = new Random().nextInt(21) - 10;

            tablica[i] = wpisanaLiczba;
        }

        // b.
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }

        // c.
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            // tablica[i] to wartość (liczba) w komórce
            suma = suma + tablica[i];
        }
        System.out.println();
        System.out.println("Suma: " + suma);

        // d. szukanie minimum
        int minimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            // jeśli obecne minimum jest większe niż element tablicy
            if (minimum > tablica[i]) {
                // to znaczy że musimy nadpisać minimum
                // znaleźliśmy mniejszy element
                minimum = tablica[i];
            }
        }

        System.out.println("Minimum: " + minimum);

        // e. znajdź i wypisz największy element tablicy
        int maksimum = tablica[0];
        for (int i = 1; i < tablica.length; i++) {
            // jeśli obecne maksimum jest mniejsze niż element tablicy
            if (maksimum < tablica[i]) {
                // musimy nadpisać maksimum elementem tablicy
                maksimum = tablica[i];
            }
        }

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

        // g. średnia arytmetyczna
//        double zmiennaSrednia = ((double)suma) / tablica.length;
        double sumaDouble = suma;
        double zmiennaSrednia = sumaDouble / tablica.length;
        System.out.println("Srednia: " + zmiennaSrednia);

        // h. wypisz ilość elementów większych od średniej
        System.out.println("Elementy większe od średniej: ");
        // dla tablicy:
        // 1 3 5 2 10 13 20 7 = 61
        // średnia = 7,625
        // większych = 3
        int licznikWiekszychElementow = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] > zmiennaSrednia) { // tylko dla elementów większych od średniej
                System.out.print(tablica[i] + " ");
                licznikWiekszychElementow = licznikWiekszychElementow + 1;
            }
        }
        System.out.println("Licznik większych elementów: " + licznikWiekszychElementow);

        // i. wypisz tablicę w odwrotnej kolejności
        // jeśli length = 10 to ostatnia komórka ma numer 9
        // jeśli length = 5 to ostatnia komórka ma numer 4
        // numery komórek które mają się wypisać: 4 3 2 1 0
        for (int i = tablica.length - 1; i >= 0; i--) {
            System.out.print(tablica[i] + " ");
        }

        // sortowanie tablicy
        Arrays.sort(tablica);
        System.out.println();
        System.out.println(Arrays.toString(tablica));

        // j. wypisanie mediany (środkowa wartość w tablicy)
        // długość / 2
        // 10 -> 5 (6 element)
        // 11 -> 5 (6 element)
        // 11 elementów -> 0 1 2 3 4 [5] 6 7 8 9 10
        // 10 elementów -> 0 1 2 3 4 5 6 7 8 9 -> 4.5
        double mediana;

        if (tablica.length % 2 == 0) {
            // parzysta liczba elementów
            // 10/2 -> 5
            // 10 elementów -> 0 1 2 3 [4 5] 6 7 8 9
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
