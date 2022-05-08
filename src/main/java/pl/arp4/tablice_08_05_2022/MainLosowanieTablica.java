package pl.arp4.tablice_08_05_2022;

import java.util.Random;

public class MainLosowanieTablica {
    public static void main(String[] args) {
int[] tablica = new int[10];
        for (int i = 0; i < tablica.length; i++) {
            int wylosowanaLiczba = new Random().nextInt(21)-10;

            tablica[i] = wylosowanaLiczba;

        }
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);

        }
    }
}
