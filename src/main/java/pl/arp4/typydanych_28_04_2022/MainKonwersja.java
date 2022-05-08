package pl.arp4.typydanych_28_04_2022;

public class MainKonwersja {
    public static void main(String[] args) {
        short zmiennaA = 50;
        int zmiennaAKonwersja = zmiennaA;
        System.out.println(zmiennaAKonwersja);

        short zmiennaB = 50;
        long zmiennaAKonwersja2 = zmiennaB;
        System.out.println(zmiennaAKonwersja2);

        int zmiennaC = 50;
        float zmiennaAKonwersja3 = zmiennaC;
        System.out.println(zmiennaAKonwersja3);

        int zmiennaD = 50;
        double zmiennaAKonwersja4 = zmiennaD;
        System.out.println(zmiennaAKonwersja4);

        long zmiennaE = 3000000058l;
        int zmiennaAKonwersja5 = (int) zmiennaE;
        System.out.println(zmiennaAKonwersja5);

        short zmiennaF = 32000;
        byte zmiennaAKonwersja6 = (byte) zmiennaF;
        System.out.println(zmiennaAKonwersja6);

        char zmiennaG = 50;
        int zmiennaAKonwersja7 = (int) zmiennaG;
        System.out.println(zmiennaAKonwersja7);


    }
}
