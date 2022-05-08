package pl.arp4.tablice_08_05_2022;

import java.util.Arrays;
import java.util.Random;

public class MainGeneruj20LiczbZZakresu1_5_i_jak_czesto_2i4 {
    public static void main(String[] args) {

        int[] tablica = new int[20];
        int licznik2 = 0;
        int licznik4 = 0;
        for (int i = 0; i < tablica.length; i++) {
            int wylosowanaLiczba = new Random().nextInt(5)+1;
            tablica[i] = wylosowanaLiczba;
            if (wylosowanaLiczba == 2){
                licznik2 = licznik2+1;
            }
            if (wylosowanaLiczba == 4){
                licznik4 = licznik4+1;
            }
        }
        System.out.println(Arrays.toString(tablica));
        System.out.println("Liczba 2 wyszla: " + licznik2 + " razy");
        System.out.println("Liczba 4 wyszla: " + licznik4 + " razy");
        }
    }
