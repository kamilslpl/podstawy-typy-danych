package pl.arp4.collections_07_05_2022;

public class MainFunkcje {
    public static void main(String[] args) {
        int[] tablicaX = new int[]{1, 1, 1};
        int[] tablicaY = new int[]{5, 5, 5, 10};

        wypiszTablice(tablicaX);
        int sumaX = obliczSumeElementow(tablicaX);
        System.out.println("Suma tablica X : " + sumaX);

        wypiszTablice(tablicaY);
        int sumaY = obliczSumeElementow(tablicaY);
        System.out.println("Suma tablica Y : " + sumaY);

    }

    // void - funkcja nic nie zwraca
    private static int obliczSumeElementow(int[] sumowaneElementy) {
        int suma = 0;
        for (int i = 0; i < sumowaneElementy.length; i++) {
            suma = suma + sumowaneElementy[i];
        }

        return suma;
    }

    // void - funkcja nic nie zwraca
    private static void wypiszTablice(int[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
    }
}
