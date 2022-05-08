package pl.arp4.tablice;
import java.util.Scanner;

public class MainLosowanieTablica2Skaner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] tablica = new int[10];

        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Podaj "+(i+1)+ " Liczbe");
            int wpisanaliczba = scanner.nextInt();

            tablica[i] = wpisanaliczba;

        }
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] +", ");

        }
    }
}
