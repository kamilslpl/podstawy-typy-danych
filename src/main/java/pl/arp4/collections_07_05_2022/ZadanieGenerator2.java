package pl.arp4.collections_07_05_2022;

import java.util.Arrays;
import java.util.Random;

public class ZadanieGenerator2 {
    public static void main(String[] args) {
        int[] tablica = new int[100];

        for (int i = 0; i < tablica.length; i++) {
            int wylosowanaLiczba = new Random().nextInt(901) + 100;

            tablica[i] = wylosowanaLiczba;
        }

        // b.
        System.out.println(Arrays.toString(tablica));
    }
}
