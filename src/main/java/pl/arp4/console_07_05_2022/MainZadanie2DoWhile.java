package pl.arp4.console_07_05_2022;

import java.util.Scanner;

public class MainZadanie2DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba;
        do {

        System.out.println("Podaj liczbe:");
        liczba = scanner.nextInt();


        }while (liczba>0);

        System.out.println("koniec:");
    }
}
