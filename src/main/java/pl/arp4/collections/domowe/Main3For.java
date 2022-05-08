package pl.arp4.collections.domowe;

import java.util.Scanner;

/**
 * Napisać program, który wczytuje od użytkownika liczbę całkowitą dodatnią n, a następnie
 * wyświetla  na  ekranie  wszystkie  potęgi  liczby  2  nie  większe,  niż  podana  liczba.
 * Przykładowo,  dla  liczby 71 program  powinien  wyświetlić:
 *     1 2 4 8 16 32 64
 */
public class Main3For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int liczba = scanner.nextInt();

        for (int wynik = 1; wynik < liczba; wynik*=2) {
            System.out.println(wynik);
        }
    }
}
