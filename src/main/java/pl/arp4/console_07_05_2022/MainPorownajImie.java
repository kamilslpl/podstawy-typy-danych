package pl.arp4.console_07_05_2022;

import java.util.Scanner;

public class MainPorownajImie {
    public static void main(String[] args) {

             System.out.println("rozpoczynam działanie");
            //wejscie programu
            Scanner scanner = new Scanner(System.in);
            // Pytamy o imie:
            System.out.println("Podaj swoje immie:");

        String zmiennaImie = scanner.next();
        String marian = "Marian";


        if ( zmiennaImie.equals("Marian")) {
            System.out.println("Siema kolego! Dawno się nie widzieliśmy!");
        }
            else{
                System.out.println(" Witaj " + zmiennaImie);

            }


    }


}
