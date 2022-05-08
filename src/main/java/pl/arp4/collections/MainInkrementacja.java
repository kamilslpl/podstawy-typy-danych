package pl.arp4.collections;

public class MainInkrementacja {
    public static void main(String[] args) {

        int pre = 0;
        int post = 0;
        // mamy dwie instrukcje:
        // - inkrementacja i wypisanie
        System.out.println(pre);    // 0
        System.out.println(++pre);  // 1 - preinkrementacja najpierw dodaje
        System.out.println(pre);    // 1

        System.out.println(post);   // 0
        System.out.println(post++); // 0 - najpierw wypisanie, potem inkrementacja
        System.out.println(post);   // 1
    }
}
