package pl.arp4.tablice_08_05_2022;

import java.util.Random;

public class MainGeneruj100LiczbZZakresu0_50 {
    public static void main(String[] args) {

        int[] tablica = new int[100];
        for (int i = 0; i < tablica.length; i++) {
            int wylosowanaLiczba = new Random().nextInt((100) - 50);
            tablica[i] = wylosowanaLiczba;
       /* }
        for (int i = 0; i < 100; i++) {
        }*/
            System.out.print(tablica[i] + ", ");
        }
    }
}
