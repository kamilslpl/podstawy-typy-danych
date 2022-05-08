package pl.arp4.tablice;
import java.util.Scanner;

public class MainLosowanieTablica2SkanerSumowanie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] tablica = new int[10];
        int sumatablicy = 0;
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Podaj "+(i+1)+ " liczbe");
            int wpisanaliczba = scanner.nextInt();

            tablica[i] = wpisanaliczba;
            sumatablicy = sumatablicy + tablica[i];

        }
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] +", ");

        }
        System.out.println("Suma tablicy: " + sumatablicy);
    }
}
