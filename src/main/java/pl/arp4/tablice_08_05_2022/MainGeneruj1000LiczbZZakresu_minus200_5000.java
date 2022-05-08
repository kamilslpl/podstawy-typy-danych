package pl.arp4.tablice_08_05_2022;

import java.util.Arrays;
import java.util.Random;

public class MainGeneruj1000LiczbZZakresu_minus200_5000 {
    public static void main(String[] args) {

        int[] tablica = new int[1000];
        for (int i = 0; i < tablica.length; i++) {
            int wylosowanaLiczba = new Random().nextInt(5201)-200;
            tablica[i] = wylosowanaLiczba;
        }
        System.out.println(Arrays.toString(tablica));
        }
    }
