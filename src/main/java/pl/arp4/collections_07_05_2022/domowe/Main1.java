package pl.arp4.collections_07_05_2022.domowe;

/**
 * f. liczby parzyste z zakresu -100 - 100 w tej samej linii oddzielone średnikami
 * g. litery od 'a' do 'z'
 * h. litery od ‘A’ do ‘Z’
 * i. litery od ‘A’ do ‘Z’, tylko co drugą
 * j. litery  od ‘a’ do ‘z’ tylko co drugą zaczynając od ‘b’ i tylko jeśli jej kod ascii jest
 * podzielny przez 5
 * k. ‘Hello  World’  100  razy  przy  każdym  wypisaniu  wypisz  jego  indeks  (numer
 * wypisania) np.
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println("f. liczby parzyste z zakresu -100 - 100 w tej samej linii oddzielone średnikami");
        for (int i = -100; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ";");
            }
        }

        // i+=2 -> i = i + 2
        for (int i = -100; i < 101; i += 2) {
            System.out.print(i + ";");
        }

        System.out.println("g. litery od 'a' do 'z'");
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
        }

        System.out.println("h. litery od ‘A’ do ‘Z’");
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(i);
        }

        System.out.println("i. litery od ‘A’ do ‘Z’, tylko co drugą");
        for (char i = 'A'; i <= 'Z'; i += 2) {
            System.out.println(i);
        }

        System.out.println("j. litery  od ‘a’ do ‘z’ tylko co drugą zaczynając od ‘b’ i tylko jeśli jej kod ascii jest * podzielny przez 5");
        for (int i = 'b'; i <= 'z'; i += 2) {
            if (i % 5 == 0) {
                System.out.println((char)i);
            }
        }

        System.out.println("k. ‘Hello  World’  100  razy  przy  każdym  wypisaniu  wypisz  jego  indeks  (numer * wypisania) np.");
        for (int i = 0; i < 100; i += 1) {
            System.out.println((i+1) + " Hello  World!");
        }
    }
}
