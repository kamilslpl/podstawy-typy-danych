package pl.arp4.collections.domowe;

import java.util.Scanner;

/**
 * Napisać program pobierający  od użytkownika dwie liczby całkowite A oraz B, A < B, a
 * następnie wyznaczający sumę ciągu liczb od A do B, czyli sumę ciągu (A,A + 1,...,B).
 * Obliczenia  należy  wykonać  dwukrotnie  stosując  kolejno  pętle:  while, for.
 * <p>
 * <p>
 * Przykład: Dla A = 4 i B = 11 program powinien wyświetlić: 60 60
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj A:");
        int a = scanner.nextInt();
        System.out.println("Podaj B:");
        int b = scanner.nextInt();

        if (b < a) {
            System.err.println("Wprowadzone dane są niepoprawne");
        }

        int suma = 0;
        // 4 11
        // 4 + 5 + 6 ...
        for (int i = a; i <= b; i++) {
            suma = suma + i;
//            suma += i;
        }
        System.out.println(suma);
    }
}
