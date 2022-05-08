package pl.arp4.collections_07_05_2022;

import java.util.Arrays;
import java.util.Random;

public class ZadanieGenerator4 {
    public static void main(String[] args) {
        int[] tablica = new int[10];

        for (int i = 0; i < tablica.length; i++) {
            int wylosowanaLiczba = new Random().nextInt(10);

            tablica[i] = wylosowanaLiczba;
        }

        System.out.println(Arrays.toString(tablica));

        int licznik = 0;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] == 5) {
                licznik++;
            }
        }
        System.out.println("Wylosowano: " + licznik + " piątek");
    }
}
