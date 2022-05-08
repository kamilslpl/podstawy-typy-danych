package pl.arp4.console_07_05_2022;

import java.util.Scanner;

public class MainZadanie3DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz tekst");
        String tekst = scanner.nextLine();

        do {

            System.out.println(tekst.toUpperCase());}
            while (tekst.equals("quite")) ;

        }
    }


