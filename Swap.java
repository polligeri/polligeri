package Minden.polligeri;

public class Swap {
    public static void main(String[] args) {
        // Cseréld meg a 2 változó értékét programozás útján.
        // Az a értéke legyen az, ami a b változóban van és fordítva.
        int a = 123;

        int b = 526;

        int tmp;

        tmp = a;
        a = b;
        b = tmp;


        System.out.println(a);
        System.out.println(b);
    }
}