package pl.arp4.console_07_05_2022;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("rozpoczynam działanie");
        //wejscie programu
        Scanner scanner = new Scanner(System.in);
        // Pytamy o imie:
        System.out.println("Podaj swoje immie:");

        //wczytanie z konsoli

        String zmiennaImie = scanner.next();
        System.out.println("Witaj " + zmiennaImie + "!");
    }
}
