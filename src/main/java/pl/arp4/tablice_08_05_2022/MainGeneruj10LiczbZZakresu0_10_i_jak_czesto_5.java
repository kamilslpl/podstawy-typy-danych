package pl.arp4.tablice_08_05_2022;

import java.util.Arrays;
import java.util.Random;

public class MainGeneruj10LiczbZZakresu0_10_i_jak_czesto_5 {
    public static void main(String[] args) {

        int[] tablica = new int[10];
        int licznik5 = 0;
        for (int i = 0; i < tablica.length; i++) {

            int wylosowanaLiczba = new Random().nextInt(10);
            tablica[i] = wylosowanaLiczba;
            if (wylosowanaLiczba == 5){
                licznik5 = licznik5+1;

            }

        }
        System.out.println(Arrays.toString(tablica));
        System.out.println("Liczba 5 wyszla: " + licznik5 + " razy");
        }
    }
