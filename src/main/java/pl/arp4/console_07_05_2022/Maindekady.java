package pl.arp4.console_07_05_2022;

import java.util.Scanner;

public class Maindekady {
    public static void main(String[] args) {

        System.out.println("rozpoczynam działanie");
        //wejscie programu
        Scanner scanner = new Scanner(System.in);
        // Pytamy o wiek:
        System.out.println("Podaj swoj wiek:");

        //wczytanie z konsoli

        int zmiennawiek = scanner.nextInt();
        System.out.println("Zyjesz juz " + zmiennawiek/10 + " dekad");



    }
}