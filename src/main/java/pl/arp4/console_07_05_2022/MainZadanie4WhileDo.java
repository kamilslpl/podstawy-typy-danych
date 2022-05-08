package pl.arp4.console_07_05_2022;

import java.util.Scanner;

public class MainZadanie4WhileDo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj poczatek zakresu:");
        int poczatekZakresu = scanner.nextInt();

        System.out.println("Podaj koniec zakresu:");
        int koniecZakresu = scanner.nextInt();

        if (poczatekZakresu > koniecZakresu){
            System.out.println("Bledne dane");
                }

        System.out.println("Podaj dzielnik:");
        int dzielnik = scanner.nextInt();

        int i = poczatekZakresu;
        while (i < koniecZakresu +1 ){
        i++;
            if(i % dzielnik == 0){
                System.out.println(i);
        }
        }
    }
}
