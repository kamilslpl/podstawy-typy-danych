package pl.arp4.console_07_05_2022;

public class MainZadanie1Petle {
    public static void main(String[] args) {

        // liczby z zakres

        int liczba = 1;
        for (int i = 0; i < 101; i++) {
            System.out.println(i + ", ");
        }
        // liczba 1000 - 1020


        for (int i2 = 1000; i2 < 1021; i2++) {
            System.out.print(i2 + ", ");
        }
// liczby podzielne przez 5 z zakresu -30 - 1000 w nowych liniach

        for (int i3 = -31; i3 < 1001; i3++) {
            if (i3 % 5 == 0){
            System.out.println(i3 + ", ");
        }
        }

// liczby podzielne przez 3 z zakresu 1 - 100 w nowych liniach
        for (int i3 = 1; i3 < 101; i3++) {
            if (i3 % 3 == 0){
                System.out.println(i3 + ", ");
            }
        }
        // liczby podzielne przez 3 oraz 5 z zakresu 30 - 300 w nowych liniach
        for (int i3 = 1; i3 < 101; i3++) {
            if ((i3 % 3 == 0) && (i3 % 5 == 00) ){
                System.out.println(i3 + ", ");
            }
        }

// liczby nieparzyste z zakresu -300 - 300 w tej samej linii oddzielone średnikami
        for (int i3 = -300; i3 < 301; i3++) {
            if ((i3 % 2 != 0)  ){
                System.out.print(i3 + ", ");
            }
        }

    }
}
