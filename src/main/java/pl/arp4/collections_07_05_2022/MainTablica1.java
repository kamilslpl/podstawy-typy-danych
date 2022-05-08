package pl.arp4.collections_07_05_2022;

import java.util.Random;

public class MainTablica1 {
    public static void main(String[] args) {
        int[] tablica = new int[10];

        // a.
        for (int i = 0; i < tablica.length; i++) {
            // new Random().nextInt(21)      -> losuje od 0 do 21 (bez 21)
            // new Random().nextInt(21) - 10 -> losuje od 0 do 21 (bez 21) odejmując przesuwamy przedział -10 do 11
            int wylosowanaLiczba = new Random().nextInt(21) - 10;

            tablica[i] = wylosowanaLiczba;
        }

        // b.
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }

    }
}
